package Lab;

import java.util.Scanner;

public class Calculate_Rectangle_Area {
    private static int getRectangleArea (int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int area = getRectangleArea(width, height);
        System.out.println(area);
    }
}
