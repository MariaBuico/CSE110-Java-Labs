import java.util.Scanner;

public class Paint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int height;
      int width;

      // collect your input(s)
      System.out.print("Enter wall height (feet) : ");
      height = scnr.nextInt();

      System.out.print("Enter wall width (feet)  : ");
      width = scnr.nextInt();

      // compute the required output(s)
      int area = height * width;
      double gallons = area / 350.0;
      int cans = (int)Math.ceil(gallons);

      // display the output(s)
      System.out.println();
      System.out.println("Wall area : " + area + " square feet");
      System.out.printf("Paint needed : %.2f gallons\n", gallons);
      System.out.printf("Cans needed : %d can(s)\n", cans);
   }
}
