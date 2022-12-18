package Exercise;

import java.util.Scanner;

public class Circle {
		public static void main(String[] args) {
			int radius;
			double circumference;
			double area;
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter radius: ");
			radius = s.nextInt();
			circumference = 2 * Math.PI * radius;
			area = Math.PI * radius * radius;
			
			System.out.println("The circumference of circle is:" + circumference);
			System.out.println("The area of circle is:" + area);

			
		}


}
