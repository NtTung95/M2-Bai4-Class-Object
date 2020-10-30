import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
