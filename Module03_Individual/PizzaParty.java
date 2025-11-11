import java.util.Scanner;

public class PizzaParty {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      // Below this comment: declare any variables you may need
      System.out.print("Number of pizzas purchased : ");
      int pizzaNum = scnr.nextInt();
      System.out.print("Number of slices per pizza : ");
      int pizzaSlices = scnr.nextInt();
      System.out.print("Number of adults           : ");
      int adults = scnr.nextInt();
      System.out.print("Number of children         : ");
      int children = scnr.nextInt();
   
      // Below this comment: collect the required inputs
      // be sure to declare any variables you will need to store each input
      int totalSlices;
      int slicesPerAdult;
      int remainingSlices;
      int slicesPerChild;
      int leftOvers;
      
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      // Be sure to break down complex computations into simpler computations,
      // and store the intermediate values in variables that you can use for further computations.
      totalSlices = pizzaNum * pizzaSlices;
      slicesPerAdult = adults * 2;
      remainingSlices = totalSlices - slicesPerAdult;
      slicesPerChild = remainingSlices / children;
      leftOvers = remainingSlices % children;
      
      // Below this comment: output the correct output values that you computed above
      // make sure that your outputs are formatted exactly like the Expected Outputs in the Test Data examples
      System.out.println("Number of slices each child will get is : " + slicesPerChild);
      System.out.println("Number of slices left over is           : " + leftOvers);
      
   }
}