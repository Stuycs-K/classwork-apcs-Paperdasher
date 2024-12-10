import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter username: ");
    String userName = userInput.nextLine();

    System.out.println("\nWelcome to the game, " + userName  + "!");
    System.out.println("Would you like to be a mighty warrior(w), or a savvy CodeWarrior(c)?");
    System.out.print("USER INPUT: ");
    boolean first_input = true;

    int charchoice = -1;
    while(first_input){
      String userchar = userInput.nextLine();
      if (userchar.equals("w")){
        charchoice = 0;
        first_input = false;
      }
      else if(userchar.equals("c")){
        charchoice = 1;
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
    
    System.out.println("\nYou have options. You can do a normal attack, a special attack which is stronger than a normal attack but also consumes mana, support yourself to heal and gain some mana, or quit to end the game.");
    System.out.println("\nRemember: type (a)ttack, (sp)ecial, (su)pport, or quit.");
    while (p1.getHP() > 0 && p2.getHP() > 0){
      System.out.println("----------------------------------");
      System.out.println(userName + "'s turn!\n");
      System.out.println("CURRENT STATS FOR " + userName + ":" + " " + p1.getHP() + "/" + p1.getmaxHP() + "HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " mana");
      System.out.println("CURRENT STATS FOR COMPUTER: " + p2.getHP() + "/" + p2.getmaxHP() + "HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " mana");

      System.out.println("\nWhat action would you like to take this turn?");
      System.out.print("USER INPUT: ");

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
        System.out.println("\n############");
        System.out.println("\nComputer's turn!\n");
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
        System.out.println("\n\n\nDid something happen???\n\n\n... \n\n\nThe computer died! " + userName + " wins the battle!");
        return;
      }

      if(p1.getHP() <= 0){
        System.out.println("Oh my, it isn't looking so good.\n\n\n ... \n\n\n" + userName + " died. The computer wins the battle. Better luck next time.");
      }
    }
    userInput.close();
  }
}
