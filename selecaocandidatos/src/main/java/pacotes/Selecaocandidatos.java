package pacotes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Helio
 */
public class Selecaocandidatos {

    public static void main(String[] args) {

        System.out.println("hicg");
        int c = 0;
        int sal1[] = new int[12];//salario de todos os candidatos
        int selecionados[] = {-1, -1, -1, -1, -1};

        String[] candidatos = {"Helio",
            "Vanessa",
            "Joao",
            "Maria",
            "Jose",
            "Trump",
            "Lula",
            "Jair",
            "Putin",
            "Boulos",
            "Marcal",
            "Tabata"};

        for (String nome : candidatos) {
            selecionar(candidatos, sal1, c);
            c++;
        }
        System.out.println("\n");

        seleciona5(sal1, selecionados, candidatos);

        System.out.println("\n");

        for (int nome5 : selecionados) {
            chamar(candidatos, nome5);
        }
        System.out.println("\n");
    }

    static void chamar(String candidatos[], int nome5) {
        System.out.println("-----------------------");

        boolean atendeu = false;
        int continua = 0;

        if (nome5 >= 0) {
            while (atendeu == false && continua < 5) {
                if (atender() && continua < 5) {
                    System.out.println(candidatos[nome5] + " foi contratado tentativa >>> " + (continua + 1));
                    atendeu = true;
                } else {
                    System.out.println(candidatos[nome5] + " Nao Atende!!! >>> tentativa  " + (continua + 1));

                    if ((continua + 1) == 5) {
                        System.out.println(candidatos[nome5] + " XXXX - DESCLASSIFICADO apos " + (continua + 1) + " tentativas.");
                    }
                    continua++;
                }
            }
        } else {
            System.out.println("++++++ VAGA NAO PREENCHIDA +++++");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void seleciona5(int sal1[], int selecionados[], String candidatos[]) {
        int c2 = 0;
        int c3 = 0;
        while (c2 < sal1.length) {
            if (sal1[c2] >= 2000) {
                System.out.println((c2 + 1) + " O candidato " + candidatos[c2]
                        + " pretende receber: " + sal1[c2] + " - - -reprovado- - -");
            } else if (c3 < selecionados.length) {
                selecionados[c3] = c2;
                System.out.println((c2 + 1) + " O candidato " + candidatos[c2]
                        + " pretende receber: " + sal1[c2] + " >>>APROVADO<<<.");
                c3++;

            } else {
                System.out.println((c2 + 1) + " O candidato " + candidatos[c2]
                        + " pretende receber: " + sal1[c2] + "====RESERVA====");
            }
            c2++;

        }

    }

    static void selecionar(String candidatos[], int sal1[], int c) {
        sal1[c] = salario();
        System.out.println((c + 1) + " O candidato " + candidatos[c] + " pretende receber: " + sal1[c]);
    }

    static int salario() {
        return ThreadLocalRandom.current().nextInt(1750, 2250);
    }
}
