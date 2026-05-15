package com.yamberla;

public class Revista extends Recurso{

    private String mes;
    private String edicion;

    public Revista(String id, String titulo, String mes, String edicion) {
        super(id, titulo);
        this.mes = mes;
        this.edicion = edicion;
    }

     @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Mes: " + mes);
        System.out.println("Edición: " + edicion);
    }
}
