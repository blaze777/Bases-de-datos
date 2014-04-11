package vista;

import control.ServiciosBD;
import control.Transaccion_empleado;
import java.awt.event.ItemEvent;
import modelo.empleado;

public class ventana_empleado extends javax.swing.JFrame {

    Ventana_principal vent;
    String sexo = "";

    public ventana_empleado() {
        initComponents();
        this.setLocation(500, 300);
        ventana_empleado.setDefaultLookAndFeelDecorated(true);
        ServiciosBD.conectar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_codigo_e = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nombre_e = new javax.swing.JTextField();
        jTextField_apellido_e = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jTextField_salario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Macho = new javax.swing.JCheckBox();
        Hembra = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_codigo_d = new javax.swing.JTextField();
        jTextField_buscar = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        Adicionar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setText("EMPLEADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 240, 30));
        getContentPane().add(jTextField_codigo_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));

        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));
        getContentPane().add(jTextField_nombre_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));
        getContentPane().add(jTextField_apellido_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior_1.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));
        getContentPane().add(jTextField_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, -1));

        jLabel6.setText("Salario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        Macho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MachoItemStateChanged(evt);
            }
        });
        getContentPane().add(Macho, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        Hembra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HembraItemStateChanged(evt);
            }
        });
        getContentPane().add(Hembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel5.setText("M");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel8.setText("F");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel9.setText("Sexo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        getContentPane().add(jTextField_codigo_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, -1));
        getContentPane().add(jTextField_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, -1));

        buscar.setText("buscar");
        buscar.setContentAreaFilled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        modificar.setText("mod");
        modificar.setContentAreaFilled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        eliminar.setText("del");
        eliminar.setContentAreaFilled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 55, -1));

        Adicionar.setText("add");
        Adicionar.setContentAreaFilled(false);
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel10.setText("Codigo_d");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        // TODO add your handling code here:
        empleado x = null;
        x = armeempleadodelaVentana();
        Transaccion_empleado.inserteempleado(x);
}//GEN-LAST:event_AdicionarActionPerformed

    public empleado armeempleadodelaVentana() {
        empleado r = null;
        String codigo_e = jTextField_codigo_e.getText();
        String apellido = jTextField_apellido_e.getText();
        String nombre_e = jTextField_nombre_e.getText();
        int salario = Integer.parseInt(jTextField_salario.getText());
        String codigo_d = jTextField_codigo_d.getText();

        r = new empleado(codigo_e, apellido, nombre_e, sexo, salario, codigo_d);


        return r;
    }


    public void muevaloalaventana(empleado x) {

        jTextField_codigo_d.setText(x.getCodigo_d());
        jTextField_apellido_e.setText(x.getApellido());
        jTextField_nombre_e.setText(x.getNombre_e());
        jTextField_salario.setText(x.getSalario()+"");
        jTextField_codigo_e.setText(x.getCodigo_e());

    }
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        vent = new Ventana_principal();
        this.setVisible(false);
        vent.setVisible(true);

}//GEN-LAST:event_regresarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        String codigo_e = jTextField_buscar.getText();
        Transaccion_empleado.buscarempleado(codigo_e);
      empleado r = Transaccion_empleado.buscarempleado(codigo_e);
        muevaloalaventana(r);

    if (r == null) {
    javax.swing.JOptionPane.showMessageDialog(this, "NO SE ENCONTRO ESE empleado  ");
    } else {

    }


}//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        empleado x = null;
        x = armeempleadodelaVentana();
        Transaccion_empleado.modificarempleado(x);


}//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String codigo_d = jTextField_codigo_e.getText();
        Transaccion_empleado.borrarempleado(codigo_d);

}//GEN-LAST:event_eliminarActionPerformed

    private void MachoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MachoItemStateChanged
        int state = evt.getStateChange();
        if (state == ItemEvent.SELECTED) {
            sexo = "M";

        } else {
            sexo = "";

        }

}//GEN-LAST:event_MachoItemStateChanged

    private void HembraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HembraItemStateChanged
        int state = evt.getStateChange();
        if (state == ItemEvent.SELECTED) {
            sexo = "F";

        } else {
            sexo = "";

        }

}//GEN-LAST:event_HembraItemStateChanged

    public empleado Armeempleado() {
        empleado r = null;
        String codigo_e = jTextField_codigo_e.getText();
        String apellido = jTextField_apellido_e.getText();
        String nombre_e = jTextField_nombre_e.getText();
        int salario = Integer.parseInt(jTextField_salario.getText());
        String codigo_d = jTextField_codigo_d.getText();

        r = new empleado(codigo_e, apellido, nombre_e, sexo, salario, codigo_d);
        return r;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JCheckBox Hembra;
    private javax.swing.JCheckBox Macho;
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_apellido_e;
    private javax.swing.JTextField jTextField_buscar;
    private javax.swing.JTextField jTextField_codigo_d;
    private javax.swing.JTextField jTextField_codigo_e;
    private javax.swing.JTextField jTextField_nombre_e;
    private javax.swing.JTextField jTextField_salario;
    private javax.swing.JButton modificar;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
