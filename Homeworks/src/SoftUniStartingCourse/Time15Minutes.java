import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totalMin = hours * 60 + minutes + 15;

        int finalHour = totalMin / 60;
        int finalMin = totalMin % 60;

        if (finalHour >= 24){
            finalHour = 0;
            System.out.printf("%d:%02d", finalHour, finalMin);
        } else {
            System.out.printf("%d:%02d", finalHour, finalMin);
        }

    }
}