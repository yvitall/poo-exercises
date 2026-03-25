package library;

import java.util.Scanner;

public class MainLibrary {

    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Vamos cadastrar un livro.");
        System.out.print("Digite o Título: ");
        String tt = sc.nextLine();

        System.out.print("Digite o Nome do Autor(a): ");
        String autor = sc.nextLine();

        LibraryModel livro1 = new LibraryModel(tt, autor);

        livro1.emprestar();
        livro1.devolver();

    }
}
