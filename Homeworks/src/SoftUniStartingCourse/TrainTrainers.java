import java.util.Scanner;

public class TrainTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int countGrades = 0;
        double sumAllGrades = 0;

        while (!input.equals("Finish")){

            double sumGradesPerPresentation = 0;

            for (int i = 1; i <= countPeople ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGradesPerPresentation += currentGrade;

                sumAllGrades += currentGrade;

                countGrades++;

            }

            double averageGradePerPresentation = sumGradesPerPresentation / countPeople;



            System.out.printf("%s - %.2f.%n", input, averageGradePerPresentation);


            input = scanner.nextLine();
        }



        double averageStudentsGrade = sumAllGrades / countGrades;

        System.out.printf("Student's final assessment is %.2f.", averageStudentsGrade);
    }
}