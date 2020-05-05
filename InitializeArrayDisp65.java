import java.util.Random;
import java.util.Scanner;

class InitializeArrayDisp65 {
                  public static void main(String[] args){
                  	Scanner stdIn = new Scanner(System.in);
                  	
                  	System.out.print("óvëfêîÅF");
                  	int n = stdIn.nextInt();
                  	int[] a = new int[n];

                  	for (int i = 0; i < n; i++){
                  		System.out.print("a[" + i + "] = ");
                  	int point = stdIn.nextInt();
                  		a[i] = point;
                  	}
                  		System.out.print("a = {");
                  			for( int i = 0; i < (n - 1); i++){
                  				System.out.print(a[i] + ", ");
                  			}
                  			System.out.print(a[n - 1] + "}");
                  }
}