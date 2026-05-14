/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection conectar ;
    public Connection conectar (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //jdbc:mysql://localhost:aquivaelpuertodelxampp3315/nombredelaBD","root",""
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3315/cuarto","root","");
            //JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conectar;
    }
}