import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo");

        Conta cc = new ContaCorrente(rodrigo);
        Conta poupanca = new ContaPoupanca(rodrigo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
