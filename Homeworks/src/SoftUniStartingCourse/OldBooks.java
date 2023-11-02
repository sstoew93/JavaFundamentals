import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String book = scan.nextLine();
        String check = scan.nextLine();
        int countBooks = 0;
        while ( !check.equals(book) ) {

            if (check.equals("No More Books")) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", countBooks);
                break;
            }

            countBooks++;



            check = scan.nextLine();
        }

        if (check.equals(book)) {
            System.out.printf("You checked %d books and found it.", countBooks);

        }


    }
}
