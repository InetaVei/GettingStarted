/*
UZDAVINYS
Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8, 5, 3}. Raskite
kiekvieno masyvo skaičių vidurkį ir atspausdinkite jų skirtumą. Rezultatas turi
gautis: 2.66666…
 */


public class MasyvoVidurkis {

    public static void main(String[] args) {

        int[] a = {5, 6, 10, 0xF, 010, 4};  // OxF (16-taine) = 15, 010 (8-taine) = 8
        int[] b = {8, 5, 0b11};  // 0b11 (2-taine) = 3

        int suma1 = 0;
        for (int e : a ) {   // dvitasis yra zodelis 'IS'. elementas is masyvo a
            suma1 += e;
        }
        double vidurkis1 = (double) suma1 / a.length;  // kitaip vietoj (double) galima parasyti 1.0 * suma1
        System.out.println("a[] vidurkis = " + vidurkis1);

        int suma2 = 0;
        for (int e : b ) {   // dvitasis yra zodelis 'IS'. elementas is masyvo a
            suma2 += e;
        }
        double vidurkis2 = suma2 / (double) b.length;
        System.out.println("b[] vidurkis = " + vidurkis2);

        System.out.println(vidurkis1 - vidurkis2);
    }
}

