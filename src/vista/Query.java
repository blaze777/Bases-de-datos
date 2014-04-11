package vista;

import javax.swing.table.DefaultTableModel;

import modelo.*;
import control.*;

public class Query extends javax.swing.JDialog {

    DefaultTableModel modelo;

    public Query(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
        this.setLocation(500, 300);
        ServiciosBD.conectar();
        ServiciosBD.ejecutarConsulta("SELECT * FROM DEPARTAMENTO");
        cargueCB();

    }

    public void cargueCB() {

        departamento x = null;
        x = Transaccion_departamento.dameelPrimero();
        while (x != null) {
            jComboBox1.addItem(x.getnombre_d());
            x = Transaccion_departamento.dameUndepartamentoDelaBD();
        }
    }

    public void llenarTabla(empleado emp) {

        Object[] fila = new Object[6];
        fila[0] = emp.getCodigo_e();
        fila[1] = emp.getNombre_e();
        fila[2] = emp.getApellido();
        fila[3] = emp.getSexo();
        fila[4] = emp.getSalario();
        fila[5] = emp.getCodigo_d();


        modelo.addRow(fila);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jButton_regresar = new javax.swing.JButton();
        jButton_mostrar_datos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 102, 255));
        jTable1.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 430, 80));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 230, -1));

        jButton_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior_1.png"))); // NOI18N
        jButton_regresar.setContentAreaFilled(false);
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 57, 25));

        jButton_mostrar_datos.setText("Mostrar");
        jButton_mostrar_datos.setContentAreaFilled(false);
        jButton_mostrar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mostrar_datosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_mostrar_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/query.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        Ventana_principal pp = new Ventana_principal();//creo la ventana libros
        pp.setVisible(true);
        this.setVisible(false);

}//GEN-LAST:event_jButton_regresarActionPerformed

    private void jButton_mostrar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mostrar_datosActionPerformed

        String selecionado = (String) jComboBox1.getSelectedItem();
        departamento x = Transaccion_departamento.buscardepartamentoparalatabla(selecionado);//buscarDepartamentoPorNombre(selecionado);
        empleado em = Transaccion_empleado.buscarEmpleado2(x.getcodigo_d());

        modelo = new DefaultTableModel();

        jTable1.setModel(modelo);
        modelo.addColumn("Codigo_e");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Sexo");
        modelo.addColumn("Salario");
        modelo.addColumn("Codigo_d");
        //modelo.addColumn("jefe");

        while (em != null) {
            if (x.getcodigo_d().equals(em.getCodigo_d())) {
                llenarTabla(em);
            }
            em = Transaccion_empleado.dameUnempleadoDelaBD();
        }

}//GEN-LAST:event_jButton_mostrar_datosActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_mostrar_datos;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
