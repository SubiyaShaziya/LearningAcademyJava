package oct28;

public class Task1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;
        System.out.println(s3);
        char character =s3.charAt(5);
        System.out.println(character);
        boolean value=s3.contains("worl");
        System.out.println(value);

        String s4 = s1.concat(s2);
        System.out.println(s4);
        System.out.println(s4.length());

        String s5 = new String("java");
        String s6 = s5;
        //String s5= "java update";
        System.out.println(s5);
        System.out.println(s6);

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));


        System.out.println(s5.equals(s6));
    }
}
