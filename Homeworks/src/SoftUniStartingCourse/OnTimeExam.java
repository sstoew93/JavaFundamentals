import java.util.Scanner;

public class OnTimeExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startHour = Integer.parseInt(scan.nextLine());
        int startMin = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMin = Integer.parseInt(scan.nextLine());

        int examTotal = startHour * 60 + startMin;
        int arriveTotal = arriveHour * 60 + arriveMin;

        int diff = Math.abs(examTotal - arriveTotal);

        if (arriveTotal > examTotal) {
            System.out.println("Late");
            if(diff < 60){
                System.out.printf("%d minutes after the start", diff);
            }else {

                int hour = diff / 60;
                int minute = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minute);
            }

        }else  if( diff <= 30){
            System.out.println("On time");

            if (diff != 0){
                System.out.printf("%d minutes before the start", diff);
            }

        }else {
            System.out.println("Early");
            if (diff < 60){
                System.out.printf("%d minutes before the start", diff);
            }else {

                int hour = diff / 60;
                int minute = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minute);


            }

        }


    }
}
