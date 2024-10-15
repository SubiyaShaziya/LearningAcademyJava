package octJava.practice;

public class Lab002 {
    public static void main(String[] args) {
        int a = 30;
        int b=20;
        int c=30;
        int result = (a>b)?a:(b>c)?b:c;
        //System.out.println(result);
        System.out.println("The highest number is " + result);

    }
}
