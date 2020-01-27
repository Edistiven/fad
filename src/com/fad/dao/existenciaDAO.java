package com.fad.dao;

import com.fad.controller.ExistenciaJpaController;
import com.fad.entities.Categoria;
import com.fad.entities.Existencia;
import com.fad.entities.Producto;
import com.fad.entities.Usuario;
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
public class existenciaDAO {

    private ExistenciaJpaController ejc = new ExistenciaJpaController();
    private Existencia existencia = new Existencia();
    private Producto producto = new Producto();
    private Categoria categoria = new Categoria();

    /**
     * Funciones basicas CRUD*
     */
    public void insertar(int existenciaIni, int existenciaAct, int valorTotal) {
        try {
            producto = buscarProducto(54);
            categoria = buscarCategoria(7);

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

            existencia = buscarExistencia(id);

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

    public String obtenerId() {
        return "1";
    }

    /**
     * Consultas*
     */
    
    public void listarExistencias(JTable tablaE, String producto) {
        DefaultTableModel model;
        String[] titulosU = {"Id", "Producto", "Descripcion", "Categoría","Existencia Inicial", "Existencia Actual", "V/U", "V/T"};
        model = new DefaultTableModel(null, titulosU);
        List<Existencia> existencias = buscarExistencias(producto);

        String[] datosE = new String[8];

        for (Existencia e : existencias) {
            datosE[0] = e.getIdExistencia();
            datosE[1] = e.getIdProducto().getNombrePro();
            datosE[2] = e.getIdProducto().getDescripcionPro();
            datosE[3] = e.getIdCategoria().getNombreCat();
            datosE[4] = e.getExistenciaIniE().toString();
            datosE[5] = e.getExistenciaActualE().toString();
            datosE[6] = e.getIdProducto().getValorUnitPro().toString();
            datosE[7] = e.getValorTotalE().toString();

            model.addRow(datosE);
        }
        tablaE.setModel(model);
    }
    
    private List<Existencia> buscarExistencias(String producto) {

        EntityManager em = ejc.getEntityManager(); //
        Query sql = em.createQuery("SELECT e FROM Existencia e WHERE e.idProducto.nombrePro LIKE :pro ORDER BY e.idProducto.nombrePro");
        sql.setParameter("pro", producto + "%");
        List<Existencia> lista = sql.getResultList();

        return lista;

    }
    
    private Producto buscarProducto(int id) {

        EntityManager em = ejc.getEntityManager(); //
        Query sql = em.createQuery("SELECT p FROM Producto p WHERE p.idProducto = :idPro");
        sql.setParameter("idPro", id);
        Producto p = (Producto) sql.getSingleResult();

        return p;

    }

    private Categoria buscarCategoria(int id) {

        EntityManager em = ejc.getEntityManager(); //
        Query sql = em.createQuery("SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria");
        sql.setParameter("idCategoria", id);
        Categoria c = (Categoria) sql.getSingleResult();

        return c;

    }

    private Existencia buscarExistencia(String id) {

        EntityManager em = ejc.getEntityManager(); //
        Query sql = em.createQuery("SELECT e FROM Existencia e WHERE e.idExistencia = :idExistencia");
        sql.setParameter("idExistencia", id);
        Existencia e = (Existencia) sql.getSingleResult();

        return e;

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
