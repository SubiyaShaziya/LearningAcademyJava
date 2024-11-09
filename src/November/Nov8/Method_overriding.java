package November.Nov8;

public class Method_overriding {
    public static void main(String[] args) {
        Bike4  obj = new Bike4();
        obj.run();

        //Vehicle4 obj1 = new Vehicle4();
        //obj1.run();
    }
}

class Vehicle4{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike4 extends Vehicle4{
    void run(){
        System.out.println("Bike is running safely");
}

        }
