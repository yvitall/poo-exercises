package gestaoProjetos;

public class TarefaUrgente extends TarefaModel{
    private int prazoDias;

    public TarefaUrgente(String descricao, int horasEstimadas, int prazoDias) {
        super(descricao, horasEstimadas);
        this.prazoDias = prazoDias;
    }

    public void setPrazoDias(int prazoDias) {
        this.prazoDias = prazoDias;
    }

    public int getPrazoDias() {
        return prazoDias;
    }

    @Override
    public void exibirResumo(){
        System.out.printf("! TAREFA URGENTE !\nAtividade: %s%n" +
                "Duração: %dh\nPrazo: %d dias", getDescricao(), getHorasEstimadas(), prazoDias);

    }
}
