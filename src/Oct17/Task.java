package Oct17;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Enter your marks");

        Scanner sc=new Scanner(System.in);
                float marks = sc.nextFloat();

        if (marks<100 && marks>=90){
            System.out.println("A Grade");
        } 
        else if (marks<90 && marks>=80) {
            System.out.println("B Grade");
        } 
        else if (marks<80 && marks>=70){
            System.out.println("C Grade");
        } 
        else if (marks<70 && marks>=60) {
            System.out.println("D Grade");
        } else
            {
                System.out.println("F Grade");
            }
            
        }


    }

