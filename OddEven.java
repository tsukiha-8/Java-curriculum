import java.util.Scanner;

class OddEven {
   public static void main(String args[]){

    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();

    if (n > 0){
       if (n % 2 == 0){
          System.out.print(n + "は偶数です。");
       }else{
          System.out.print(n + "は奇数です。");
       }
    }else{
       System.out.print(n + "は整数ではありません。");
    }
  }
}