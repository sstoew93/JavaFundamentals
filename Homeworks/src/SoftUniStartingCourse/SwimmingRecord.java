import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            double record = Double.parseDouble(scan.next());
            double meters = Double.parseDouble(scan.next());
            double timePer1 = Double.parseDouble(scan.next());

            double time = meters * timePer1;
            double slow = (Math.floor( meters / 15 )) * 12.5;
            double fullTime = time + slow;

            double diff = Math.abs(fullTime - record);

            if( record > fullTime ) {
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", fullTime);
            } else {
                System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
            }

    }
}
