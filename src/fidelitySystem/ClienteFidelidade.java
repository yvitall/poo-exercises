package fidelitySystem;

public class ClienteFidelidade {
    protected int pontos = 0;

    public void adicionarPontos(double valorGasto){
        this.pontos += valorGasto;
        System.out.printf("=== CLIENTE FIDELIDADE ===\nVocê recebeu: %d pontos na compra de R$%.2f\n", this.pontos, valorGasto);
    }
}
