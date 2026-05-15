package com.yamberla;

public class Digital extends Recurso {

    private String formato;
    private double tamanioMB;

    public Digital(String id,String titulo,String formato,double tamanioMB) {
        super(id, titulo);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamanioMB + " MB");
    }
}
