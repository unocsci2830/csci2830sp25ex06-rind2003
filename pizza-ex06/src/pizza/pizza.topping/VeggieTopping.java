public class VeggieTopping extends PizzaTopping {}
public class PepperTopping extends VeggieTopping {
    public String toString() { return "Pepper"; }
}
public class MushroomTopping extends VeggieTopping {
    public String toString() { return "Mushroom"; }
}
public class OliveTopping extends VeggieTopping {
    public String toString() { return "Olives"; }
}
public class OnionTopping extends VeggieTopping {
    public String toString() { return "Onions"; }
}