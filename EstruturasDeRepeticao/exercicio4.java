package exerciciosJava.EstruturasDeRepeticao;



public class exercicio4 {

    public static void main(String[] args) {


        //País A - 80.000 = taxa de 3% ano
        //País B - 200.000 = taxa de 1,5% ano

        double popA = 80000;
        double popB = 200000;
        int i = 0;   // ano

        /*for (i = 0 ; popA < popB; i++) {
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
        }*/

        while (popA < popB) {

            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            i++;
        }


        System.out.println(i);







    }
}

