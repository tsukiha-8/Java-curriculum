import java.util.Random;
import java.util.Scanner;

class MakeRandArray610 {
                  public static void main(String[] args){
                  	Random rand = new Random();
                  	Scanner stdIn = new Scanner(System.in);
                  	
                  	System.out.print("—v‘f”F");
                  	int n = stdIn.nextInt();
                  	int[] a = new int[n];
                  	for (int i = 0; i < n; i++){
                  		a[i] = 1 + rand.nextInt(10);
                  		
                  		if(i != 0 && a[i] == a[i-1]){
                  			for (int j = i; a[j] == a[i-1]; j++){
                  				a[i] = 1 + rand.nextInt(10);
                  			}
                  		}
                  			System.out.print(a[i]);
                  	}
                  }
}
