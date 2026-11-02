package lab6;

public class Ghiozdan {
    private Rechizita[] rechizite = new Rechizita[10];
    private int nrRechizite = 0;

    void add(Caiet caiet){
        if(nrRechizite < rechizite.length) {
            rechizite[nrRechizite] = caiet;
            nrRechizite++;
        }
    }

    void add(Manual manual){
        if(nrRechizite < rechizite.length){
            rechizite[nrRechizite] = manual;
            nrRechizite++;
        }
    }

    int getNrRechizite() { return nrRechizite; }

    void afisare(){
        for(int i=0; i<nrRechizite; i++){
            System.out.println(rechizite[i].getNume());
        }
    }

    void listManual(){
        for(int i=0; i<nrRechizite; i++){
            if(rechizite[i] instanceof Manual){
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    void listCaiet(){
        for(int i=0; i<nrRechizite; i++){
            if(rechizite[i] instanceof Caiet){
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    int getNrManual(){
        int nrManual = 0;
        for(int i=0; i<nrRechizite; i++){
            if(rechizite[i] instanceof Manual) nrManual++;
        }
        return nrManual;
    }

    int getNrCaiet(){
        int nrCaiet = 0;
        for(int i=0; i<nrRechizite; i++){
            if(rechizite[i] instanceof Caiet) nrCaiet++;
        }
        return nrCaiet;
    }
}
