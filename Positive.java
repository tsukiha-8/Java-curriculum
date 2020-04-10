import java.util.Scanner;

class Positive {
   public static void main(String args[]){
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();

    if (n > 0){
       System.out.println("その値は正です。");
    }else{
       System.out.println("その値は0か負です。");
    }
  }
}