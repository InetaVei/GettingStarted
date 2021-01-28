package paskaita05;

import java.time.LocalDate;

public class P05ZmogusIntro {

    public static void main(String[] args) {

        //paskaita05.Zmogus
        //   int id
        //   String firstName;
        //   String lastName;
        //   LocalDate birthday;

        int[] id = {1, 2, 3};
        String[] firstName = {"Jonas", "Ona", "Antanas"};
        String[] lastName = {"Jonaitis", "Onaite", "Antanaitis"};
        LocalDate[] birthday = {null, null, null};

        Zmogus[] zmones = {null, null, null};    // zmones yra masyvas
        System.out.println(zmones.length);

        Zmogus z1 = new Zmogus();    // kintamojo tipas - paskaita05.Zmogus.  new paskaita05.Zmogus () nepamirsti skliaustu - objekto konstruktorius.
        z1.id = 1;                    // mes cia sukurem zmogu ir priskyrem jam reiksmes
        z1.firstName = "Jonas";       // reiksme
        z1.lastName = "Jonaitis";      // reiksme
        z1.birthday = LocalDate.of(2000, 1, 31);    // reiksme
        zmones[0] = z1;    // sukurta zmogu irasom i masyvo pirma vieta

        Zmogus z2 = new Zmogus();   // kuriamas antras zmogus
        z2.id = 2;
        z2.firstName = "Ona";
        z2.lastName = "Onaite";
        z2.birthday = LocalDate.of(1999, 2, 15);
        zmones[1] = z2;   // sukurta zmogu irasom i masyvo antra vieta

        for (Zmogus z : zmones) {          // paaiskinimas (paskaita05.Zmogus is masyvo zmones)  pateikiamas per cikla
            if (z != null) {       // patikslinimas del ciklo sukimosi, "jeigu z ne null tada atlikt pirma sout. Turi buti irasytas boolean tipo klausimas
                System.out.println(z.firstName + " " + z.lastName);
            } else {   // "kitu atveju atspausdink tai:
                System.out.println("Neturime informacijos apie zmogu");
            }

        }
    }
}
class Zmogus {    // taip sukuriamas naujas duomenu tipas
    int id;  // cia yra laukas
    String firstName;    // cia yra laukas
    String lastName;   // cia yra laukas
    LocalDate birthday;   // cia yra laukas
   }
