import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());




        for (int i = 1111; i <= 9999; i++) {

            int num1 = i / 1000;
            int num2 = i / 100 % 10;
            int num3 = i / 10 % 10;
            int num4 = i % 10;

            boolean number1 = n % num1 == 0;
            boolean number2 = num2 != 0 && n % num2 == 0;
            boolean number3 = num3 != 0 && n % num3 == 0;
            boolean number4 = num4 != 0 && n % num4 == 0;

            if (number1 && number2 && number3 && number4){
                System.out.printf("%d ",i);
            }

        }





    }
}
