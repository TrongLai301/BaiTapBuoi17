package ThucHanh1;

import java.util.Scanner;

public class CalculateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter firstOperand: ");
        int firstOperand = scanner.nextInt();
        System.out.print("Enter secondOperand: ");
        int secondOperand = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Operator: ");
        String operatorString = scanner.nextLine();
        char operator = operatorString.charAt(0);
        System.out.println("Result is: "+Calculator.calculate(firstOperand, secondOperand, operator));
//        Calculator calculator = new Calculator();
//        calculator.calculate(firstOperand,secondOperand,operator);
    }
}
