import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int flowerAmount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0;

        switch (flower) {
            case "Roses":
                price = 5 * flowerAmount;
                if (flowerAmount > 80) {
                    price =  price - ( price * 0.1 );
                }
                break;
            case "Dahlias":
                price = 3.80 * flowerAmount;
                if (flowerAmount > 90) {
                    price =  price - ( price * 0.15 );
                }
                break;
            case "Tulips":
                price = 2.80 * flowerAmount;
                if (flowerAmount > 80) {
                    price =  price - ( price * 0.15 );
                }
                break;
            case "Narcissus":
                price = 3 * flowerAmount;
                if (flowerAmount < 120) {
                    price =  price + ( price * 0.15 );
                }
                break;
            case "Gladiolus":
                price = 2.50 * flowerAmount;
                if (flowerAmount < 80) {
                    price =  price + ( price * 0.20 );
                }
                break;
        }

        double diss = Math.abs(budget-price);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerAmount, flower, diss);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diss);
        }


    }
}
