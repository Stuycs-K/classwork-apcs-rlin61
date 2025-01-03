public class main{
    public static void main(String[] args){
      //fib(46);
      makeWords(2, "", "abc");
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
    public static void makeWords(int remainingLetters, String result, String alphabet){
      // use loop through alphabet
    for (int i = 0; i < alphabet.length(); i++){
      alphabet.get(i)
    }
}
  }
