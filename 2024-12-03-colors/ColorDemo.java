public class ColorDemo{
  public static void main(String args[]){
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[1;38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }
    System.out.print("\u001b[0m");
  }

  public static void sleep(int milli){
        try{
                Thread.sleep(milli);
        }catch(Exception e){
        }
  }

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }


}
