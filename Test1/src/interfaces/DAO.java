/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;

/*
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
 */
/**
 *
 * @author Usuario
 */
public class DAO {

    public void insertEstudent(Estudiante est) {
        try {
            Conexion cn = new Conexion();
            Connection cc = cn.conectar();
            String sql = "insert into estudiante values (?,?,?,?,?)";
            PreparedStatement psd = cc.prepareStatement(sql);
            psd.setString(1, est.getEstCedula());
            psd.setString(2, est.getEstNombre());
            psd.setString(3, est.getEstApellido());
            psd.setString(4, est.getEstDireccion());
            psd.setString(5, est.getEstTelefono());
            int res = psd.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se inserto correctamente");
                //selectEstudent();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public ArrayList<Estudiante> selectStudentDao() {

        try {
            //List<Estudiante> lista = new ArrayList();
            ArrayList<Estudiante> lista = new ArrayList<>();
            Conexion cn = new Conexion();
            Connection cc = cn.conectar();
            String sql = "select * from estudiante";
            Statement psd = cc.createStatement();
            ResultSet rs = psd.executeQuery(sql);
            while (rs.next()) {
                /*
                registros[0] = rs.getString("estCedula");
                registros[1] = rs.getString("estNombre");
                registros[2] = rs.getString("estApellido");
                registros[3] = rs.getString("estDireccion");
                registros[4] = rs.getString("estTelefono");
                model.addRow(registros);
                 */
                Estudiante est = new Estudiante(rs.getString("estCedula"), rs.getString("estNombre"),
                        rs.getString("estApellido"), rs.getString("estDireccion"),
                        rs.getString("estTelefono"));
                lista.add(est);
            }
            return lista;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public void updateEstudent(Estudiante est) {
        try {
            Conexion cn = new Conexion();
            Connection cc = cn.conectar();
            String sql = "UPDATE estudiante SET estNombre=?, estApellido=?, estDireccion=?, estTelefono=? WHERE estCedula=?";
            PreparedStatement psd = cc.prepareStatement(sql);
            psd.setString(1, est.getEstNombre());
            psd.setString(2, est.getEstApellido());
            psd.setString(3, est.getEstDireccion());
            psd.setString(4, est.getEstTelefono());
            psd.setString(5, est.getEstCedula()); 
            int res = psd.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Estudiante actualizado correctamente");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en DAO Update: " + ex);
        }
    }

    public void deleteEstudent(String cedula) {
        try {
            Conexion cn = new Conexion();
            Connection cc = cn.conectar();
            String sql = "DELETE FROM estudiante WHERE estCedula=?";
            PreparedStatement psd = cc.prepareStatement(sql);
            psd.setString(1, cedula);
            int res = psd.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Estudiante eliminado de la base de datos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en DAO Delete: " + ex);
        }
    }

}

