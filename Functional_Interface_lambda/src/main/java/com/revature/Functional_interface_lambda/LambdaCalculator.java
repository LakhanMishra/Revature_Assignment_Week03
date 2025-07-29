package com.revature.Functional_interface_lambda;

public class LambdaCalculator {
    public static void main(String[] args) {
        Calculator calc = (a, b, operation) -> {
            switch (operation.toLowerCase()) {
                case "add":
                    return a + b;
                case "subtract":
                    return a - b;
                case "multiply":
                    return a * b;
                case "divide":
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                        return 0;
                    }
                    return a / b;
                default:
                    System.out.println("Invalid operation.");
                    return 0;
            }
        };
        double num1 = 20;
        double num2 = 10;

        System.out.println("Addition: " + calc.operate(num1, num2, "add"));
        System.out.println("Subtraction: " + calc.operate(num1, num2, "subtract"));
        System.out.println("Multiplication: " + calc.operate(num1, num2, "multiply"));
        System.out.println("Division: " + calc.operate(num1, num2, "divide"));
    }
}
