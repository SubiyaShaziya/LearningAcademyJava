package November.Nov12;

public class Super2 extends Super1{

    Super2(){
        System.out.println("child constructor");
    }
    public void method1(){
        System.out.println("method2");
    }
    public static void main(String[] args) {
        Super2 s1 = new Super2();
        s1.method1();
    }
}
