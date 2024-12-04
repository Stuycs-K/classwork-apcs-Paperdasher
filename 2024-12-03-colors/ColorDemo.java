public class ColorDemo{
  public static final String RESET = "\u001b[0m";
  public static int BOLD = 1;
  public static void main(String[] args){
    System.out.print("\u001b[1;30m");
    System.out.print("\u001b[48;2;"+0+";"+255+";"+0+"m");
    System.out.println("......    ......");
    System.out.print("\u001b[48;2;"+30+";"+255+";"+30+"m");
    System.out.println("......    ...   ");
    System.out.print("\u001b[48;2;"+60+";"+255+";"+60+"m");
    System.out.println("...       ...   ");
    System.out.print("\u001b[48;2;"+90+";"+255+";"+90+"m");
    System.out.println("..        ......");
    System.out.print("\u001b[48;2;"+120+";"+255+";"+120+"m");
    System.out.println("..           ...");
    System.out.print("\u001b[48;2;"+150+";"+255+";"+150+"m");
    System.out.println("..           ...");
    System.out.print("\u001b[48;2;"+180+";"+255+";"+180+"m");
    System.out.println("......    ......");
    System.out.print("\u001b[48;2;"+210+";"+255+";"+210+"m");
    System.out.println("......    ......");



    System.out.print(RESET);
  }
}
