import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();

        int freeSpace = width*length*height;
        int needSpace = 0;

        while (!command.equals("Done")) {

        int input = Integer.parseInt(command);

        needSpace += input;

        if (freeSpace <= needSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", needSpace-freeSpace);
            break;
        }

        command = scan.nextLine();

        }

        if ( freeSpace >= needSpace  ) {
            System.out.printf("%d Cubic meters left.", freeSpace - needSpace);
        }

    }
}
