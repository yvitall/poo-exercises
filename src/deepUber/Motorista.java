package deepUber;

public class Motorista {
    private String nome;
    private double notaAvaliacao;
    private double taxaBase = 3;

    public Motorista(String nome, double notaAvaliacao) {
        this.nome = nome;
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public double calcularValorCorrida(double km){
        double valorFinal = (km * 2.0) + this.taxaBase;

        if (this.notaAvaliacao > 4.8) {
            valorFinal += valorFinal * 0.1;
        }

        return valorFinal;
    }

}
