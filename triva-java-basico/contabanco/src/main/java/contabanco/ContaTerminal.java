

package contabanco;

import java.util.Scanner;

public class ContaTerminal {
   

    public static void main(String[] args) {
        
         // entrada dos parametros será via terminal
    int numero;
    String agencia;
    String nome;
    String sobrenome;
    double saldo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu Nome: ");
        nome = scan.next();
        
        System.out.println("Digite o seu sobrenome: ");
        sobrenome = scan.next();
        
        System.out.println("Digite o numero da Agencia: ");
        agencia = scan.next();
        
        System.out.println("Digite o numero de sua conta corrente: ");
        numero = scan.nextInt();
        
        System.out.println("Digite o valor do deposito: ");
        saldo = scan.nextDouble();
        
       
        System.out.println("Ola "+nome+" "+sobrenome+" , obrigado por criar uma "
                            + "conta em nosso banco, sua agencia e "
                            +agencia+ " , conta "+numero+" e seu saldo "
                            + saldo+ " ja esta disponivel para saque.");
    }
}
