import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int result = 0;
        for (int i = 1; i <= num; i++) {

            int number = Integer.parseInt(scan.nextLine());
            result =  result + number;


        }
        System.out.println(result);

    }
}
