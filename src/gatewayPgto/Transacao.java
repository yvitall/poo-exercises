package gatewayPgto;

import java.util.Random;
import java.util.Scanner;

public class Transacao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("=== VAMOS REALIZAR UM PGTO ===");
        int idTrasacao = random.nextInt(9000) + 1000;

        System.out.println("Digite o valor da transferência: ");
        double value = sc.nextDouble();
        TransfModel transf1 = new TransfModel(idTrasacao, value);

        System.out.println("=== Situação Atual da Transação ===");
        System.out.printf("ID: %d\n", transf1.getIdTransacao());
        System.out.printf("Valor: R$%.2f\n", transf1.getValue());
        System.out.printf("Status: %s\n", transf1.getStatus());

        transf1.processarPgto(1000);
    }
}
