import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a = scanner.nextDouble();
        System.out.println("Nhap b : ");
        b = scanner.nextDouble();
        System.out.println("Nhap b : ");
        c = scanner.nextFloat();

        if (a != 0){
            double answer = (c - b)/ a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
        else {
            if (b == 0){
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
