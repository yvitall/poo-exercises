package healthApp;

import java.util.Scanner;

public class HealthApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duração em minutos da atividade física: ");
        double duracaoMinutos = sc.nextDouble();
        System.out.println("Digite a intensidade entre 1 a 3 do exercício: ");
        int intensidade = sc.nextInt();

        AtividadeFisica atv1 = new AtividadeFisica(duracaoMinutos, intensidade);
        Corrida atv2 = new Corrida(duracaoMinutos, intensidade, 10);


        System.out.println(atv1.calcularCalorias());
        System.out.println(atv2.calcularCalorias());

    }
}
