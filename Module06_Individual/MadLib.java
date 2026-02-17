import java.util.Scanner;

public class MadLib {
   public static void main(String[] args) {
      // declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);

      // declare and initialize variables
      int num1;
      int num2;
      double num3;
      String noun;
      String properName;
      String verb;
      String adjective1;
      String adjective2;

      // prompt for and collect inputs
      System.out.print("Enter a whole number : ");
      num1 = scnr.nextInt();

      System.out.print("Enter another whole number : ");
      num2 = scnr.nextInt();

      System.out.print("Enter any number : ");
      num3 = scnr.nextDouble();

      scnr.nextLine(); // consume the leftover newline

      System.out.print("Enter a noun : ");
      noun = scnr.nextLine();

      System.out.print("Enter proper name : ");
      properName = scnr.nextLine();

      System.out.print("Enter a verb : ");
      verb = scnr.nextLine();

      System.out.print("Enter an adjective : ");
      adjective1 = scnr.nextLine();

      System.out.print("Enter another adjective : ");
      adjective2 = scnr.nextLine();

      // output required results (single newline at the very end)
      System.out.printf(
         "One day, %d %s(s) wanted to cross a bridge over a river. Under that bridge lived a(n) %s Troll weighing %.2f pounds, with %d eyes and %s hair, named %s. %s said to the %s(s) \"%s away, or I will have to eat you!\".%n",
         num1, noun, adjective1, num3, num2, adjective2, properName, properName, noun, verb
      );
   }
}