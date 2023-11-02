import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupCount = Integer.parseInt(scan.nextLine());


        int people = 0;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;

        double musala = 0;
        double monblan = 0;
        double kili = 0;
        double k2 = 0;
        double eve = 0;

        for (int i = 1; i <= groupCount; i++) {

            int number = Integer.parseInt(scan.nextLine());

            if (number <= 5) {
                group1 = group1 + number;
            } else if (number <= 12) {
                group2 = group2 + number;
            } else if (number <= 25) {
                group3 = group3 + number;
            } else if (number <= 40) {
                group4 = group4 + number;
            } else {
                group5 = group5 + number;
            }

            people = people + number;

            musala = group1 * 1.00 / people * 100;
            monblan = group2 * 1.00  / people * 100;
            kili = group3 * 1.00 / people * 100;
            k2 = group4 * 1.00 / people * 100;
            eve = group5 * 1.00 / people * 100;
        }



        System.out.printf("%.2f%%%n", musala);
        System.out.printf("%.2f%%%n", monblan);
        System.out.printf("%.2f%%%n", kili);
        System.out.printf("%.2f%%%n", k2);
        System.out.printf("%.2f%%", eve);
    }
}
