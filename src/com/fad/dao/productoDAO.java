package com.fad.dao;

import com.fad.controller.ProductoJpaController;
import com.fad.controller.TipordeninvJpaController;
import com.fad.entities.Producto;
import com.fad.entities.Tipordeninv;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GabuAndLemo
 */
public class productoDAO {
    
    private ProductoJpaController pjc = new ProductoJpaController();
    private Producto producto = new Producto();
    
    /**Funciones basicas CRUD**/
    public void insertar(String nombreP, String descripcionP, double valorP) {
        try {
            producto.setIdProducto(Integer.BYTES);
            producto.setNombrePro(nombreP);
            producto.setDescripcionPro(descripcionP);
            producto.setValorUnitPro(valorP);
            pjc.create(producto);
            
            System.out.println("Se ha guardado con exito!!!");
            
            //tipordeninv = new Tipordeninv();
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!: ");
            e.printStackTrace();
        }
    }
    
    public void modificar(int id, String nombreP, String descripcionP, double valorP) {
        try {
            producto.setIdProducto(id);
            producto.setNombrePro(nombreP);
            producto.setDescripcionPro(descripcionP);
            producto.setValorUnitPro(valorP);
            pjc.edit(producto);
            
            System.out.println("Se ha modificado con exito!!!");
            
            //tipordeninv = new Tipordeninv();
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!" + e);
            e.printStackTrace();
        }
    }
    
    public void eliminar(int id) {
        try {
            pjc.destroy(id);
            System.out.println("Se ha eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!");
            e.printStackTrace();
        }
    }
    
    public void listarProductos(JTable tablaP, String nombreP){
        DefaultTableModel model;
        String [] titulosP = {"Id","Nombre", "Descripción", "V.U."};
        model =  new DefaultTableModel(null, titulosP);
        List<Producto> productos = buscarProducto(nombreP);
        
        String [] datosP = new String[4];
        
        for(Producto p : productos){
            datosP[0] = p.getIdProducto().toString();
            datosP[1] = p.getNombrePro();
            datosP[2] = p.getDescripcionPro();
            datosP[3] = p.getValorUnitPro().toString();
            model.addRow(datosP);
        }
        tablaP.setModel(model);
    }
    
    
    private List<Producto> buscarProducto(String nombreP) {

        Producto pro;
        EntityManager em = pjc.getEntityManager(); //
        Query sql = em.createQuery("SELECT p FROM Producto p WHERE p.nombrePro LIKE :nombreP");
        sql.setParameter("nombreP", nombreP + "%");
        List<Producto> lista = sql.getResultList();

        return lista;

    }
}
