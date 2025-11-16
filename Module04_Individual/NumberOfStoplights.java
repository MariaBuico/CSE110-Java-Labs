import java.util.Scanner;

public class Stoplights {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
        
      // Below this comment: declare any variables you may need
      double miles;
      int lanes;
      int intersections;
      int stoplights;
      double cost;
      int stoplightsPerIntersection;

      // Below this comment: collect the requried inputs from the user
      System.out.print("Enter the number of miles of road      : ");
      miles = scnr.nextDouble();

      System.out.print("Enter the number of lanes on this road : ");
      lanes = scnr.nextInt();

      // Below this comment: compute and store the required output values
      intersections = (int) miles;     
      stoplightsPerIntersection = 2 + lanes;      
      stoplights = intersections * stoplightsPerIntersection;
      cost = stoplights * 25000.0;       

      // Below this comment: disply the required results
      System.out.printf("\nNumber of intersections : %d\n", intersections);
      System.out.printf("Number of stoplights    : %d\n", stoplights);
      System.out.printf("Cost of stoplights      : $%.2f\n", cost);
      
   }
}