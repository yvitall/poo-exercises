package calculadoraImpostos;

import java.util.Scanner;

public class ContribuinteApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Digite sua Renda Anual: ");
        double rendaAnual = sc.nextDouble();

        Contribuinte c1 = new Contribuinte(name, rendaAnual);

        c1.informacoes();
    }
}
