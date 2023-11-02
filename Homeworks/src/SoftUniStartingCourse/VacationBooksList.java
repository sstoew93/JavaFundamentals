import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            int pagesperbook = Integer.parseInt(scan.nextLine());
            int pagesperhour = Integer.parseInt(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());

            int fulltime = pagesperbook / pagesperhour;
            double hoursperday =  fulltime / days * 1.0;

        System.out.println(hoursperday);
    }

}
