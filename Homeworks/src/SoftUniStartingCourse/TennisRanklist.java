import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tournaments = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());

        int pointsSum = startPoints;
        int wins = 0;
        int finals = 0;
        int semi = 0;

        for (int i = 1; i <= tournaments; i++) {

            String stage = scan.nextLine();

            switch (stage) {
                case "W":
                    pointsSum += 2000;
                    wins++;
                    break;
                case "F":
                    pointsSum += 1200;
                    finals++;
                    break;
                case "SF":
                    pointsSum += 720;
                    semi++;
                    break;
            }
        }

        int average = (pointsSum - startPoints) / tournaments;
        double winRate = (wins * 1.00 / tournaments) * 100;

        System.out.printf("Final points: %d%n", pointsSum);
        System.out.printf("Average points: %d%n", average);
        System.out.printf("%.2f%%", winRate);
    }
}
