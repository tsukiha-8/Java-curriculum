import java.util.Random;
import java.util.Scanner;

class RandomArrayDisp64 {
                  public static void main(String[] args){
                  	Random rand = new Random();
                  	Scanner stdIn = new Scanner(System.in);
                  	
                  	System.out.print("óvëfêîÅF");
                  	int n = stdIn.nextInt();
                  	int[] a = new int[n];
                  	for (int i = 0; i < n; i++){
                  		a[i] = 1 + rand.nextInt(10);
                  	}
                  	
                  	
                  	for(int j = 10; j > 0; j--){
                  		for (int i = 0; i < n; i++){
                  			if(j <= a[i]){
                  				System.out.print("* ");
                  			}else{
                  				System.out.print("  ");
                  			}
                  		}
                  		System.out.println();
                  	}
                  	
                  	
                  	for (int i = 0; i < n; i++){
                  		System.out.print("--");
                  	}
                  	System.out.println();
                  	
                  	
                  	for(int i = 0; i < n; i++){
                  		System.out.print(i % 10 + " ");
                  	}
                  }
}