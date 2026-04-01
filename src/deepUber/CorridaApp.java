import deepUber.Motorista;

public class CorridaApp {
        public static void main(String[] args) {
            // Instanciando dois motoristas (um com nota 4.5 e outro com 4.9)
            Motorista motorista1 = new Motorista("Marcos", 4.5);
            Motorista motorista2 = new Motorista("Yuri", 4.9);

            double distancia = 15.0;

            System.out.println("--- Comparativo de Corrida (15 km) ---");

            double valor1 = motorista1.calcularValorCorrida(distancia);
            System.out.printf("Motorista: %s\nNota: %.2f \nValor: R$%.2f\n ", motorista1.getNome(), motorista1.getNotaAvaliacao(), valor1);

            System.out.printf("\n====================\n");

            double valor2 = motorista2.calcularValorCorrida(distancia);
            System.out.printf("Motorista: %s\nNota: %.2f \nValor: R$%.2f\n ", motorista2.getNome(), motorista2.getNotaAvaliacao(), valor2);
        }
    }
