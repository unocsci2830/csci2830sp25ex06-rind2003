public class MeatTopping extends PizzaTopping {}
public class PepperoniTopping extends MeatTopping {
    public String toString() { return "Pepperoni"; }
}
public class SausageTopping extends MeatTopping {
    public String toString() { return "Sausage"; }
}
public class BaconTopping extends MeatTopping {
    public String toString() { return "Bacon"; }
}
public class HamTopping extends MeatTopping {
    public String toString() { return "Ham"; }
}