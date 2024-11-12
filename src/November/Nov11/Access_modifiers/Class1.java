package November.Nov11.Access_modifiers;

public class Class1 {
    private String std_name = "Unique";
    protected int std_id = 789;
    public int std_identity = 20;
    int std_rollno = 123;


    public static void main(String[] args) {
        Class1 c1 = new Class1();
        System.out.println(c1.std_name);
        System.out.println(c1.std_id);
        System.out.println(c1.std_identity);
        System.out.println(c1.std_rollno);
    }
}
