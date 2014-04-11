package vista;

import control.ServiciosBD;
import control.Transaccion_departamento;
import modelo.departamento;

public class ventana_departamento extends javax.swing.JFrame {

    Ventana_principal vent;

    public ventana_departamento() {
        ventana_departamento.setDefaultLookAndFeelDecorated(true);
        initComponents();
        this.setLocation(500, 300);
        ServiciosBD.conectar();
    }

    public void muevaloalaventana(departamento x) {

        jTextField_codigo_d.setText(x.getcodigo_d());
        jTextField_nombre_d.setText(x.getnombre_d());
        jTextField_ciudad.setText(x.getciudad());
    }

    public departamento armedepartamentodelaVentana() {

        departamento r = null;
        String codigo_d = jTextField_codigo_d.getText();
        String nombre_d = jTextField_nombre_d.getText();
        String ciudad = jTextField_ciudad.getText();
        r = new departamento(codigo_d, nombre_d, ciudad);

        return r;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_codigo_d = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nombre_d = new javax.swing.JTextField();
        jTextField_ciudad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_del = new javax.swing.JButton();
        jButton_mod = new javax.swing.JButton();
        jButton_buscar = new javax.swing.JButton();
        jTextField_buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("DEPARTAMENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 20));
        getContentPane().add(jTextField_codigo_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, -1));

        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        getContentPane().add(jTextField_nombre_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));
        getContentPane().add(jTextField_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));

        jLabel4.setText("Ciudad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 20));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior_1.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 30));

        jButton_add.setText("add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 73, -1));

        jButton_del.setText("del");
        jButton_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 73, -1));

        jButton_mod.setText("mod");
        jButton_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 73, -1));

        jButton_buscar.setText("buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jTextField_buscar.setText(" 0");
        getContentPane().add(jTextField_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dibujo3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed

        departamento x = null;
        x = armedepartamentodelaVentana();
        Transaccion_departamento.insertedepartamento(x);
        jTextField_codigo_d.setText("");
        jTextField_nombre_d.setText("");
        jTextField_ciudad.setText("");
}//GEN-LAST:event_jButton_addActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        vent = new Ventana_principal();
        this.setVisible(false);

        vent.setVisible(true);
}//GEN-LAST:event_regresarActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed

        String nombre = jTextField_buscar.getText();
        departamento r = Transaccion_departamento.buscardepartamentoPorNombre(nombre);
        if (r == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "NO SE ENCONTRO ESE departamento  ");
        } else {
            muevaloalaventana(r);
        }
}//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButton_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modActionPerformed

        departamento x = null;
        x = armedepartamentodelaVentana();
        Transaccion_departamento.modificardepartamento(x);

}//GEN-LAST:event_jButton_modActionPerformed

    private void jButton_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delActionPerformed

        String codigo_d = jTextField_codigo_d.getText();
        Transaccion_departamento.borrardepartamento(codigo_d);

        jTextField_codigo_d.setText("");
        jTextField_nombre_d.setText("");
        jTextField_ciudad.setText("");

}//GEN-LAST:event_jButton_delActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_del;
    private javax.swing.JButton jButton_mod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_buscar;
    private javax.swing.JTextField jTextField_ciudad;
    private javax.swing.JTextField jTextField_codigo_d;
    private javax.swing.JTextField jTextField_nombre_d;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
