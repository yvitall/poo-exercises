package calculadoraImpostos;

public class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }
    public void calcularImposto(){
        if (rendaAnual <= 30000){
            System.out.println("Você é isento a impostos");
        } else if (rendaAnual > 30000 && rendaAnual <= 80000){
            double impostoAnual = rendaAnual * 0.15;
            System.out.printf("Seu imposto é de: R$%.2f", impostoAnual);
        } else if(rendaAnual > 80000){
            double impostoAnual = rendaAnual * 0.25;
            System.out.printf("Seu imposto é de: R$%.2f", impostoAnual);
        }
    }
    public void informacoes(){
        System.out.printf("Contribuinte: %s\nRenda Anual: R$%.2f\n", nome, rendaAnual);
        calcularImposto();
    }
}
