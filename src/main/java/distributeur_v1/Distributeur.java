package distributeur_v1;

public class Distributeur {

    private int c;
    private DistributeurState state;

    public Distributeur(){
        this.c = 0;
        this.state = DistributeurNonFontionnel.instance();;
    }

    public void setEtat(DistributeurState s){
        this.state = s;
    }

    public void give(int n ){
        this.c = this.c + n;
        System.out.format("c = %d \n", c);
    }

    public void resetCaisse(){
        this.c = 0;
        System.out.format("c = %d \n", c);
    }

    public int caisse(){
       return this.c = c;
    }

    public void askCoffee() {this.state.askCoffee(this);
    }

    public void askTea() {this.state.askTea(this);
    }

}
