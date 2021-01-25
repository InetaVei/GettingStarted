public class While {

    public static void main(String[] args) {

        int i = 1, suma = 0;

     while (i <=100) {
         suma += i++;
      // arba
      // suma = suma + i;
      // i = i + 1;
     }
        System.out.println("1 + 2 + 3... + 100=" + suma);
    }
}
