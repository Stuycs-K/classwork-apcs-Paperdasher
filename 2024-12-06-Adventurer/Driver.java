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
        return;
      }
      else
        if (p1.getHP() <= 0){
          System.out.println("\n" + p2.getName() + " has won the duel!");
          return;
        }
        else{
          System.out.println("\n" + p1.getName() + " has won the duel!");
          return;}
    }
}

