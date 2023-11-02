import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double needMoney = Double.parseDouble(scan.nextLine());
        double availableMoney = Double.parseDouble(scan.nextLine());

        int spendDays = 0;
        int days = 0;

        while (availableMoney < needMoney) {

            if (spendDays == 5) {
                break;
            }

            String command = scan.nextLine();
            double currentMoney = Double.parseDouble(scan.nextLine());

            days++;

            if (command.equals("save")) {
                availableMoney = availableMoney + currentMoney;
                spendDays = 0;
            } else if (command.equals("spend")){
                spendDays++;
                availableMoney = availableMoney - currentMoney;

            }

            if (availableMoney < 0) {
                availableMoney = 0;
            }

        }

        if (spendDays == 5) {
            System.out.printf("You can't save the money.%n");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
