package Oct17;

import java.util.Scanner;

public class Task2  {
    public static void main(String[] args) {
        System.out.println("Enter 3 sides of triangle");

        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene");
        }
    }}