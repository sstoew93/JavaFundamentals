import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());




        for (int i = 1; i <= tabs ; i++) {

            String website = scan.nextLine();

            if (website.equals("Facebook")) {
                salary = salary - 150;
            } else if (website.equals("Instagram")) {
                salary = salary - 100;
            } else if (website.equals("Reddit")) {
                salary = salary - 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }

        }

        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }





    }
}
