package exercicio05;

public class Caneta implements Escrevente {

    private String ehFeitoDe;
    private String escreveCom;

    public Caneta() {
        this.ehFeitoDe = "Plastico";
        this.escreveCom = "Tinta";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com "+this.escreveCom);
    }
}
