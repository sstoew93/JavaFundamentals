import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int timeEP = Integer.parseInt(scan.nextLine());
        int timeBreak = Integer.parseInt(scan.nextLine());

        double lunchTime = timeBreak * 0.125;
        double sleep = timeBreak * 0.25;
        double timeLeft = timeBreak - lunchTime - sleep;
        double freeTime = Math.ceil(Math.abs( timeEP - timeLeft ));

        if ( timeLeft >= timeEP ) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, freeTime);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, freeTime);
        }

    }
}
