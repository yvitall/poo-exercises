package gestaoProjetos;

import java.util.Scanner;

public class GestaoProjetoApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VAMOS CRIAR UMA ATIVIDADE");
        System.out.print("Descrição: ");
        String desc = sc.nextLine();
        System.out.print("Quantas Horas: ");
        int horas = sc.nextInt();
        sc.nextLine();
        System.out.println("É uma tarefa urgente? (s/n)");
        char op1 = sc.nextLine().toUpperCase().charAt(0);

        switch(op1) {
            case 'S': {
                System.out.print("Qual prazo em dias: ");
                int prazoDias = sc.nextInt();
                sc.nextLine();

                TarefaUrgente tarefa1 = new TarefaUrgente(desc, horas, prazoDias);
                tarefa1.exibirResumo();
                break;
            }
            case 'N': {
                TarefaModel tarefa1 = new TarefaModel(desc, horas);
                tarefa1.exibirResumo();
                break;
            }
        }


    }
}
