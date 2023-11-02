import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            double budget = Double.parseDouble(scan.nextLine());
            int cards = Integer.parseInt(scan.nextLine());
            int processor = Integer.parseInt(scan.nextLine());
            int ram = Integer.parseInt(scan.nextLine());


            double cardPrice = cards * 250;
            double processorPrice = processor * ( cardPrice * 0.35 );
            double ramPrice = ram * ( cardPrice * 0.10 );
            double fullPrice = cardPrice + processorPrice + ramPrice;

        if ( cards > processor) {
            fullPrice = fullPrice - fullPrice * 0.15;
        }
            double diff = Math.abs(fullPrice - budget);

            if ( budget >= fullPrice ) {
                System.out.printf("You have %.2f leva left!", diff);
            } else {
                System.out.printf("Not enough money! You need %.2f leva more!", diff);
            }

    }

}
