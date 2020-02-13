package exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 1, 1000);
        cc.deposito(100);

        ContaCorrente cc2 = new ContaCorrente(1, 2, 2000);
        cc2.saque(500);

        ContaCorrente cc3 = new ContaCorrente(2, 1, 100);
        cc3.saque(500);
    }
}
