package paskaita05.intro;

public class Mokinys {   // ale projekto aprasas apacioj, ka tas mokinys tures

    public String name;   // pagal nutylejima reiksme - null.
    public int level;     // pagal nutylejima reiksme - 0

    public Mokinys(String name, int level) {   // mano sukurtas konstruktorius. Metodas, kurio pavadinimas atitinka klases pavadinima.
        this.name = name;        // konstruktoriaus parametras
        this.level = level;       // konstruktoriaus parametras
    }

    public Mokinys(String name) {
        this.name = name;
        level = 1;
    }
    public Mokinys(){
        level = 1;
    }
}
