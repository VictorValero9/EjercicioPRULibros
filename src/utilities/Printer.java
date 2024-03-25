package utilities;

import model.Libro;

public class Printer {
    public void imprimirInfo(Libro libro){
        System.out.println("Título: " + libro.getTitulo() + " - Autor: " + libro.getAutor() + " - Stock: " + libro.getStock());
    }
}
