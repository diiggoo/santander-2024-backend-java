import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /* TODO:
        *   Conhecer e importar Scanner
        *   Exibir as mensagens para o nosso usuario
        *   Obter pelo Scanner os alores digitados no terminal
        *   Exibir a mensagem da conta criada */

        //Inicia Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //coleta dados
        System.out.println("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agency = scanner.next();

        System.out.println("Digite o seu nome: ");
        String customerName = scanner.next();

        System.out.println("Digite seu saldo: ");
        double balance = scanner.nextDouble();
        
        //imprime dados
        System.out.println("Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " +agency+ ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque");

    }
}
