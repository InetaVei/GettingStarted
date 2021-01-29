package paskaita06.MokyklosUzdavinysPaveldemumas;

class Mokytojas extends Bendri {

    private String dalykas;
    private int kabinetas;
    // private Tvarkarastis tvarkarastis;

    // ...


    public Mokytojas() {
        System.out.println("Mokytojas()");
    }

    public String getDalykas() {
        return dalykas;
    }

    public void setDalykas(String dalykas) {
        this.dalykas = dalykas;
    }

    public int getKabinetas() {
        return kabinetas;
    }

    public void setKabinetas(int kabinetas) {
        this.kabinetas = kabinetas;
    }
}