public class fib{
  public static void main(String[] args){
    System.out.println(fib(Integer.parseInt(args[0])));
    //fib(Integer.parseInt(args[0]));
  }

  public static int fib(int n){
    int sum = 0;
    if(n < 2){
      return n;
    }
    else{
      sum = fib(n - 1) + fib(n - 2);
    }
    return sum;
  }


}
