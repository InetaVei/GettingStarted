package paskaita05;

import paskaita05.intro.Mokinys;   // greitesnis budas susieti su kitu failu

public class U1 {

    public static void main(String[] args) {

        System.out.println(U1.class.getName());  // cia issikvieciamas pilnas klases pavadinimas

        Mokinys[] mokiniai = readFromDB();  // mokiniu masyvas nuskaitomas is duomenu bazes

        System.out.println("Pradiniai duomenys");
        // paskaita05.intro.Mokinys[] mokiniai = new paskaita05.intro.Mokinys[5];  // taip nurodomas pilnas kelias su kokiom klasem mes norim dirbti. Toks budas ner patogus, bet galimas

        print(mokiniai);

        //sulygiuoti pagal klase ir varda
        for (int i = 0; i < mokiniai.length - 1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                if (compare(mokiniai[i], mokiniai[j]) > 0) {
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }

//                if(mokiniai[i].level > mokiniai[j].level) {
//                    Mokinys tmp = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = tmp;
            }
        }

        System.out.println("Sulygiuota");

//        for (Mokinys m : mokiniai) {
//            System.out.println(m.name + " " + m.level);
//        }
        print(mokiniai);
    }

    static void print(Mokinys[] mokiniai) {   // metodas print
        for (Mokinys m : mokiniai) {
            System.out.println(m.getName() + " " + m.getLevel());
        }
    }

    static int compare(Mokinys m1, Mokinys m2) {
        if (m1.getLevel() < m2.getLevel()) return -1;
        if (m1.getLevel() > m2.getLevel()) return 1;
        return m1.getName().compareTo(m2.getName());
    }

    static Mokinys[] readFromDB() {    // masyvas nuskaitomas is duomenu bazes
        Mokinys[] mokiniai = new Mokinys[]{
                new Mokinys(),
                new Mokinys("Paula", 1),
                new Mokinys("Nora", 2),
                new Mokinys("Mila", 1),
                new Mokinys("S", 3),
                new Mokinys("Nina")
        };
        mokiniai[0].setName(null);
        mokiniai[0].setLevel(0);

        return mokiniai;
    }

}
