import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String command = scan.nextLine();

        int prime = 0;
        int nonPrime = 0;

        while (!command.equals("stop")) {

            int number = Integer.parseInt(command);

            boolean isPrime = true;

            if(number < 0){
                System.out.println("Number is negative.");
                command = scan.nextLine();
                continue;
            }

            for (int i = 2; i < number ; i++) {

                if(number % i == 0){
                    nonPrime += number;
                    isPrime = false;
                    break;
                }

            }

            if (isPrime){
                prime += number;
            }

            command = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrime);
    }
}
