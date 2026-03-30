package estacionamento;

public class TicketMoto extends TicketEstacionamentoModal {

    @Override
    public double calcularTarifa(){
        return horasEstacionadas * 3;
    }
}
