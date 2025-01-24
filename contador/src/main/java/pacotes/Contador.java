
package pacotes;

import java.util.Scanner;

/**
 *
 * @author Helio
 */
public class Contador {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean continua = true;
        do {
            try {

                System.out.printf("\nDigite o parametro 1: ");
                int p1 = scn.nextInt();

                System.out.printf("\nDigite o parametro 2: ");
                int p2 = scn.nextInt();
                System.out.println("");

                diferenca(p1, p2);
                continua = false;
            } catch (ParametrosException h) {
                
                System.out.println(h);
                System.out.println("P1 deve ser sempre menor que P2,"
                        + " por favor tente novamente.");
            } catch (Exception e) {
                System.out.println("\n");
                System.out.println(e);
                System.out.println("Digite somente numeros inteiros,"
                        + "por favor tente novamente.");
                scn.nextLine();
            }
        } while (continua);
    }

    static void diferenca(int p1, int p2) throws ParametrosException {
        if (p1 >=p2) {
            throw new ParametrosException();
        }
        for (int c = 0; c < (p2 - p1); c++) {
            System.out.println("imprimindo " + (1 + c));
        }
       
    }

}
