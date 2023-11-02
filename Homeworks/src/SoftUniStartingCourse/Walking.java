import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int stepsSum = 0;

        while (!command.equals("Going home")) {

            int steps = Integer.parseInt(command);

            stepsSum += steps;

            if (stepsSum >= 10000) {
                break;
            }

            command = scan.nextLine();

        }

            if (command.equals("Going home")) {
                int toHome = Integer.parseInt(scan.nextLine());
                stepsSum = stepsSum + toHome;
            }

        if (stepsSum >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", stepsSum-10000);
        } else  {
            System.out.printf("%d more steps to reach goal.", Math.abs(10000- stepsSum));
        }

    }
}
