package Exercise;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
        double a, b, c; // To hold three sides

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        a = sc.nextInt();

        System.out.print("Enter Side 2: ");
        b = sc.nextInt();

        System.out.print("Enter Side 3: ");
        c = sc.nextInt();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of triangle is " + area);

	}

}
