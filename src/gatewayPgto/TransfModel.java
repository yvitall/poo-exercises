package gatewayPgto;

public class TransfModel {
    private int idTransacao;
    private double value;
    private Status status = Status.PENDENTE;

    public TransfModel(int idTransacao, double value) {
        this.idTransacao = idTransacao;
        if (value <= 0){
            this.value = 0;
            System.out.flush();
            System.err.println("Erro de validação: O valor deve ser maior que 0.");
        } else {
        this.value = value;
        }
    }
    public int getIdTransacao() {
        return idTransacao;
    }

    public double getValue() {
        return value;
    }

    public Status getStatus() {
        return status;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void processarPgto(double limiteDisponivel){
        if (value == 0){
            System.out.flush();
            System.err.println("== ERRO ==");
            System.err.println("Não foi realizado nenhuma trasnferência. O valor R$0 não pode ser transferido.");
        }
        else if (value <= limiteDisponivel){
            setStatus(Status.APROVADO);
            System.out.println("Transação realizada com SUCESSO!");
            System.out.println("=== INFO DA TRANSAÇÃO ===");
            System.out.printf("ID: %d\n", idTransacao);
            System.out.printf("VALOR: R$%.2f\n", value);
            System.out.printf("Status da Transação: %s\n", status);
        } else {
            setStatus(Status.RECUSADA);
            System.out.println("Transação RECUSADA!");
            System.out.println("=== INFO DA TRANSAÇÃO ===");
            System.out.printf("ID: %d\n", idTransacao);
            System.out.printf("VALOR: R$%.2f\n", value);
            System.out.printf("Status da Transação: %s\n", status);
            System.out.printf("Saldo Limite: R$%.2f\n", limiteDisponivel);
        }

    }
}