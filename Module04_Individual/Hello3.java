import java.util.Scanner;

public class HelloJava3 {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      // Below this comment: declare any variables you may need
      String firstName;
      // Below this comment: collect the required inputs
      System.out.print("Enter your first name : ");
      firstName = scnr.nextLine();
      // Below this comment: output the correct output
      System.out.println("Hello " + firstName);

   }
}
