import java.util.Scanner;

public class CourseInfo {
   public static void main(String[] args) {

      // declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);

      // declare variables
      String fullInfo;
      String subject;
      String courseNumberStr;
      String sectionNumberStr;
      String title;

      int courseNumber;
      int sectionNumber;

      // prompt for and collect input
      System.out.print("Enter course info : ");
      fullInfo = scnr.nextLine();

      // compute required information

      // find first space
      int firstSpace = fullInfo.indexOf(" ");

      // find second space
      int secondSpace = fullInfo.indexOf(" ", firstSpace + 1);

      // find third space
      int thirdSpace = fullInfo.indexOf(" ", secondSpace + 1);

      // extract subject
      subject = fullInfo.substring(0, firstSpace);

      // extract course number (as String first)
      courseNumberStr = fullInfo.substring(firstSpace + 1, secondSpace);

      // extract section number (as String first)
      sectionNumberStr = fullInfo.substring(secondSpace + 1, thirdSpace);

      // extract title (rest of the string)
      title = fullInfo.substring(thirdSpace + 1);

      // convert course number and section number to int
      courseNumber = Integer.parseInt(courseNumberStr);
      sectionNumber = Integer.parseInt(sectionNumberStr);

      // output results
      System.out.println();
      System.out.println("Subject        : " + subject);
      System.out.println("Course Number  : " + courseNumber);
      System.out.println("Section Number : " + sectionNumber);
      System.out.println("Course Title   : " + title);
   }
}