package estacionamento;

public class TicketEstacionamentoModal {
    protected int horasEstacionadas = 4;

    public double calcularTarifa(){
        return horasEstacionadas * 5;
    }
}
