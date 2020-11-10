package distributeur_v2;

public class App {
    public static void main(String[] args) {
        Distributeur d = new Distributeur(); // on est initialement en AmpouleEteinte
        d.askCoffee();
        d.give(5);
        d.give(10);
        d.askCoffee();
        d.refund();
        d.give(50);
        d.askCoffee();
        d.askTea();
        d.refund();
        d.give(10);
        d.askTea();

    }

}
