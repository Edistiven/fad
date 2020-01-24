package com.fad.dao;

import com.fad.controller.UsuarioJpaController;
import com.fad.entities.Producto;
import com.fad.entities.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GabuAndLemo
 */
public class usuarioDAO {

    private Usuario usuario = new Usuario();
    private UsuarioJpaController ujc = new UsuarioJpaController();

    /**
     * Funciones basicas CRUD*
     */
    public void insertar(String nombreU, String passwordU) {
        try {
            usuario.setIdUsuario(Integer.MIN_VALUE);
            usuario.setNombreUser(nombreU);
            usuario.setPasswordUser(passwordU);
            ujc.create(usuario);
            System.out.println("Se ha guardado con exito!!!");

            //tipordeninv = new Tipordeninv();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!: ");
            e.printStackTrace();
        }
    }

    public void modificar(int id, String nombreU, String passwordU) {
        try {
            usuario.setIdUsuario(id);
            usuario.setNombreUser(nombreU);
            usuario.setPasswordUser(passwordU);
            ujc.edit(usuario);
            System.out.println("Se ha modificado con exito!!!");

            //tipordeninv = new Tipordeninv();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!" + e);
            e.printStackTrace();
        }
    }

    public void listarUsuarios(JTable tablaP, String nombreUser) {
        DefaultTableModel model;
        String[] titulosU = {"Id", "Nombre", "Password", "Rol"};
        model = new DefaultTableModel(null, titulosU);
        List<Usuario> usuarios = buscarUsuario(nombreUser);

        String[] datosU = new String[4];

        for (Usuario u : usuarios) {
            datosU[0] = u.getIdUsuario().toString();
            datosU[1] = u.getNombreUser();
            datosU[2] = u.getPasswordUser();

            model.addRow(datosU);
        }
        tablaP.setModel(model);
    }

    public void eliminar(int id) {
        try {
            ujc.destroy(id);
            System.out.println("Se ha eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error!!!");
            e.printStackTrace();
        }
    }

    private List<Usuario> buscarUsuario(String user) {

        Usuario u;
        EntityManager em = ujc.getEntityManager(); //
        Query sql = em.createQuery("SELECT u FROM Usuario u WHERE u.nombreUser LIKE :user");
        sql.setParameter("user", user + "%");
        List<Usuario> lista = sql.getResultList();

        return lista;

    }

    public boolean login(String nombreUser, String passwordUser) {

        EntityManager em = ujc.getEntityManager();

        boolean valor;
        try {

            Query sql = em.createQuery("SELECT u.nombreUser, u.passwordUser FROM Usuario u WHERE u.nombreUser = :nombreUser AND u.passwordUser = :passwordUser");
            sql.setParameter("nombreUser", nombreUser);
            sql.setParameter("passwordUser", passwordUser);

            List resultado = sql.getResultList();

            if (!resultado.isEmpty()) {
                valor = true;

            } else {
                valor = false;

            }

        } catch (Exception e) {
            valor = false;

        }
        return valor;
    }
}
