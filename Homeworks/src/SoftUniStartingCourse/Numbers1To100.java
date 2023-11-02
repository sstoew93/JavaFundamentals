import java.util.Scanner;

public class Numbers1To100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int n = num; num >= 1; num++) {
            System.out.println(num);
        }

    }
}
