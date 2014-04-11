/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.*;

import javax.swing.JOptionPane;
import modelo.empleado;

public class Transaccion_empleado {

    static String codigo_e;
    static String apellido;
    static String nombre_e;
    static String sexo;
    static int salario;
    static String codigo_d;
    static empleado empleadoPasado;





    public static empleado dameUnempleadoDelaBD() {
        empleado r = null;
        try {

            if (ServiciosBD.resultado.next()) {
                codigo_e = ServiciosBD.resultado.getString("codigo_e");
                apellido = ServiciosBD.resultado.getString("apellido");
                nombre_e = ServiciosBD.resultado.getString("nombre");
                sexo = ServiciosBD.resultado.getString("sexo");
                salario = Integer.parseInt(ServiciosBD.resultado.getString("salario"));
                codigo_d = ServiciosBD.resultado.getString("codigo_d");

                System.out.println(codigo_e);
                 System.out.println(apellido);
                  System.out.println(nombre_e);
                   System.out.println(sexo);
                    System.out.println(salario);
                     System.out.println(codigo_d);
                r = new empleado(codigo_e, apellido, nombre_e, sexo, salario, codigo_d);

                
            }
        } catch (SQLException e) {
            System.out.println("NO LO EJEUCTO EERRRIIRIRIRRORORORORORORROO!!");
            e.printStackTrace();
        }
        return r;
    }

   

    public static void inserteempleado(empleado x) {
        String q = "INSERT INTO empleado VALUES ('" + x.getCodigo_e() + "','" + x.getApellido() + "','" + x.getNombre_e() + "','" + x.getSexo() + "','" + x.getSalario() + "','" + x.getCodigo_d() + "')";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Empleado Insertado");

    }

    public static void borrarempleado(String codigo_e) {
        String q = "DELETE FROM empleado WHERE codigo_e ='" + codigo_e + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Empleado Eliminado");

    }

    public static void modificarempleado(empleado x) {
        String q = "UPDATE  empleado   SET codigo_e = '" + x.getCodigo_e() + "' ," + " apellido ='" + x.getApellido() + "'," + " nombre='" + x.getNombre_e() + "'," + " sexo ='" + x.getSexo() + "'," + " salario ='" + x.getSalario() + "'," + " codigo_d ='" + x.getCodigo_d() + "'   " + "WHERE codigo_e ='" + x.getCodigo_e() + "'";
        ServiciosBD.ejecutarUpdate(q);
         JOptionPane.showMessageDialog(null, "Empleado Actualizado");

    }

  public static empleado buscarempleado(String codigo_e) {
        empleado r = null;
        String q = "SELECT *  FROM empleado  " + "WHERE codigo_e ='" + codigo_e + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnempleadoDelaBD();
        return r;
    }


  public static empleado  buscarEmpleado2(String codigoD){
    empleado r = null;
    String q = "SELECT *  FROM empleado  " +
            "WHERE codigo_d ='"+ codigoD+ "'";
    ServiciosBD.ejecutarConsulta(q);
    r = dameUnempleadoDelaBD();
    return r;
}




     

    
//  ERA LA PRIMERA PARTE
}
