package com.yamberla;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Recurso> inventario;

    public Biblioteca() {
        inventario = new ArrayList<>();
    }

    public void registrarRecurso(Recurso r) {
        inventario.add(r);
    }

    public void mostrarInventario() {
        for (Recurso r : inventario) {
        r.mostrarFichaTecnica();
        }
    }

    public Recurso buscarPorId(String id) {
        for (Recurso r : inventario) {
        if (r.getId().equals(id)) {
        return r;
        }
    }
        return null;
    }
}
