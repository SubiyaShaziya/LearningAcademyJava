package November.Nov8;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Task1 {
    public Task1(int i, String s, String delhi) {
    }

    public static void main(String[] args) {
        Task1[] ar = {new Task1(1, "Raja: ", "Delhi"),
                new Task1(2, "Ram: "  , "Pune"),
                new Task1(3, "Usa: "  , "Noida"),
                new Task1(4, "Tina :" , "faridabad")};
        //Arrays.toString() is overloaded for array of Object class
        System.out.println(Arrays.toString(ar));
    }
}
