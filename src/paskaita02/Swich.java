package paskaita02;

import javax.sound.midi.Soundbank;

public class Swich {

    public static void main(String[] args) {

        int x = 1; // (int) Math.round(Math.random() * 10);

        switch (x) {
            case 0:
                System.out.println("Nulis");
                break;

            default:
                System.out.println("?");
                break;

            case 1:
                System.out.println("Vienetas");
                break;

            case 2:
                System.out.println("Du");
                break;
        }

        System.out.println("Pabaiga");  // switch baigesi ir cia jau naujas sakinys.
    }
}

/*
Math.random - atsitiktiniu skaiciu generatorius, grazina skaiciu nuo 0-1 (su kableliais)
Math.round - skaiciu apvalina.
Default - estetiskai default turetu buti pats paskutinis, bet is esmes galima bet kur ji parasyti.

 */
