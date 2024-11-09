package November.Nov8.Single_inheritance;

public class Python extends Java{
    void python(){
        System.out.println("Python is a programming language");
    }
    public static void main(String[] args) {
        Java j1= new Java();
        j1.java();
        j1.python();
        Python p1= new Python();
        p1.java();
        p1.python();

    }
}
