package ifswitch;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week: ");
        int dayOfWeek = sc.nextInt();
//        if-else statements
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
//        Switch statements
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