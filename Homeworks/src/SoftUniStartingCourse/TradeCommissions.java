import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double com = 0;


        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    com = 0.05;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 500 && sales <= 1000) {
                    com = 0.07;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 1000 && sales <= 10000) {
                    com = 0.08;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 10000) {
                    com = 0.12;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales < 0) {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    com = 0.045;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 500 && sales <= 1000) {
                    com = 0.075;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 1000 && sales <= 10000) {
                    com = 0.1;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 10000) {
                    com = 0.13;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales < 0) {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    com = 0.055;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 500 && sales <= 1000) {
                    com = 0.08;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 1000 && sales <= 10000) {
                    com = 0.12;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales > 10000) {
                    com = 0.145;
                    double result = sales*com;
                    System.out.printf("%.2f", result);
                } else if (sales < 0) {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }




    }
}
