import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        int sum = 1;

        while (sum <= input) {

            System.out.println(sum);

            sum = sum * 2 + 1;



        }




    }
}
