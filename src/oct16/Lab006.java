package oct16;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int age=sc.nextInt();
       if(age > 25){
           System.out.println("Allowed");}
       else{
           System.out.println("Not allowed");}
        sc.close();
    }
}
