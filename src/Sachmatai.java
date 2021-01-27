import java.math.BigInteger;

public class Sachmatai {

    public static void main(String[] args) {

        int s = 1;     // s- tai suma
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            System.out.println(i + " = " + big);    // + " " + Math.pow(2, (i - 1)));
            s *= 2;   // suma = suma * 2  (kvadratu)   priskirta
            big = big.multiply(BigInteger.TWO);

        }
    }
}
