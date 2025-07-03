package javaonlypractice;

import java.util.Scanner;

public class java7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator=sc.next();

        int result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    result = num1 / num2;  
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
