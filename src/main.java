import java.util.List;

public class main {
    public static void main(String[] args) {
        Cliente Erika = new Cliente();
        Erika.setNome("Erika");

        ContaCorrente cc = new ContaCorrente(Erika);
        ContaPoupanca poupanca = new ContaPoupanca(Erika);

        cc.depositar(250);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        }
}
