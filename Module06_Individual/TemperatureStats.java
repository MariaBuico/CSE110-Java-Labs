import java.util.Scanner;

public class TemperatureStats {
   public static void main(String[] args) {

      // declare and instantiate a Scanner 
      Scanner scnr = new Scanner(System.in);

      // declare variables
      double t1;
      double t2;
      double t3;
      double t4;

      double min;
      double max;
      double average;
      double range;
      double midpoint;
      double skew;

      // prompt and collect inputs
      System.out.print("Enter first Temperature  : ");
      t1 = scnr.nextDouble();

      System.out.print("Enter second Temperature : ");
      t2 = scnr.nextDouble();

      System.out.print("Enter third Temperature  : ");
      t3 = scnr.nextDouble();

      System.out.print("Enter fourth Temperature : ");
      t4 = scnr.nextDouble();

      // compute minimum and maximum using Math.min and Math.max
      min = Math.min(Math.min(t1, t2), Math.min(t3, t4));
      max = Math.max(Math.max(t1, t2), Math.max(t3, t4));

      // compute average
      average = (t1 + t2 + t3 + t4) / 4.0;

      // compute range
      range = max - min;

      // compute midpoint
      midpoint = (min + max) / 2.0;

      // compute skew as percentage of range
      skew = ((average - midpoint) / range) * 100.0;

      // output results (one blank line before results)
      System.out.println();

      System.out.printf("Min     : %.1f\n", min);
      System.out.printf("Max     : %.1f\n", max);
      System.out.printf("Average : %.1f\n", average);
      System.out.printf("Skew    : %.1f%%\n", skew);
      System.out.printf("Range   : %.1f\n", range);
   }
}