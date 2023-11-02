import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String grade = scan.nextLine();

        int nights = days - 1;

        double price = 0;

        switch (type) {
            case "room for one person":
                price = nights * 18;

                break;
            case "apartment":
                price = nights * 25;
                if (nights < 10) {
                    price = price - (price * 0.3);
                } else if (nights <= 15) {
                    price = price - (price * 0.35);
                } else if (nights > 15) {
                    price = price - (price * 0.5);
                }

                break;
            case "president apartment":
                price = nights * 35;
                if (nights < 10) {
                    price = price - (price * 0.1);
                } else if (nights <= 15) {
                    price = price - (price * 0.15);
                } else if (nights > 15) {
                    price = price - (price * 0.2);
                }
                break;
        }

        if (grade.equals("positive")) {
            price = price + price*0.25;
        } else if (grade.equals("negative")) {
            price = price - price*0.1;
        }

        System.out.printf("%.2f", price);

    }
}
