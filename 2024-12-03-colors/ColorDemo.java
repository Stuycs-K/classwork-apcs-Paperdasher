public class ColorDemo{
  public static final String RESET = "\u001b[0m";
  public static int BOLD = 1;
  public static void main(String[] args){
    System.out.print("\u001b[1;92;43m");
    System.out.println("cccccc    ssssss");
    System.out.println("cccccc    sss   ");
    System.out.println("cc        sss   ");
    System.out.println("cc        ssssss");
    System.out.println("cc           sss");
    System.out.println("cc           sss");
    System.out.println("cccccc    ssssss");
    System.out.println("cccccc    ssssss");



    System.out.print(RESET);
  }
}
