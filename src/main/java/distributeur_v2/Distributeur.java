package distributeur_v2;

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
    }

    public void update(){
        this.c = c - 10;
        if(c < 0 ) {c = 0;}
        System.out.format("c = %d \n", c);
    }

    public void refund(){
        this.c = c - 10;
        if(give(int n > 10){}
        if(c < 0 ) {c = 0;}
        System.out.format("c = %d \n", c);
        this.c = 0;
    }

    public int caisse(){
       return this.c = c;
    }

    public void askCoffee() {this.state.askCoffee(this);
    }

    public void askTea() {this.state.askTea(this);
    }

}
