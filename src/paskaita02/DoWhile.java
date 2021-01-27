package paskaita02;

public class DoWhile {

    public static void main(String[] args) {

        int i = 2, suma = 0;
        do {
            suma +=i;
            i +=2;
        } while (i <=100);

        System.out.println("2 + 4 + ... + 100" + suma);
    }
}
