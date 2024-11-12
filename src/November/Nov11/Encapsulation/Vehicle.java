package November.Nov11.Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {
    private String engine= "CNG";

    //private int wheels;
    //private int seats;

    public String get_engine() {
       // System.out.println("getters");
        return engine;
    }

    public void set_engine(String engine) {
        //System.out.println("setters");
        this.engine = engine;
    }

    public void run() {
        System.out.println("Vehicle is running");
    }

   /* public static void main(String[] args) {
        Vehicle v=new Vehicle();
        System.out.println(v.engine);
    }
*/
}
