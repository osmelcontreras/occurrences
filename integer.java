import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/* 
 Reads an arbitrary number of integers from 0 to 50 inclusive and counts how many occurrences of each 
 are entered. Then, print all of the values (with the number of occurrences) that were entered one or more times.
 */

public class Integers {

	public static void main(String arg[]) {
		
		int[] numbers = new int[51];	// initializes a list of 51
		int count = 0;
		numbers[0]= 0; 
		Scanner input = new Scanner(System.in);
		
		while (true) {

			System.out.println("Type any interger from 0-50: ");
			try {
				int i = input.nextInt();
				if (i >=0 && i <= 50) {
					//numbers[count]=i;
					numbers[i]++;
				}
//				if(numbers[count]==i)
//					System.out.println(count+count);
				
			} catch (InputMismatchException e) {
				 
					System.out.println("Input Error!! Use only numbers. Try again!");  //if user inputs anything else, and not numbers
				break;  
			}
			 
			//System.out.println(numbers[0]);
			System.out.println("Here are the count of integers entered: ");
			if (numbers[0] != 0)
				System.out.println("Number entered: "+ numbers[0]);
////			
			for (int x = 0; x <= 50; x++)
				if (numbers[x] > 0 && numbers[x]<=50)
				System.out.println("Entered: "+x + "\t#Of Times: "+ numbers[x]);
				
			}
				
	}
}
