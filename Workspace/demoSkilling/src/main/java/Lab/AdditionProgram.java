package Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdditionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input1:");
        String input1 = scanner.nextLine();

        System.out.println("Enter input2:");
        String input2 = scanner.nextLine();

        try {
            double result = addNumbers(input1, input2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        scanner.close();
    }

    public static double addNumbers(String input1, String input2) {
        double num1 = parseInput(input1);
        double num2 = parseInput(input2);
        return num1 + num2;
    }

    private static double parseInput(String input) {
        if (input.startsWith("minus ")) {
            double num = parseInput(input.substring(6));
            return -num;
        }

        try {
            double num = Double.parseDouble(input);
            return num;
        } catch (NumberFormatException e) {
            return parseStringInput(input.toLowerCase());
        }
    }

    private static double parseStringInput(String input) {
        Map<String, Double> numMapping = new HashMap<>();
        numMapping.put("zero", 0.0);
        numMapping.put("one", 1.0);
        numMapping.put("two", 2.0);
        numMapping.put("three", 3.0);
        numMapping.put("four", 4.0);
        numMapping.put("five", 5.0);
        numMapping.put("six", 6.0);
        numMapping.put("seven", 7.0);
        numMapping.put("eight", 8.0);
        numMapping.put("nine", 9.0);
        numMapping.put("ten", 10.0);

        if (numMapping.containsKey(input)) {
            return numMapping.get(input);
        } else {
            throw new NumberFormatException("Invalid input: " + input);
        }
    }
}
