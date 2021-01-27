package paskaita03;

public class Masyvai2 {
    public static void main(String[] args) {

        String[] s = { "A", "A1", "B", "C", "A3"};
        int skaicius = 0;
//        for (int i = 0; i < s.length; i++) {
//            String elementas = s[i];

        for (String elementas : s) {  // tas dvitaštis atspindi zodeli 'IS', elementas is skaiciu masyvo
            if (elementas.charAt(0) == 'A') skaicius++;
        }
        System.out.println("Viso prasideda A raide yra " + skaicius);
    }
}
