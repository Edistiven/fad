package com.fad.dao;

import com.fad.controller.ExistenciaJpaController;
import com.fad.controller.ProductoJpaController;
import com.fad.controller.TipordeninvJpaController;
import com.fad.entities.Categoria;
import com.fad.entities.Existencia;
import com.fad.entities.Producto;
import com.fad.entities.Tipordeninv;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author GabuAndLemo
 */
public class existenciaDAO {

    private ExistenciaJpaController ejc = new ExistenciaJpaController();
    private Existencia existencia = new Existencia();
    private ProductoJpaController pjc = new ProductoJpaController();
    private Producto producto = new Producto();
    private Categoria categoria = new Categoria();

    /**
     * Funciones basicas CRUD*
     */
    public void instertar(int existenciaIni, int existenciaAct, int valorTotal) {
        try {
            producto = buscarProducto(1);
            categoria = buscarCategoria(1);
            
            existencia.setIdProducto(producto);
            existencia.setIdCategoria(categoria);
            existencia.setIdExistencia(obtenerId());
            existencia.setExistenciaActualE(BigInteger.valueOf(existenciaAct));
            existencia.setExistenciaIniE(BigInteger.valueOf(existenciaIni));
            existencia.setValorTotalE(BigInteger.valueOf(valorTotal));
            
            ejc.create(existencia);
            
            System.out.println("Se ha guardado con exito!!!");

            //tipordeninv = new Tipordeninv();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!: ");
            e.printStackTrace();
        }
    }

    public void modificar(String id, int existenciaIni, int existenciaAct, int valorTotal) {
        try {

            existencia.setIdExistencia(id);
            existencia.setExistenciaActualE(BigInteger.valueOf(existenciaAct));
            existencia.setExistenciaIniE(BigInteger.valueOf(existenciaIni));
            existencia.setValorTotalE(BigInteger.valueOf(valorTotal));
            
            ejc.edit(existencia);

            System.out.println("Se ha modificado con exito!!!");

            //tipordeninv = new Tipordeninv();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!" + e);
            e.printStackTrace();
        }
    }

    public void eliminar(String id) {
        try {
            ejc.destroy(id);
            System.out.println("Se ha eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!");
            e.printStackTrace();
        }
    }
    
    public String obtenerId(){
        return "1";
    }

    /**
     * Consultas*
     */
    private Producto buscarProducto(int id) {

        EntityManager em = pjc.getEntityManager(); //
        Query sql = em.createQuery("SELECT p FROM Producto p WHERE p.idProducto = :idPro");
        sql.setParameter("idPro", id);
        Producto p = (Producto) sql.getSingleResult();

        return p;

    }

    private Categoria buscarCategoria(int id) {

        EntityManager em = pjc.getEntityManager(); //
        Query sql = em.createQuery("SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria");
        sql.setParameter("idCategoria", id);
        Categoria c = (Categoria) sql.getSingleResult();

        return c;

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
