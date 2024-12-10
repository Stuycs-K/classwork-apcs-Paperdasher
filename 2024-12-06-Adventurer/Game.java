import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);

    System.out.println("Welcome to the game, " + userName);
    System.out.println("Would you like to be a mighty warrior(w), or a savvy CodeWarrior(c)?");
    boolean first_input = true;

    int charchoice = -1;
    String charchoiced = "";
    while(first_input){
      String userchar = userInput.nextLine();
      if (userchar.equals("w") || userchar.equals("c")){
        charchoiced = userchar;
        first_input = false;
      }
      else{
        System.out.println("Your input is invalid. Please choose either the input w or c.");
      }
    }

    Adventurer p1, p2;
    if(charchoice == 0){
      p1 = new Warrior(userName);
      p2 = new CodeWarrior("Computer");  
      first_input = false;
    }
    else{
      p2 = new Warrior("Computer");
      p1 = new CodeWarrior(userName);
      first_input = false;
    }
    

    System.out.println("Type: a or attack to attack your opponent, sp/special to use a special attack, su/support to heal yourself, or quit to stop the game.");
    while (p1.getHP() > 0 && p2.getHP() > 0){
      System.out.println("CURRENT STATS FOR " + userName + ":" + " " + p1.getHP() + "/" + p1.getmaxHP() + "HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " mana");
      System.out.println("CURRENT STATS FOR COMPUTER: " + p2.getHP() + "/" + p2.getmaxHP() + "HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " mana");

      System.out.println("What action would you like to take this turn?");

      boolean method = true;
      String option = "";
      while (method){
        option = userInput.nextLine();
        if (option.equals("quit") || option.equals("a") || option.equals("attack") || 
        option.equals("sp") || option.equals("special") || option.equals("su") || option.equals("support")){
          method = false;
        }
        else{
          System.out.println("Your input was not a valid option. Please re-enter a valid action. The valid inputs are a, attack, sp, special, su, support, quit.");
        }
      }

      if (option.equals("quit")){
        return;
      }
      else if(option.equals("a") || option.equals("attack")){
        System.out.println(p1.attack(p2));
      }
      else if(option.equals("sp") || option.equals("special")){
        System.out.println(p1.specialAttack(p2));
      }
      else{
        System.out.println(p1.support());
      }

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

      if(p1.getHP() <= 0){
        System.out.println(userName + " died. The computer wins the battle. Better luck next time.");
      }
    }
  }
}
