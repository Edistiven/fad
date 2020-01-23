package com.fad.dao;

import com.fad.controller.CategoriaJpaController;
import com.fad.controller.TipordeninvJpaController;
import com.fad.entities.Categoria;
import com.fad.entities.Tipordeninv;

/**
 *
 * @author GabuAndLemo
 */
public class categoriaDAO {
    
    private CategoriaJpaController cjc = new CategoriaJpaController();
    private Categoria categoria = new Categoria();
    
    /**Funciones basicas CRUD**/
    public void instertar(String nombreC, String descripcionToiC, String siglaC) {
        try {
            categoria.setIdCategoria(Integer.BYTES);
            categoria.setNombreCat(nombreC);
            categoria.setDescripcionCat(descripcionToiC);
            categoria.setSiglaCat(siglaC);
            cjc.create(categoria);
            
            System.out.println("Se ha guardado con exito!!!");
            
            //tipordeninv = new Tipordeninv();
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!: ");
            e.printStackTrace();
        }
    }
    
    public void modificar(int ids, String nombreC, String descripcionToiC, String siglaC) {
        try {
            categoria.setIdCategoria(ids);
            categoria.setNombreCat(nombreC);
            categoria.setDescripcionCat(descripcionToiC);
            categoria.setSiglaCat(siglaC);
            cjc.edit(categoria);
            
            System.out.println("Se ha modificado con exito!!!");
            
            //tipordeninv = new Tipordeninv();
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!" + e);
            e.printStackTrace();
        }
    }
    
    public void eliminar(int id) {
        try {
            cjc.destroy(id);
            System.out.println("Se ha eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!");
            e.printStackTrace();
        }
    }
}
