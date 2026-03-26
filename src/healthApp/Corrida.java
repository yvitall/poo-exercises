package healthApp;

public class Corrida extends AtividadeFisica {
    private double distanciaKm;

    public Corrida(double duracaoMinutos, int intensidade, double distanciaKm) {
        super(duracaoMinutos, intensidade);
        this.distanciaKm = distanciaKm;
    }

    public Corrida() {
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularCalorias(){
        return (super.getDuracaoMinutos() * super.getIntensidade() * 5) + (distanciaKm * 10);
    }
}
