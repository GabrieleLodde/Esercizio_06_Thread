import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        RisorsaParcheggio r = new RisorsaParcheggio();
        List<Auto> elencoAuto = new ArrayList<>();

        elencoAuto.add( new Auto("Fiat", r));
        elencoAuto.add( new Auto("Ford", r));
        elencoAuto.add( new Auto("Porsche", r));
        elencoAuto.add( new Auto("Abarth", r));
        elencoAuto.add( new Auto("Audi", r));
        elencoAuto.add( new Auto("BMW", r));
        elencoAuto.add( new Auto("Dacia", r));
        elencoAuto.add( new Auto("Hyundai", r));

        for(Auto a: elencoAuto){
            a.start();
        }
    }
}