import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap Chieu Cao (m): ");
        float height = scanner.nextFloat();

        System.out.print("Nhap Can Nang (kg): ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * height);

        System.out.printf("%-20s %s", "bmi", "Interpretation \n");

        if ( bmi >= 30.0 ){
            System.out.printf("%-20.3f %s", bmi, "Obese");
        } else if ( bmi >= 25.0 ) {
            System.out.printf("%-20.3f %s", bmi, "Overweight");
        } else if ( bmi >= 18.5 ) {
            System.out.printf("%-20.3f %s", bmi, "Normal");
        }
    }
}