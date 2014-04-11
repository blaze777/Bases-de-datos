package vista;

import javax.swing.JFrame;


public class Ventana_principal extends javax.swing.JFrame {

    ventana_departamento departamento = new ventana_departamento();
    ventana_empleado empleado = new ventana_empleado();

    public Ventana_principal() {

        initComponents();
        this.setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        boton_empleado = new javax.swing.JButton();
        Boton_Mostrar_query = new javax.swing.JButton();
        jButton_mostrrar_depto = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boton_query = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_transacciones = new javax.swing.JMenu();
        menu_dpto = new javax.swing.JMenuItem();
        menu_empleado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_query = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa");
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setText("BIENVENIDO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        boton_empleado.setText("Empleado");
        boton_empleado.setContentAreaFilled(false);
        boton_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_empleado(evt);
            }
        });
        getContentPane().add(boton_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 115, -1));

        Boton_Mostrar_query.setContentAreaFilled(false);
        Boton_Mostrar_query.setLabel("Consulta");
        Boton_Mostrar_query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Mostrar_query(evt);
            }
        });
        getContentPane().add(Boton_Mostrar_query, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 100, -1));

        jButton_mostrrar_depto.setText("Departamento");
        jButton_mostrrar_depto.setContentAreaFilled(false);
        jButton_mostrrar_depto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mostrrar_deptoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_mostrrar_depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        boton_salir.setText("Salir");
        boton_salir.setContentAreaFilled(false);
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salir(evt);
            }
        });
        getContentPane().add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dibujo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        boton_query.setText("Query");
        boton_query.setContentAreaFilled(false);
        getContentPane().add(boton_query, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 115, -1));

        jMenuBar1.setName(""); // NOI18N

        Menu_transacciones.setText("Transacciones");

        menu_dpto.setText("Departamento");
        menu_dpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_dpto(evt);
            }
        });
        Menu_transacciones.add(menu_dpto);

        menu_empleado.setText("Empleado");
        menu_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_empleado(evt);
            }
        });
        Menu_transacciones.add(menu_empleado);

        jMenuBar1.add(Menu_transacciones);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_tabla_menu_query(evt);
            }
        });

        menu_query.setText("Query");
        menu_query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_query(evt);
            }
        });
        jMenu2.add(menu_query);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        menu_about.setText("About");
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_about(evt);
            }
        });
        jMenu3.add(menu_about);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_empleado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_empleado
        this.setVisible(false);

        empleado.setVisible(true);
    }//GEN-LAST:event_boton_empleado

    private void boton_salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salir
        System.exit(0);
    }//GEN-LAST:event_boton_salir

    private void menu_dpto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_dpto
        this.setVisible(false);
        departamento.setVisible(true);
    }//GEN-LAST:event_menu_dpto

    private void menu_empleado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_empleado
        this.setVisible(false);
        empleado.setVisible(true);
    }//GEN-LAST:event_menu_empleado

    private void Mostrar_tabla_menu_query(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_tabla_menu_query
    }//GEN-LAST:event_Mostrar_tabla_menu_query

    private void jButton_mostrrar_deptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mostrrar_deptoActionPerformed
        this.setVisible(false);
        departamento.setVisible(true);

}//GEN-LAST:event_jButton_mostrrar_deptoActionPerformed

    private void menu_about(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_about
       mostrar_about();
}//GEN-LAST:event_menu_about

    private void Boton_Mostrar_query(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Mostrar_query
        mostrar_QUERY();
}//GEN-LAST:event_Boton_Mostrar_query

    private void menu_query(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_query
         mostrar_QUERY();
}//GEN-LAST:event_menu_query

    public void mostrar_QUERY() {

        Query dialog = new Query(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);

    }


    public void mostrar_about(){

    About dialog = new About(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                Ventana_principal.setDefaultLookAndFeelDecorated(true);
                new Ventana_principal().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Mostrar_query;
    private javax.swing.JMenu Menu_transacciones;
    private javax.swing.JButton boton_empleado;
    private javax.swing.JButton boton_query;
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton jButton_mostrrar_depto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_about;
    private javax.swing.JMenuItem menu_dpto;
    private javax.swing.JMenuItem menu_empleado;
    private javax.swing.JMenuItem menu_query;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
