package controlefluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author helio
 */
public class ControleFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int parametro1;
        int parametro2;

        boolean continuar = true;

        Scanner scn = new Scanner(System.in);

        while (continuar) {
            try {
                System.out.printf("Digite o parametro 1: ");
                parametro1 = scn.nextInt();

                System.out.printf("Digite o parametro 2: ");
                parametro2 = scn.nextInt();

                contar(parametro1, parametro2);
                continuar = false;
            } catch (ParametrosInvalidosException h) {

                //System.out.println(h);
                System.out.println("\nDigite os Parametros novamente.");
                scn.nextLine();
            } catch (InputMismatchException im) {
                System.out.println("\nDigite somente numeros inteiros POSITIVOS!" + "\nDigite os Parametros novamente. ");
                scn.nextLine();
            }

        }

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        //System.out.println(" ");

        if (parametro1 < 0 || parametro2 < 0) {
            System.out.println("\nDIGITE SOMENTE NUMEROS INTEIROS POSITIVOS!\n");
            throw new ParametrosInvalidosException();
        } else if (parametro1 >= parametro2) {
            System.out.println("\nParametro 1 devera ser sempre menor que Parametro 2!");
            
            throw new ParametrosInvalidosException();
        }
        System.out.println(" ");
        for (int c = 0; c < (parametro2 - parametro1); c++) {
            System.out.println("Imprimindo " + (c + 1));
        }
    }
}
