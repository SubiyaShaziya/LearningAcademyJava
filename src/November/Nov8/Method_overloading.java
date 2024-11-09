package November.Nov8;

public class Method_overloading {
    public static void main(String[] args) {
        Vehicle3 v=new Vehicle3();
        //v.void("car", 2000);
        v.wheels2("car", 2000, "red");
        //v.void("car", 2000, "red", 2000
    }
}
 class Vehicle3{
void wheels2(String type, int price)  {
    System.out.println("Car");
}
void wheels2(String type, int price, String color) {
    System.out.println("Bike");
}
void wheels2(String type, int price, String color, int cc) {
    System.out.println("Auto");
}}


