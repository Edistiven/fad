package com.fad.pruebas;

import com.fad.dao.categoriaDAO;
import com.fad.dao.tipordeninvDAO;

public class CategoriaTest {

    public static void main(String[] args) {
        categoriaDAO categoriaI = new categoriaDAO();
        
        categoriaI.instertar("ayuda", "ayuda", "CAS");
        //categoriaI.modificar(1,"cAS", "cas", "CAS");
        //categoriaI.eliminar(1);
        
    }
}
