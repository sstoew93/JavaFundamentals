import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            double priceEks = Double.parseDouble(scan.nextLine());
            int puzzle = Integer.parseInt(scan.nextLine());
            int doll = Integer.parseInt(scan.nextLine());
            int bear = Integer.parseInt(scan.nextLine());
            int minion = Integer.parseInt(scan.nextLine());
            int truck = Integer.parseInt(scan.nextLine());


            // smqtam si pulnata suma za igrachkite i broi igrachki
            int toys = puzzle + doll + bear + minion + truck;
            double pricePuzzle = puzzle * 2.60;
            double priceDoll = doll * 3.00;
            double priceBear = bear * 4.10;
            double priceMinion = minion * 8.20;
            double priceTruck = truck * 2.00;
            double fullPrice = pricePuzzle + priceDoll + priceBear + priceMinion + priceTruck;


                if (toys >= 50) {
                    fullPrice =  fullPrice - fullPrice * 0.25;
                }

                double rent = fullPrice * 0.1;
                double profit = fullPrice - rent;
                double finalSum = profit - priceEks;
                double needed = priceEks - profit;
                if( profit >= priceEks) {
                    System.out.printf("Yes! %.2f lv left.", finalSum);
                } else {
                    System.out.printf("Not enough money! %.2f lv needed.", needed);
                }






    }

}


