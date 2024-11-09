package November.Nov8.Hierarchical;

import November.Nov8.Multi_level_inheritance.Car;
import November.Nov8.Multi_level_inheritance.Vehicle;

public class Runner_class {
    public static void main(String[] args) {


    Vehicle2 v= new Vehicle2();
    v.drive();

    Car2 c= new Car2();
    c.drive();
    c.wheel();

    Bike2 b= new Bike2();
    b.drive();
    b.wheel();

    Auto2 a= new Auto2();
    a.drive();
    a.wheel();

}}
