import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            int nylon = Integer.parseInt(scan.nextLine());
            int paint = Integer.parseInt(scan.nextLine());
            int razre = Integer.parseInt(scan.nextLine());
            int hours = Integer.parseInt(scan.nextLine());

            double nylonprice = ( nylon + 2 ) * 1.50;
            double paintprice = ( paint + paint * 0.1 ) * 14.50;                     // boq+ 10% ot kolichestvoto
            double razreprice = razre * 5.00;


            double fullmaterials = nylonprice + paintprice +razreprice + 0.40;
            double work = ( fullmaterials * 0.3 ) * hours;
            double finalprice = fullmaterials + work;



        System.out.println(finalprice);
    }

}
