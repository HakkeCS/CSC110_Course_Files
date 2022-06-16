/*-------------------------------------------------------------------------
// AUTHOR: Jake Conrad
// FILENAME: Lab2
// SPECIFICATION: String manipulation
// FOR: CSE 110- Lab #2
// TIME SPENT: ~20 minutes
//--------------------------------------------------------------------------*/
import java.util.Scanner;


public class Lab2 {

    public static void main(String[] args){
        String firstName, lastName, fullName;
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        firstName = scan.nextLine();
        System.out.println("Please enter last name: ");
        lastName = scan.nextLine();

        fullName = firstName + " " + lastName;

        fullName = fullName.toUpperCase();

        nameLength = fullName.length();

        System.out.println("Full name(in capitals): " + fullName);
        System.out.println("Length of full name: " + nameLength);

        // Define two String variables, title1 and title2 using
        // String constructor to initialize them
        String title1 = new String("cse110");
        String title2 = "cse110";
        // Compare the two strings and print which one of the two ways works
        // follow code below:
        if (title1 == title2) {
            // Print "String comparison using "==" sign works"
            System.out.println("String comparison using '==' sign works");
        } else {
            // Print "String comparison using "==" sign does NOT work”
            System.out.println("String comparison using '==' does NOT work");
        }
        if (title1.equals(title2)) {
            // Print "String comparison using "equals" method works"
            System.out.println("String comparison using 'equals' method works");
        } else {
            // Print "String comparison using "equals" method does NOT work"
            System.out.println("String comparison using 'equals' does NOT work");
        }

        scan.close();

    }
}
