import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            int pens = Integer.parseInt(scan.nextLine());
            int marker = Integer.parseInt(scan.nextLine());
            int liter = Integer.parseInt(scan.nextLine());
            double discount = Integer.parseInt(scan.nextLine());

            double penprice = pens * 5.80;
            double markerprice = marker * 7.20;
            double literprice = liter * 1.20;
            double discount1 = discount / 100.0;
            double fullprice = penprice + markerprice + literprice;
            double lastprice = fullprice - ( fullprice * discount1);

        System.out.println(lastprice);
    }
}





