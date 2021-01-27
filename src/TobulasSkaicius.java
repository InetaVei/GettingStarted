/*
UZDAVINYS
Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus visų savo daliklių,
mažesnių už save patį, sumai.
pvz 28 = 1 + 2 + 4 + 7 + 14
Suraskite visus tokius skaičius iš intervalo 1…1000.
 */

public class TobulasSkaicius {   // cia yra klase

    public static void main(String[] args) {    // cia yra main metodas

        for (int i = 1; i <= 1000; i++) {

            //patikriname ar skaicius i yra tobulas
            if (arTobulasSkaicius(i)) {
                System.out.println("Tobulas skaicius: " + i);
            }
        }
    }

    static boolean arTobulasSkaicius(int skaicius) {
        // reikia rasti skaiciaus daliklius ir patikrinti ar ju suma lygi tam skaiciui
        int suma = 0;

        for (int d = 1; d <= skaicius / 2; d++) {
            if (skaicius % d == 0) {
                suma += d;
            }
        }

        return suma == skaicius;
    }

}