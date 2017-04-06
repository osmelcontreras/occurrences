import java.util.InputMismatchException;
import java.util.Scanner;

/* Modify the program "integers.java"so 
 * that it works for numbers in the range between −25 and 25.
*/

public class ModifiedIntegers {

	public static void main(String arg[]) {
		int[] numbers = new int[51];	// initializes a list of 51
		int count = 0;
		numbers[0]= 0; 
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Type any interger from -25 to 25: ");
			try {
				int i = input.nextInt();
				if (i >=-25 && i <= 25) {
					//numbers[count]=i;
					numbers[i+25]++;
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
			for (int x = -25; x <= 25; x++)
				if (numbers[x+25] > 1)
				System.out.println("Entered: "+x + "\t#Of Times: "+ numbers[x+25]);
				
			}
				
	}
}

