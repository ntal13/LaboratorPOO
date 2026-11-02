package lab6;

public class Caiet extends Rechizita {
    public Caiet(String eticheta) {
        super(eticheta);
    }

    String getNume(){
        return "Caiet: " + eticheta;
    }
}
