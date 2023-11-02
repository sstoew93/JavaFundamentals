import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int left = 0;
        int right = 0;

        for (int i = 1; i <=n*2 ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i <= n) {
                left = left + number;
            } else {
                right = right + number;
            }
        }

        if (left == right) {
            System.out.printf("Yes, sum = %d", left);
        } else {
            System.out.printf("No, diff = %d", Math.abs(left-right));
        }

    }
}
