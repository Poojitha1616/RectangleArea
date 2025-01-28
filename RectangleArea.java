//•	Create a program that calculates the area of a rectangle using `int` and `float` data types

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthInt = scanner.nextInt();
        int widthInt = scanner.nextInt();
        float lengthFloat = scanner.nextFloat();
        float widthFloat = scanner.nextFloat();
        int areaInt = lengthInt * widthInt;
        System.out.println("Area (integer): " + areaInt);
        float areaFloat = lengthFloat * widthFloat;
        System.out.println("Area (float): " + areaFloat);
    }
}

