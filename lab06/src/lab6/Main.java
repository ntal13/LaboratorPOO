package lab6;

public class Main {
    static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();
        Caiet caiet = new Caiet("Antal");
        Manual manual = new Manual("Hunor");
        ghiozdan.add(caiet);
        ghiozdan.add(manual);
        System.out.println(ghiozdan.getNrRechizite());
        ghiozdan.afisare();
        ghiozdan.listCaiet();
        ghiozdan.listManual();
        System.out.println(ghiozdan.getNrCaiet());
        System.out.println(ghiozdan.getNrManual());
    }
}
