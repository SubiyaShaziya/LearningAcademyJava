package November.Nov5;

public class Practice2 {
    int std_id;
    String std_name;

    Practice2(int std_id, String std_name) {
        System.out.println("constructor executed");
        this.std_id = std_id; // Assign the parameter value to the instance variable
        this.std_name = std_name;    //String std_name= "unknown";

}
    public static void main(String[] args) {
        Practice2 std = new Practice2(100, "subiya");

        System.out.println(std.std_id);
        System.out.println(std.std_name);

    }
}
