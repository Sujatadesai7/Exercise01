package Exercise;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        int length, width, height, numberOfDoors, numberOfWindows;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();
 
        System.out.print("Enter width: ");
        width = sc.nextInt();
        
        System.out.print("Enter height: ");
        height = sc.nextInt();
        
        System.out.print("Enter number of doors: ");
        numberOfDoors = sc.nextInt();
        
        System.out.print("Enter number of windows: ");
        numberOfWindows = sc.nextInt();

        int totalSurfaceArea = 2 * (length * width + length
                * height + width * height);

        int areaOfFloor = length * width;
        
        int areaOfDoors = 20 * numberOfDoors;
        
        int areaOfWindows = 15 * numberOfWindows;
        
        int totalPaintArea = totalSurfaceArea - areaOfFloor
                - areaOfDoors - areaOfWindows;
        
        int requiredPaint = totalPaintArea / 350;

        System.out.println("Paint required "
                + requiredPaint + " gallons.");
    }

}
