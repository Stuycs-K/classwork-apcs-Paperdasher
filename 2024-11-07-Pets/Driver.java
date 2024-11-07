public class Driver{
    public static void main(String[] args){
      Animal sheep = new Animal("Baa", 4, "Shaun");
      sheep.speak();
      System.out.println("--------");
      Bird bluejay = new Bird("chirp", 3, "bob", 2.4, "blue");
      bluejay.speak();
    }
}
