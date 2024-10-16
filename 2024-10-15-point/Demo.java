public class Demo{
    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b){
      double xdist = Math.pow(b.getX() - a.getX(), 2);
      double ydist = Math.pow(b.getY() - a.getY(), 2);
      return Math.sqrt(xdist + ydist);
    }
  
    public static void main(String[]args){
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      Point p4 = new Point(p1);
      Point equi1 = new Point(0,0);
      Point equi2 = new Point(1,0);
      Point equi3 = new Point(0.5, 0.5 * Math.sqrt(3));
      System.out.println(p4);
      System.out.println(p3);
      System.out.println( distance(p1,p2));
      System.out.println( Point.distance(p1,p2));
      System.out.println( p1.distanceTo(p2));
      System.out.println( distance(p3,p4));
      System.out.println( Point.distance(p3,p4));
      System.out.println( p3.distanceTo(p4));
      System.out.println(equi1.distanceTo(equi2));
      System.out.println(equi2.distanceTo(equi3));
      System.out.println(equi3.distanceTo(equi1));
    }
  }