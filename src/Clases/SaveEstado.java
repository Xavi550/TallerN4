/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.FormMenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SaveEstado {
    
    public void guardarEstado(String txtEstado) {
        if (txtEstado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos recibidos.");
            return;
        }

        ConexionDB db = new ConexionDB();
        String sql = "INSERT INTO estado_objeto(fecha, estado) VALUES (?, ?)";
        JOptionPane.showMessageDialog(null, "Guardado correctamente");
        /*try (Connection conexion = db.conectar();
            PreparedStatement pst = conexion.prepareStatement(sql)) {
            pst.setString(1, lblTexto);
            //pst.setString(2, jTextPass);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario");
        }*/
    }

    public void accesoUsuario(String user, String pass) {
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa usuario y contraseña.");
            return;
        }

        ConexionDB db = new ConexionDB();
        String usuarioCorrecto = null;
        String passCorrecto = null;
        try (Connection cn = db.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT user, password FROM usuario WHERE user = ?")) {
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                usuarioCorrecto = rs.getString(1);
                passCorrecto = rs.getString(2);
            }

            if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
                JOptionPane.showMessageDialog(null, "Login correcto. Bienvenido " + user);
                FormMenuPrincipal objetoMenu = new FormMenuPrincipal();
                objetoMenu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }
}
