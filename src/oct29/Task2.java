package oct29;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"abc", "efg", "hij","abc", "xyz"};
        boolean result = Duplicate_check(names);
        if (result) {
            System.out.println("Duplicate value is present in Array");
        } else {
            System.out.println("Duplicate value is not present in Array");
        }
    }

        static boolean Duplicate_check (String array[]) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        return true;
                    }
                }
                }
                return false;
            }


}

