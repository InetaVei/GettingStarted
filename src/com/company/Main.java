package com.company;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Hello Java!");


	 int a = 100;
	 String rezultatas = "a yra " + (a < 100 ? "maziau" : "daugiau") + " uz simta ";
        System.out.println(rezultatas);

        System.out.println(a % 2 == 0 ? "Lyginis" : 0);
    }

    // % grazina liekana dalybos.
}
