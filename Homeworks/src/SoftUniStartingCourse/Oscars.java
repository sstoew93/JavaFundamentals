import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actor = scan.nextLine();
        double pointsStart = Double.parseDouble(scan.nextLine());
        int examiners = Integer.parseInt(scan.nextLine());

        double pointsSum = pointsStart;

        for (int i = 1; i <= examiners; i++) {

            String examinerName = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());

            pointsSum = pointsSum + (examinerName.length() * points / 2);


            if (pointsSum > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, pointsSum);
                break;
            }
        }

        if (pointsSum < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - pointsSum);
        }

    }
}
