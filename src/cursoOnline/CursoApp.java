package cursoOnline;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CursoApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Curso: ");
        String name = sc.nextLine();

        System.out.print("Qtd Aulas: ");
        int qtdAulas = sc.nextInt();
        sc.nextLine();

        Curso c1 = new Curso(name, qtdAulas);

        c1.concluirAula();
        c1.concluirAula();
        c1.concluirAula();

        c1.info();
    }
}
