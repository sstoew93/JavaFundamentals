import java.util.Scanner;

public class RadiansToDegrees {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radian = Double.parseDouble(scan.nextLine());

        double degree = ( radian * 180 ) / Math.PI;

        System.out.println(degree);



    }
}
