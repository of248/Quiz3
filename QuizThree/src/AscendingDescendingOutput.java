import java.util.Arrays;
import java.util.Scanner;


public class AscendingDescendingOutput {

	public static void main(String[] args) {

		int numInput;
	
		Scanner keyboard = new Scanner(System.in); 
        System.out.println("How many numbers will you input (up to 50)?");
        numInput = keyboard.nextInt();
        int[] asc = new int[numInput];
      
        
        for (int i=0; i<numInput; i++){
        System.out.print("Enter Value " +(i+1) + ":");
        asc[i]= keyboard.nextInt();
       
        
        }
        
        AscendingMethod(asc);
        DescendingMethod(asc);
	}

	public static void AscendingMethod(int[] asc){
		
		System.out.print("Ascending Order: ");
		
		for(int i = 0; i < asc.length; i++) {
		    Arrays.sort(asc);
		    System.out.print(" " + asc[i]);
		}
		
			
	}

	public static void DescendingMethod(int[] asc){
		
		System.out.print(" Descending order:");
		
		for(int i=asc.length-1; i>= 0; i--){
			Arrays.sort(asc);
			System.out.print(" " + asc[i]);
		}
	}
}