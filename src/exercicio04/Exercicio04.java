package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ivo", 39, "Guarulhos", "11122233344");
        cliente.exibirDados();
        Funcionario funcionario = new Funcionario("Ivo", 39, "Guarulhos", 44499);
        funcionario.exibirDados();
    }
}
