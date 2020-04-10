import java.util.Scanner;

class Season {
   public static void main(String args[]){
    
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("今月は何月ですか。");
    int n = stdIn.nextInt();
    
    if (n >= 3 && n <= 5){
       System.out.print("季節は春です。");
    } else if (n >= 6 && n <= 8){
       System.out.print("季節は夏です。");
    } else if (n >= 9 && n <=11 ){
       System.out.print("季節は秋です。");
    } else if (n == 12 || n == 1 || n==2){
       System.out.print("季節は冬です。");
    } else{
       System.out.print("その季節はありません。");
    }
  }
}