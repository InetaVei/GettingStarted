public class Trikampiai {
    public static void main(String[] args) {

        int [][] trikampiai = {{ 3, 4, 5 }, { 2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        System.out.println(trikampiai.length);
        for (int i = 0; i < trikampiai.length; i++) {

            int[] a = trikampiai[i];
            System.out.print(" triangle: " + a[0] + ", " + a[1] + ", " + a[2]);

            // tikriname ar galima padaryti trikampi
            if (a[0] < a[1] + a[2] && a[1] < a[0] + a[2] && a[2] < a[0] + a[1]) {
                System.out.print(" galimas");

                if (a[0] == a[1] && a[1] == a[2]) {
                    System.out.print(" lygiakrastis");
                } else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                    System.out.print(" Lygiasonis");
                } else {
                    System.out.print(" Ivairiakrastis");
                }
                // paskaiciuojame plota
                double p = (a[0] + a[1] + a[2]) / 2.0;    // dalyba is 2.0 kad java zinotu, kad cia doublas ir reikia atsakyma parodyt nesutrumpinta
                System.out.print(" pusperimetris = " + p);
                double s = Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2]));
                s = Math.round(s * 100.0) / 100.0; // taip nurodoma kiek noriu matyti skaiciu po kableliu "plote"
                System.out.println(", plotas = " + s);

            } else {
                System.out.println(" Trikampis negalimas");
            }
        }
    }
}
