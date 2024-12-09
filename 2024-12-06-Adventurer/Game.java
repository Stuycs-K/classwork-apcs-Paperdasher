import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);

    Adventurer p1 = new Warrior(userName);
    Adventurer p2 = new CodeWarrior("Computer");

    System.out.println("Welcome to the game " + userName);
    System.out.println("Type: a or attack to attack your opponent, sp/special to use a special attack, su/support to heal yourself, or quit to stop the game.");
    while (True){
      System.out.println("What action would you like to take this turn?");
      String option = userInput.nextLine();

      if (option.equals("quit")){
        return;
      }
      else if(option.equals("a") || option.equals("attack")){
        System.out.println(p1.attack(p2));
      }
      else if(option.equals("sp") || option.equals("special")){
        System.out.println(p1.specialAttack(p2));
      }
      else if(option.equals("su") || option.equals("support")){
        System.out.println(p1.support());
      }
      else{
        System.out.println("You didn't enter an acceptable action. Please re-enter your action.");
      } //write loop to make user input correctly

      if(p2.getHP() > 0){
        int compchoice = (int)(Math.random() * 3);
        if (compchoice == 0){
          System.out.println(p2.attack(p1));
        }
        else if(compchoice == 1){
          System.out.println(p2.specialAttack(p1));
        }
        else{
          System.out.println(p2.support());
        }
      }
      else{
        System.out.println("The computer died! " + userName + " wins the battle!");
        return;
      }
    }
  }
}
