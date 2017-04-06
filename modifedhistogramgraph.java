
import java.util.Scanner;
/*
 * Modify histogramgraph.java
 */
 
public class ModifiedHistogram
{
   public static void main (String [] args)
   {
      int[] ranges = new int [10];
      int box;
      Scanner scan = new Scanner (System.in);

      System.out.println ("Enter multiple numbers between 0 and 100.");
      System.out.print ("To end, type any number greater than 100" );

      int entered = scan.nextInt ();
      while (entered >= 1 && entered <= 100)
      {
         box = (entered - 1) / 10;
         ranges[box] ++;
         entered = scan.nextInt ();
      }

      // print histogram - a star for every 5 elements
      for (box = 0; box < 10; box++)
      {
         System.out.print ((10 * box + 1) + "-");
         System.out.print ((10 * box + 10) + "\t|");
         for (int count = 5; count <= ranges[box]; count+=5)
            System.out.print ("*");
         System.out.println ();
      }

   }
}
