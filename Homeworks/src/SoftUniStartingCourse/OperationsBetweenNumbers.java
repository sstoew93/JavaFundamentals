import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();


        if (operation.equals("+")) {
            double result = num1 + num2;
            if (result % 2 == 0){
                System.out.printf("%s + %s = %.0f - even", num1, num2, result);
            } else {
                System.out.printf("%s + %s = %.0f - odd", num1, num2, result);
            }

        } else if (operation.equals("-")) {
            double result = num1 - num2;
            if (result % 2 == 0){
                System.out.printf("%s - %s = %.0f - even", num1, num2, result);
            } else {
                System.out.printf("%s - %s = %.0f - odd", num1, num2, result);
            }
        } else if (operation.equals("*")) {
            double result = num1 * num2;
            if (result % 2 == 0){
                System.out.printf("%s * %s = %.0f - even", num1, num2, result);
            } else {
                System.out.printf("%s * %s = %.0f - odd", num1, num2, result);
            }
        } else if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %s by zero", num1);
            } else {
                double result = num1 * 1.0 / num2;
                System.out.printf("%s / %s = %.2f", num1, num2, result);
            }
        } else if (operation.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %s by zero", num1);
            } else {
                double result = num1 % num2;
                System.out.printf("%s %% %s = %.0f", num1, num2, result);
            }
        }

    }
}

