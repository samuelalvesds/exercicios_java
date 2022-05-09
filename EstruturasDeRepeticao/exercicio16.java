package exerciciosJava.EstruturasDeRepeticao;

public class exercicio16 {

    public static void main(String[] args) {


        long num1 = 1;
        long num2 = 1;
        long num3;

        System.out.println(num1);
        System.out.println(num2);

       int n = Integer.MAX_VALUE;

        for ( int i = 3; i <= n; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.println(num3 + " ");

            if (num3 >= 500) {
                n = i;
            }

            }
        }
    }

