package fidelitySystem;

public class ClienteVIP extends ClienteFidelidade{
    protected int pontos = 0;
    public static final int BONUSVIP = 50;
    @Override
    public void adicionarPontos(double valorGasto){
        this.pontos += valorGasto * 2 + BONUSVIP;
        System.out.printf("=== VIP ===\nVocê recebeu: %d pontos na compra de R$%.2f\n", this.pontos, valorGasto);
    }
}
