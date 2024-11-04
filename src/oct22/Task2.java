package oct22;

public class Task2 {
    public static void main(String[] args) {
        String s1 = "Helloworld";
        int y = 0, z = 0;

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                y++;
                //System.out.println("Vowels " + c);
            } else {
                z++;
                //System.out.println("Consonants " + c);
            }}
            System.out.println("Number of vowels " + y);
            System.out.println("Number of consonants " + z);
        }

}


