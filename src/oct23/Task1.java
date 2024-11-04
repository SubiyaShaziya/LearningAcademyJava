package oct23;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();

        //System.out.println("Enter a 2nd number");
        //Scanner sc= new Scanner(System.in);
        int num2= sc.nextInt();

        int sum= num1+num2;
        System.out.println("The sum of the two numbers is: "+sum);

        int product= num1*num2;
        System.out.println("The product of the two numbers is: "+product);


        int subtraction= num1-num2;
        System.out.println("The difference of the two numbers is: "+subtraction);

            int division= num1/num2;
            System.out.println("The division of the two numbers is: "+division);

        sc.close();
    }
}
