package farmacia;

public class Medicamento {
    private String nome;
    private double price;
    private boolean exigeReceita;

    public Medicamento(String nome, double price, boolean exigeReceita) {
        this.nome = nome;
        this.price = price;
        this.exigeReceita = exigeReceita;

        System.out.printf("%s cadastrado com sucesso!", nome);
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public boolean isExigeReceita() {
        return exigeReceita;
    }
    public void vender(boolean temReceita){
        if (exigeReceita == false || temReceita == true){
            System.out.printf("=== VENDA ===\n%s\nR$%.2f\nExige Receita: %b", nome, price, exigeReceita);
        }
        else {
        System.out.println("Venda não realizada.");
        }
    }
}
