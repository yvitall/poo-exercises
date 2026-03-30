package estacionamento;

public class TicketCaminhonete extends TicketEstacionamentoModal {

    @Override
    public double calcularTarifa(){
        return horasEstacionadas * 10;
    }
}
