import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            int time1 = Integer.parseInt(scan.nextLine());
            int time2 = Integer.parseInt(scan.nextLine());
            int time3 = Integer.parseInt(scan.nextLine());
            int fullTime = time1 + time2 + time3;
            int mins = fullTime / 60;
            int secs = fullTime % 60;
            if (secs < 10) {
                System.out.printf("%d:0%d", mins, secs );
            } else {
                System.out.printf("%d:%d", mins, secs);
        }

    }
}
