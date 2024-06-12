package if_switch;

import java.util.Scanner;

/*
Write a Java program that takes a number and prints out ("Today is <dayOfWeek>") to which day of the week
it is according to the number (note  Monday is 1 st day of the week ) , otherwise print “Not a week day” .
(use if  else statements and  switch statements)
*/
public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// simple version
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = sc.nextInt();
        if (dayNumber == 1) {
            System.out.println("Today is Monday");
        } else if (dayNumber == 2) {
            System.out.println("Today is Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Today is Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Today is Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Today is Friday");
        } else if (dayNumber == 6) {
            System.out.println("Today is Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Today is Sunday");
        }

        System.out.println("Enter the number of the day of the week: ");
        int dayOfWeek = sc.nextInt();
// if-else statement version-2
        if (dayOfWeek == 1) {
            System.out.println("Monday is the " + dayOfWeek + "st day of the week");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday is the " + dayOfWeek + "nd day of the week");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday is the " + dayOfWeek + "nd day of the week");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday is the " + dayOfWeek + "nd day of the week");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday is the " + dayOfWeek + "nd day of the week");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday is the " + dayOfWeek + "nd day of the week");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday is the " + dayOfWeek + "nd day of the week");
        } else {
            System.out.println(dayOfWeek + " not a week day");
        }
//   Switch statement
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday is the " + dayOfWeek + "st day of the week");
                break;
            case 2:
                System.out.println("Tuesday is the " + dayOfWeek + "nd day of the week");
                break;
            case 3:
                System.out.println("Wednesday is the " + dayOfWeek + "rd day of the week");
                break;
            case 4:
                System.out.println("Thursday is the " + dayOfWeek + "th day of the week");
                break;
            case 5:
                System.out.println("Friday is the " + dayOfWeek + "th day of the week");
                break;
            case 6:
                System.out.println("Saturday is the " + dayOfWeek + "th day of the week");
                break;
            case 7:
                System.out.println("Sunday is the " + dayOfWeek + "th day of the week");
                break;
            default:
                System.out.println(dayOfWeek + " not a week day");
        }
    }
}