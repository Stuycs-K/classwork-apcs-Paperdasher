/*  Overriding the getName method in the Bird subclass, the speak method called the redefined
 getName from the Bird class.
*/
/* The Bird name = new Animal(...) didn't work because Bird is-a Animal, so Bird is a subclass of Animal.
This means that Animal cannot be stored in the Bird variable type. 
Also since the Bird object has more properties than the Animal object, having a new Animal is insufficient to become a Bird type.  */ 

public class Driver{
    public static void main(String[] args){
      Animal sheep = new Animal("Baa", 4, "Shaun");
      sheep.speak();
      System.out.println("--------");
      Bird bluejay = new Bird("chirp", 3, "bob", 2.4, "blue");
      bluejay.speak();
      System.out.println("-----------");

      Animal a1 = new Animal("ribbit", 6, "froggie");
      a1.speak();
      System.out.println("---------");
      Bird b1 = new Bird("pawk pawk", 7, "chickens", 34.6, "white");
      b1.speak();
      System.out.println("--------------");
      // Bird b2 = new Animal("roar", 21, "lion");
      Animal a2 = new Bird("chirppy", 2, "birdie", 1.8, "yellow");
      a2.speak();
    }
}
