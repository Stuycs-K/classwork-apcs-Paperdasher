public class Point{
    private double x,y;
  
    public String toString(){
      return "(" + x + ", " + y + ")";
    }
  
    //Initialize this Point to have the same values as the other Point.
    public Point(Point other){
      //COMPLETE THIS SECOND
      //Then write test cases.
      x = other.x;
      y = other.y;
    }
  
    //Initialize this Point to have the provided values
    public Point(double x, double y){
      this.x=x;
      this.y=y;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
  
    /*
    Write this method FOURTH, go to the main and do that one first.
    */
    public double distanceTo(Point other){
      double xdist = Math.pow(other.getX() - x, 2);
      double ydist = Math.pow(other.getY() - y, 2);
      return Math.pow( xdist + ydist, .5);
    }
  
    /*
    Write this method last. Re-use (NOT COPY/PASTE) prior work and
    do not write redundant code.
    */
    public static double distance(Point a, Point b){
      double xdist = Math.pow(b.x - a.x, 2);
      double ydist = Math.pow(b.y - a.y, 2);
      return Math.pow(xdist + ydist, .5);
    }
  
  
  }