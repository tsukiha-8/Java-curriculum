import java.util.Scanner;

class AverageCast {
  public static void main(String args[]) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("三つの整数の合計値と平均値を出します。");
    System.out.print("xの値："); int x = stdIn.nextInt();
    System.out.print("yの値："); int y = stdIn.nextInt();
    System.out.print("zの値："); int z = stdIn.nextInt();

    int sum = x + y + z;
    System.out.println("xとyとzの合計値は" + sum + "です。");

    double ave = (double)sum / 3;
    System.out.println("xとyとzの平均値は" + ave + "です。");
  }
}