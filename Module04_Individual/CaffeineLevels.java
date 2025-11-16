import java.util.Scanner;

public class Caffeine { 
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in); 
      double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.  
      
      System.out.print("Enter caffeine amount (in mg) : ");
      caffeineMg = scnr.nextDouble(); 
         
      // Below this comment: declare any variables you may need
      double SixHours;
      double TwelveHours;
      double EighteenHours;
      
      // Below this comment: compute and store the required output values
      SixHours = caffeineMg / 2;
      TwelveHours = SixHours / 2;
      EighteenHours = TwelveHours / 2;

      // Below this comment: disply the required results
      System.out.printf("After 6 hours  : %.2f mg\n", SixHours);
      System.out.printf("After 12 hours : %.2f mg\n", TwelveHours);
      System.out.printf("After 18 hours : %.2f mg\n", EighteenHours);
      
   }
}