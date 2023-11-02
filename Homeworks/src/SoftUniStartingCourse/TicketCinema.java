import java.util.Scanner;

public class TicketCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movieName = scanner.nextLine();

        int totalTickets = 0;
        int totalKidTickets = 0;
        int totalStudentTickets = 0;
        int totalStandardTickets = 0;

        while (!movieName.equals("Finish")){

            int countFreeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();

            int countTicketsPerMovie = 0;


            while (!ticketType.equals("End")){
                countTicketsPerMovie ++;

                switch (ticketType){

                    case "kid":
                        totalKidTickets++;
                        break;

                    case "student":
                        totalStudentTickets++;
                        break;

                    case "standard":
                        totalStandardTickets ++;
                        break;

                }

                if(countTicketsPerMovie == countFreeSeats ){
                    break;
                }


                ticketType = scanner.nextLine();
            }

            totalTickets += countTicketsPerMovie;

            double percentFilled = (countTicketsPerMovie * 1.0 / countFreeSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFilled);


            movieName = scanner.nextLine();
        }


        double percentKidTickets = totalKidTickets * 1.0 / totalTickets * 100;
        double percentStandardTickets = totalStandardTickets * 1.0 / totalTickets * 100;
        double percentStudentTickets = totalStudentTickets * 1.0 / totalTickets * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidTickets);
    }
}
