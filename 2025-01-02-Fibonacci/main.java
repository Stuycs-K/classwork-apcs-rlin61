public class main{
    public static void main(String[] args){
      fib(46);
    }
    public static int fib(int n){
      int sum = 0;
      if (n == 0 || n == 1){
        sum += n;
      }
      else {
        sum += fib(n -1) + fib(n -2);
      }
      return sum;
    }
  }
  