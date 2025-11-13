import java.util.Scanner;

public class OutputFormatting {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double displacement;
		int amountCompleted;
      
      displacement = scnr.nextDouble();
		amountCompleted = scnr.nextInt();

      System.out.printf("%11e%%\n", displacement);
      System.out.printf("%.6f%%\n", displacement);
      System.out.printf("%o%%\n", amountCompleted);

   }
}