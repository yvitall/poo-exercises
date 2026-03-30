package cursoOnline;

public class Curso {
    private String nomeCurso;
    private int totalAulas;
    private int aulasConcluida = 0;

    public Curso(String nomeCurso, int totalAulas) {
        this.nomeCurso = nomeCurso;
        this.totalAulas = totalAulas;
        this.aulasConcluida = 0;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public int getAulasConcluida() {
        return aulasConcluida;
    }

    public void concluirAula(){
        if (aulasConcluida < totalAulas){
        aulasConcluida++;
        }
        else {
            System.out.println("Você já concluiu o total de aulas! Parabéns!");
        }
    }
    public double calcularProgresso(){
        return  ( (double) aulasConcluida / totalAulas) * 100;
    }
    public void info(){
        System.out.printf
                ("Nome do Curso: %s\n" +
                "Quantidade de Aulas: %d\n" +
                        "Progresso: %.2f%%", nomeCurso, totalAulas, calcularProgresso());
    }
}
