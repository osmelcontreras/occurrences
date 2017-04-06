import java.util.Scanner;

/*
  Creates a histogram that allows you to visually
 inspect the frequency distribution of a set of values. 
 Reads the number of integers 
 that are in the range 1 to 100 inclusive;
 Print one asterisk for each value entered.
 */
public class Histogram {
	public static void main(String[] args) {
		int[] ranges = new int[10];  //array of 10
		int box;
		Scanner scan = new Scanner(System.in); //takes user input 

		System.out.println("Enter mupliple numbers between 0 and 100.");
		System.out.print("To end, type any number greater than 100");

		int i = scan.nextInt();    //user's number input 
		while (i >= 1 && i <= 100) {  
			box = (i - 1) / 10;
			ranges[box]++;
			i = scan.nextInt(); 
		}
		for (box = 0; box < 10; box++) {   //for loop to print the histogram
			System.out.print((10 * box + 1) + "-");
			System.out.print((10 * box + 10) + "\t|");
			for (int count = 0; count < ranges[box]; count++)
				System.out.print("*");
			System.out.println();
		}

	}
}
