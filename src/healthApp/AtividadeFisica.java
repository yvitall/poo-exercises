package healthApp;

public class AtividadeFisica {
    private double duracaoMinutos;
    private int intensidade;

    public AtividadeFisica() {
    }

    public AtividadeFisica(double duracaoMinutos, int intensidade) {
        this.duracaoMinutos = duracaoMinutos;
        this.intensidade = intensidade;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public double calcularCalorias(){
        return duracaoMinutos * intensidade * 5;
    }
}
