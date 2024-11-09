package November.Nov8.Multi_level_inheritance;

public class bike extends Car {

    void wheels(){
        System.out.println("2 wheels");
    }
    void engine(){
        System.out.println("Petrol engine");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.wheels();
        v.engine();

        Car c = new Car();
        c.wheels();
        c.engine();

        bike b = new bike();
        b.wheels();
        b.engine();

    }
}
