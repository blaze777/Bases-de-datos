/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import modelo.departamento;

public class Transaccion_departamento {

    static departamento departamentoPasado;
    static String codigo_d = "";
    static String nombre_d = "";
    static String ciudad = "";

    public static departamento dameUndepartamentoDelaBD() {
        departamento r = null;

        try {


            if (ServiciosBD.resultado.next()) {
                codigo_d = ServiciosBD.resultado.getString("codigo_d");
                nombre_d = ServiciosBD.resultado.getString("nombre_d");
                ciudad = ServiciosBD.resultado.getString("ciudad");
                r = new departamento(codigo_d, nombre_d, ciudad);
            }
        } catch (SQLException e) {
            System.out.println("NO LO EJEUCTO EERRRIIRIRIRRORORORORORORROO!!");
            e.printStackTrace();
        }
        return r;
    }



   public static departamento dameelPrimero(){
    departamento r=null;

  try {

  if(ServiciosBD.resultado.first()) {
   codigo_d = ServiciosBD.resultado.getString("codigo_d");
   nombre_d = ServiciosBD.resultado.getString("nombre_d");
   ciudad  =ServiciosBD.resultado.getString("ciudad");
   r = new departamento(codigo_d,nombre_d,ciudad);
  }
  } catch (SQLException e) {
         System.out.println("NO LO EJEUCTO ERROR!!");
   e.printStackTrace();
  }
    return r;
}



    public static void insertedepartamento(departamento x) {
        String q = "INSERT INTO departamento VALUES ('" + x.getcodigo_d() + "','" + x.getnombre_d() + "','" + x.getciudad() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Departamento Insertado");



    }

    public static void borrardepartamento(String codigo_d) {
        String q = "DELETE FROM departamento WHERE codigo_d ='" + codigo_d + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Departamento Borrado");

    }

    public static void modificardepartamento(departamento x) {
        String q = "UPDATE  departamento   SET nombre_d = '" + x.getnombre_d() + "' ," + " ciudad ='" + x.getciudad() + "'   " + "WHERE codigo_d ='" + x.getcodigo_d() + "'";
        ServiciosBD.ejecutarUpdate(q);
         JOptionPane.showMessageDialog(null, "Departamento Actualizado");

    }

    public static departamento buscardepartamentoparalatabla(String nombre) {
        departamento r = null;
        String q = "SELECT *  FROM departamento  " + "WHERE nombre_d ='" + nombre + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUndepartamentoDelaBD();
        return r;
    }

    public static departamento buscardepartamentoPorNombre(String nombre) {
        departamento r = null;
        String q = "SELECT *  FROM departamento  " + "WHERE nombre_d='" + nombre + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUndepartamentoDelaBD();
        JOptionPane.showMessageDialog(null, "Departamento Encontrado");
        return r;
    }
//  ERA LA PRIMERA PARTE
}
