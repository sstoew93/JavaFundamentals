import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < number) {

            int num = Integer.parseInt(scan.nextLine());
            sum = sum + num;

        }

        System.out.println(sum);





    }
}
