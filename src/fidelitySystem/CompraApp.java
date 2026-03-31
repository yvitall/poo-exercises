package fidelitySystem;

import java.util.Scanner;

public class CompraApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteFidelidade cF = new ClienteFidelidade();
        ClienteVIP cV = new ClienteVIP();

        cF.adicionarPontos(500);
        cV.adicionarPontos(500);
    }
}
