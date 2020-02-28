package com.fad.dao;

import com.fad.controller.MovimientoinventarioJpaController;
import com.fad.controller.TipordeninvJpaController;
import com.fad.entities.Existencia;
import com.fad.entities.Movimientoinventario;
import com.fad.entities.Ordeninventario;
import com.fad.entities.Tipordeninv;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GabuAndLemo
 */
public class movimientoinventarioDAO {

    /**
     * Servicios *
     */
    private MovimientoinventarioJpaController mjc = new MovimientoinventarioJpaController();

    /**
     * Variables *
     */
    /* Orden de Inventario */
    Ordeninventario ordenInventario = new Ordeninventario();
    ArrayList<Ordeninventario> ordenInventarios = new ArrayList<>();

    /* Mov de Inventario */
    Movimientoinventario movimientoInventario = new Movimientoinventario();
    ArrayList<Movimientoinventario> movimientoInventariosTemp = new ArrayList<>();

    /* Tipo de Inventario */
    Tipordeninv tipordeninv = new Tipordeninv();

    /**
     * Funciones basicas CRUD*
     */
    public void insertar(String nombreToi, String descripcionToi) {
        try {

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!: ");
            e.printStackTrace();
        }
    }

    public void modificar(int ids, String nombreToi, String descripcionToi) {
        try {

            //tipordeninv = new Tipordeninv();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!" + e);
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try {

        } catch (Exception e) {

        }
    }

    public void listarOrdenesInventarios(JTable tablaOI, String id) {
        DefaultTableModel model;
        String[] titulosU = {"Id", "Responsable", "Fecha", "Descripcion"};
        model = new DefaultTableModel(null, titulosU);
        ordenInventarios = (ArrayList<Ordeninventario>) buscarOrden(id);

        String[] datosO = new String[4];

        for (Ordeninventario o : ordenInventarios) {
            datosO[0] = o.getIdOrdeninventario();
            datosO[1] = o.getResponsableOi();
            datosO[2] = o.getFechaOi()+"";
            datosO[3] = o.getDescripcionOi();
            
            model.addRow(datosO);
        }
        tablaOI.setModel(model);
    }
    
    
    
    

    /**
     * Consultas SQL*
     */
    private List<Ordeninventario> buscarOrden(String id) {

        EntityManager em = mjc.getEntityManager(); // SELECT o FROM Ordeninventario o WHERE o.idOrdeninventario = :idOrdeninventario
        Query sql = em.createQuery("SELECT o FROM Ordeninventario o WHERE o.idOrdeninventario LIKE :id ORDER BY o.idOrdeninventario");
        sql.setParameter("id", id + "%");
        List<Ordeninventario> lista = sql.getResultList();

        return lista;

    }

    /**
     * GET AND SET*
     */
    public Ordeninventario getOrdenInventario() {
        return ordenInventario;
    }

    public void setOrdenInventario(Ordeninventario ordenInventario) {
        this.ordenInventario = ordenInventario;
    }

    public ArrayList<Ordeninventario> getOrdenInventarios() {
        return ordenInventarios;
    }

    public void setOrdenInventarios(ArrayList<Ordeninventario> ordenInventarios) {
        this.ordenInventarios = ordenInventarios;
    }

    public Movimientoinventario getMovimientoInventario() {
        return movimientoInventario;
    }

    public void setMovimientoInventario(Movimientoinventario movimientoInventario) {
        this.movimientoInventario = movimientoInventario;
    }

    public ArrayList<Movimientoinventario> getMovimientoInventariosTemp() {
        return movimientoInventariosTemp;
    }

    public void setMovimientoInventariosTemp(ArrayList<Movimientoinventario> movimientoInventariosTemp) {
        this.movimientoInventariosTemp = movimientoInventariosTemp;
    }

    public Tipordeninv getTipordeninv() {
        return tipordeninv;
    }

    public void setTipordeninv(Tipordeninv tipordeninv) {
        this.tipordeninv = tipordeninv;
    }

}
