package com.yamberla;

public class Main {
    public static void main(String[] args) {

         Biblioteca miBiblioteca = new Biblioteca();

        // Libro
        Libro libro1 = new Libro("L001","Cien años de soledad","Gabriel García Márquez",471);

        // Revista
        Revista revista1 = new Revista("R001","National Geographic","Mayo","245");

        // Digital
        Digital digital1 = new Digital("D001","Java PDF","PDF",15.5);

        // Registrar
        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);
        miBiblioteca.registrarRecurso(digital1);

        // Mostrar inventario
        System.out.println("INVENTARIO");
        miBiblioteca.mostrarInventario();

        // Buscar
        System.out.println("\nBuscando L001");
        Recurso encontrado = miBiblioteca.buscarPorId("L001");

        if (encontrado != null) {
            System.out.println("Encontrado: "+ encontrado.getTitulo());
        }
    }
}