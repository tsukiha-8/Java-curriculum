import java.util.Scanner;

class DisplayAsterisk {
   public static void main(String args[]){
    
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("何個'*'を表示しますか。");
    int n = stdIn.nextInt();
    
    if (n >= 100 || n < 0){
       System.out.print("0～99までの数字を入力してください");
    } else { for ( int i = 0; i < n; i++){
                 System.out.print('*');
             }
             System.out.println();
    }
  }
}