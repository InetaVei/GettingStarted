package paskaita05.intro;

public class Mokinys {   // ale projekto aprasas apacioj, ka tas mokinys tures

    private String name;   // pagal nutylejima reiksme - null.
    private int level;     // pagal nutylejima reiksme - 0

    public Mokinys(String name, int level) {   // mano sukurtas konstruktorius. Metodas, kurio pavadinimas atitinka klases pavadinima.
        this(name);  // taip kvieciamas antrasis konstruktorius
//        if (name == null || name.length() <= 1) {
//            throw new IllegalArgumentException("Neteisingas vardas");
//        }
        this.name = name;        // konstruktoriaus parametras
        this.level = level;       // konstruktoriaus parametras
    }

    public Mokinys(String name) {
        setName(name);
        level = 1;
    }
    public Mokinys(){
        level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name == null || name.length() <= 1) {
            throw new IllegalArgumentException("Neteisingas vardas");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
