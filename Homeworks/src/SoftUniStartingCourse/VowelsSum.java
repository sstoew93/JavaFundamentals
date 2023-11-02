import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int vowelsSum = 0;

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            switch (symbol) {
                case 'a':
                    vowelsSum += 1;
                    break;
                case 'e':
                    vowelsSum += 2;
                    break;
                case 'i':
                    vowelsSum += 3;
                    break;
                case 'o':
                    vowelsSum += 4;
                    break;
                case 'u':
                    vowelsSum += 5;
                    break;
            }

        }
        System.out.println(vowelsSum);


    }
}
