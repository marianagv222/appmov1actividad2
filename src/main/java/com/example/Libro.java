package com.example;
public class Libro {
    
    private String titulo, autor;
    private int paginas;

    public Libro(){
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.paginas = 0;       
    }

    public Libro(String titulo, String autor){
        this.titulo = "Harry Potter";
        this.autor = "J.K. Rowling";
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = "El Señor de los Anillos";
        this.autor = "J.R.R. Tolkien";
        this.paginas = 1200;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarDetalles() {
        System.out.println("=== Detalles del Libro ===");
        System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Paginas: " + this.paginas);
    }
}
