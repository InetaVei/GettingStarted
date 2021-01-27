package paskaita03;

public class Masyvai {

    public static void main(String[] args) {

        int x = 100;   // tiek x tiek y rodo i skirtingas atminties lasteles. Todel nematome pakitimu.
        int y = x;

        x = 200;
        System.out.println(y);

        int[] masyvas = { 1, 2, 3 };   // masyve rodoma i ta pacia viena lastele, todel matome pakitimus.
        int[] masyvas2 = masyvas;

        masyvas[0] = 5;
        System.out.println(masyvas2[0]);
    }
}
