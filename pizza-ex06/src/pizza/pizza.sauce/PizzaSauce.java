public abstract class PizzaSauce {
    public abstract String toString();
}
public class TomatoSauce extends PizzaSauce {
    public String toString() { return "Tomato Sauce"; }
}
public class AlfredoSauce extends PizzaSauce {
    public String toString() { return "Alfredo Sauce"; }
}