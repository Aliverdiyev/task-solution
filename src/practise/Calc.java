package practise;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        char calculator;
        Calc calc = new Calc();  //for method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arithmetic operator (+,-,*,/):");
        calculator = sc.next().charAt(0);
        switch (calculator) {
            // addition
            case '+':
                System.out.println("Enter the numbers:");
                System.out.println(calc.add(sc.nextInt(), sc.nextInt()));
                break;
            // subtraction
            case '-':
                System.out.println("Enter the numbers:");
                System.out.println(calc.sub(sc.nextInt(), sc.nextInt()));
                break;
            // multiplication
            case '*':
                System.out.println("Enter the numbers:");
                System.out.println(calc.mul(sc.nextInt(), sc.nextInt()));
                break;
            // division
            case '/':
                System.out.println("Enter the numbers:");
                System.out.println(calc.div(sc.nextInt(), sc.nextInt()));
                break;
            default:
                System.out.println("error, select operator again");
                break;
        }
    }

    //methodAddition
    public int add(int x, int y) {
        return x + y;
    }

    //methodSubtraction
    public int sub(int x, int y) {
        return x - y;
    }

    //methodMultiplication
    public int mul(int x, int y) {
        return x * y;
    }

    //methodDivision
    public int div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new RuntimeException("error");
        }
    }
}
//REBOOT