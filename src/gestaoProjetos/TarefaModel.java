package gestaoProjetos;

public class TarefaModel {
    private String descricao;
    private int horasEstimadas;
    public TarefaModel(String descricao, int horasEstimadas) {
        this.descricao = descricao;
        this.horasEstimadas = horasEstimadas;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void exibirResumo(){
        System.out.printf("Atividade: %s%n" +
                "Duração: %dh%n"
                , descricao, horasEstimadas);
    }
}
