package estacionamento;

import java.util.Scanner;

public class EstacionamentoApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Qual seu veículo:");
        String opt1 = sc.nextLine().toUpperCase();

        switch(opt1){
            case "CARRO": {
                System.out.println("CARRO");
                TicketEstacionamentoModal car1 = new TicketEstacionamentoModal();
                System.out.printf("R$%.2f\n", car1.calcularTarifa());
            }
            case "MOTO": {
                System.out.println("MOTO");
                TicketMoto moto = new TicketMoto();
                System.out.printf("R$%.2f\n", moto.calcularTarifa());
            }
            case "CAMINHONETE": {
                System.out.println("CAMINHONETE");
                TicketCaminhonete camin1 = new TicketCaminhonete();
                System.out.printf("R$%.2f\n", camin1.calcularTarifa());
            }

            }
        }
    }

