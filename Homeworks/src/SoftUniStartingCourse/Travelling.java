import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();

        while (!destination.equals("End")) {

            double neededMoney = Double.parseDouble(scan.nextLine());

            double sumMoney = 0;

            while (  neededMoney>sumMoney) {

                double savedMoney = Double.parseDouble(scan.nextLine());

                sumMoney += savedMoney;

            }

                System.out.printf("Going to %s!%n", destination);

            destination = scan.nextLine();
        }

    }
}
