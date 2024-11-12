package November.Nov12;

public class Interface1 {
    public static void main(String[] args) {
        child c = new child();
        c.goldCoin();
        c.site();
    }
}

class child implements Mom{

    @Override
    public void goldCoin() {
        System.out.println("Made chain out of mom's gold");
    }

    @Override
    public void site() {
        System.out.println("Constructed home");
    }
}
interface Mom{
    void goldCoin();
    void site();
}
