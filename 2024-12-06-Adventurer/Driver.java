public class Driver{
    public static void main(String[] args){
      Adventurer p1 = new Warrior("A", 100, 4);
      Adventurer p2 = new Warrior("B", 100, 20);
      
      System.out.println("\n\n------THE BATTLE BEGINS!------");
  
      System.out.println("\nTURN 1");
      System.out.println(p1.attack(p2));
      System.out.println(p2.attack(p1));

      System.out.println("\nTURN 2");
      System.out.println(p1.support());
      System.out.println(p2.support(p1));

      System.out.println("\nTURN 3");
      System.out.println(p1.attack(p2));
      System.out.println(p2.support());

      System.out.println("\nTURN 4");
      System.out.println(p1.specialAttack(p2));
      System.out.println(p2.specialAttack(p1));

      System.out.println("\nTURN 5");
      System.out.println(p1.support());
      System.out.println(p2.specialAttack(p1));

  
      if (p1.getHP() <= 0 && p2.getHP() <= 0){
        System.out.println("\nBoth players have died. Whomp whomp :(");
      }
      else if (p1.getHP() <= 0){
        System.out.println("\n" + p2.getName() + " has won the duel! Maybe next time " + p1.getName() + "!");
      }
      else{
        System.out.println("\n" + p1.getName() + " has won the duel! Maybe next time " + p2.getName() + "!");
      }
    
      Adventurer p3 = new Warrior("A", 50, 30);
      Adventurer p4 = new Warrior("B", 200, 6);
      
      System.out.println("\n\n------THE SECOND BATTLE BEGINS!------");
  
      System.out.println("\nTURN 1");
      System.out.println(p3.attack(p4));
      System.out.println(p4.attack(p3));

      System.out.println("\nTURN 2");
      System.out.println(p3.support());
      System.out.println(p4.support());

      System.out.println("\nTURN 3");
      System.out.println(p3.specialAttack(p4));
      System.out.println(p4.support());

      System.out.println("\nTURN 4");
      System.out.println(p3.specialAttack(p4));
      System.out.println(p4.specialAttack(p3));

      System.out.println("\nTURN 5");
      System.out.println(p3.specialAttack(p4));
      System.out.println(p4.specialAttack(p3));

  
      if (p3.getHP() <= 0 && p4.getHP() <= 0){
        System.out.println("\nBoth players have died. Whomp whomp :(");
      }
      else if (p3.getHP() <= 0){
        System.out.println("\n" + p4.getName() + " has won the duel! Maybe next time " + p3.getName() + "!");
      }
      else{
        System.out.println("\n" + p3.getName() + " has won the duel! Maybe next time " + p4.getName() + "!");
      }
  }
}

