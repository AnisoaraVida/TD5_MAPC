package distributeur_v1;

public class DistributeurFonctionnel implements DistributeurState {

    private static DistributeurState instance;

    public static DistributeurState instance() {
        if (instance == null)
            instance = new DistributeurFonctionnel();
        return instance;
    }

    private DistributeurFonctionnel(){
    }

    @Override
    public void askCoffee(Distributeur d) {
        if(d.caisse()>= 10){
            System.out.println(" -> possible\n");
            d.resetCaisse();
            d.setEtat(DistributeurFonctionnel.instance());
        }
        else{
            System.out.println(" -> pas possible\n");
            d.setEtat(DistributeurNonFontionnel.instance());
        }
    }

    @Override
    public void askTea(Distributeur d) {
        if(d.caisse()>= 10){
            System.out.println(" -> possible\n");
            d.resetCaisse();
            d.setEtat(DistributeurFonctionnel.instance());
        }
        else{
            System.out.println(" -> pas possible\n");
            d.setEtat(DistributeurNonFontionnel.instance());
        }
    }
}
