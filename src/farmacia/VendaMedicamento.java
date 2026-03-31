package farmacia;

import java.util.Scanner;

public class VendaMedicamento {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== CADASTRO DE MEDICAMENTOS ==");
        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("VALOR: R$");
        double value = sc.nextDouble();
        sc.nextLine();
        System.out.println("EXIGE RECEITA: (s/n)");
        char resposta = sc.next().toUpperCase().charAt(0);

        boolean exigeReceita = (resposta == 'S');
        Medicamento produto1 = new Medicamento(nome, value, exigeReceita);

        System.out.println("\n== REALIZANDO A VENDA ==");
        System.out.println("Cliente quer comprar: " + produto1.getNome());

        boolean clienteTemReceita = false; // Por padrão, assumimos que ele não tem

        // Só precisamos perguntar ao cliente se ele tem a receita, caso o remédio exija!
        if (exigeReceita == true) {
            System.out.print("O cliente apresentou a receita? (S/N): ");
            char respostaCliente = sc.next().toUpperCase().charAt(0);
            clienteTemReceita = (respostaCliente == 'S');
        }

        produto1.vender(clienteTemReceita);

        sc.close();
    }
}

