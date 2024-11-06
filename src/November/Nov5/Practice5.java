package November.Nov5;

import java.util.Scanner;

public class Practice5 {
    static int std_id;
static String std_name;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ID");
        std_id=sc.nextInt();
        System.out.println("enter name");
        std_name=sc.next();
        Practice5 std = new Practice5();

        System.out.println(std.std_id);
        System.out.println(std.std_name);

    }

}
