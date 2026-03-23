package ecommerce;

import java.util.Locale;
import java.util.Scanner;

public class EcommerceMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double valueProduct = 0;
        double newPrice = 0;

        System.out.println("Olá, vamos cadastrar um produto!");
        System.out.print("Nome do Produto: ");
        String nameProduct = sc.nextLine();

        while (true){
            System.out.print("Valor: R$");
                double valueTest = sc.nextDouble();
            if (valueTest < 0){
                System.out.println("Valor inválido! Digite novamente.");
            } else {
                valueProduct = valueTest;
                break;
            }
        }

        System.out.print("Quantidade em Estoque: ");
        int qtStock = sc.nextInt();
        ProductModel product1 = new ProductModel(nameProduct, valueProduct, qtStock);

        System.out.println(product1);

        System.out.println("Haverá desconto: (s/n)");
        while(true){
            char resp1 = sc.next().charAt(0);
            if (resp1 == 's' || resp1 == 'S'){
                System.out.print("Digite a porcentagem do desconto: ");
                double percentageDiscount = sc.nextDouble();
                if (percentageDiscount > 0 && percentageDiscount <= 50) {
                newPrice = product1.discount(percentageDiscount);
                break;}
                else {
                }
                System.out.println("Digite um valor válido.");
            } else if (resp1 == 'n' || resp1 == 'N'){
                break;
            }else {
                System.out.println("Resposta inválida! Digite novamente.");
            }
        }
        product1.fecharCompra(newPrice);
    }
}
