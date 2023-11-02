import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int number = 1;
        boolean isBigger = false;

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {

                if (number > num) {
                    isBigger = true;
                    break;
                }

                System.out.printf("%d ", number);
                number++;

            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }







    }
}
