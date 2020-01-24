package com.fad.pruebas;

import com.fad.dao.existenciaDAO;
import com.fad.dao.tipordeninvDAO;

public class ExistenciaTest {

    public static void main(String[] args) {
        existenciaDAO existenciaI = new existenciaDAO();
        existenciaI.instertar(1, 1, 1);
    }
}
