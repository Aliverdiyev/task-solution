package if_switch;

import java.util.Scanner;

/*
Write a program to input week day number and print week day
*/
public class Weekday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week: ");
        int dayOfWeek = sc.nextInt();
//        if-else statements
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println(dayOfWeek + " not a week day");
        }
//        Switch statements
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(dayOfWeek + " not a week day");
        }

// pro
        System.out.print("Enter a week day number (1-7): ");
        int dayNum = sc.nextInt();
        String[] weekdays = {"Invalid", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayNum >= 1 && dayNum <= 7) {
            System.out.println("Today is " + weekdays[dayNum]);
        } else {
            System.out.println("Invalid week day number. Please enter a number between 1 and 7.");
        }
        sc.close();
    }
}