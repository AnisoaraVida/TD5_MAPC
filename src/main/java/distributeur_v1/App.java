package distributeur_v1;

public class App {
    public static void main(String[] args) {
        Distributeur d = new Distributeur(); // on est initialement en AmpouleEteinte
        d.give(6);
        d.give(10);
        d.askCoffee();
        d.askTea();
        d.give(10);
        d.askTea();
        d.give(10);
        d.give(10);
        d.give(10);
        d.askTea();
        d.askCoffee();
    }

}
