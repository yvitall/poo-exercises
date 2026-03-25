package library;

public class LibraryModel {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public LibraryModel(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (this.disponivel == true){
            this.disponivel = false;
            System.out.println("O livro foi emprestado.");
        } else if (this.disponivel == false)
            System.out.println("O livro está emprestado.");
    }
    public void devolver(){
        if (this.disponivel == true) {
            System.out.println("O livro não está emprestado.");
        } else if (this.disponivel == false) {
            this.disponivel = true;
            System.out.println("O livro foi devolvido.");
        }

    }
}
