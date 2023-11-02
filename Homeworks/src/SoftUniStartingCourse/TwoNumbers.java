import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int countCombination = 0;

        for (int num1 = start; num1 <= end; num1++) {
            for (int num2 = start; num2 <= end; num2++) {

                sum = num1 + num2;

                countCombination++;

                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination,num1,num2,magicNumber);
                return;
                }

            }

        }

        System.out.printf("%d combinations - neither equals %d",countCombination,magicNumber);

    }
}
