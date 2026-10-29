package com.wissen.demo;

public class Calculator {
    public static void main(String[] args) {
    	System.out.println("Starting Calculator......"); //Comment uncomment to test github webhook
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            System.exit(1);
        }
        
        double param1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double param2 = Double.parseDouble(args[2]);
        double result = 0;
        
        switch (operator) {
            case "+": result = param1 + param2; break;
            case "-": result = param1 - param2; break;
            case "*": result = param1 * param2; break;
            case "/": 
                if (param2 == 0) {
                    System.out.println("Error: Division by zero");
                    System.exit(1);
                }
                result = param1 / param2; 
                break;
            default: 
                System.out.println("Error: Invalid operator");
                System.exit(1);
        }
        System.out.println("Result: " + result);
    }
}