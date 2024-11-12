package November.Nov12;

public class Super1 {
    Super1() {
        System.out.println("super1 constructor");
    }

         Super1(int cons) {
             System.out.println("super1 constructor with parameter");
         }
         public void method1()
            {
             System.out.println("method1");

         }
    public static void main(String[] args) {
        //super.method1();
        //Super1 s1 = new Super1();
        Super1 s2 = new Super1(10);
        s2.method1();
    }
}
