package November.Nov11.Encapsulation;

public class ChildVehicle {
        public static void main(String[] args) {
            Vehicle v = new Vehicle();
            v.run();

            v.get_engine();
            v.set_engine("Diesel engine");
            System.out.println(v.get_engine());
        }
}
