package uta.interfaces;

import java.awt.BorderLayout;
import net.sf.jasperreports.view.JasperViewer;

public class IntPrincipal extends javax.swing.JFrame {

    IntEstudiantes estudiantes = new IntEstudiantes();
    IntReporteCursos repoCursos = new IntReporteCursos();
    IntRepoProvincias provincias = new IntRepoProvincias();
    IntUsuarios usuarios = new IntUsuarios();
    IntCursos cursos = new IntCursos();
    IntRepoGeneral general = new IntRepoGeneral();

    public IntPrincipal() {
        initComponents();
    }

    public void bloquearReportes() {
        mReportes.setEnabled(false);
    }

    public void logout() {
        IntLogin login = new IntLogin();
        login.setVisible(true);
        this.dispose();
    }

    public void abrirIntEstudiantes() {
        if (dkInterfaces.getAllFrames().length == 0) {
            if (!(estudiantes.isVisible())) {
                dkInterfaces.add(estudiantes);
                estudiantes.setVisible(true);
                estudiantes.setClosable(true);
            }
        }
    }

    public void abrirIntReportes() {
        if (dkInterfaces.getAllFrames().length == 0) {
            if (!(repoCursos.isVisible())) {
                dkInterfaces.add(repoCursos);
                repoCursos.setVisible(true);
                repoCursos.setClosable(true);
            }
        }
    }

    public void abrirIntRepoGeneral() {
        if (!(general.isVisible())) {
            dkInterfaces.add(general);
            general.setVisible(true);
            general.setClosable(true);
        }
    }

    public void abrirIntRepoProvincias() {
        if (dkInterfaces.getAllFrames().length == 0) {
            if (!(provincias.isVisible())) {
                dkInterfaces.add(provincias);
                provincias.setVisible(true);
                provincias.setClosable(true);
            }
        }
    }

    public void abrirIntUsuarios() {
        if (dkInterfaces.getAllFrames().length == 0) {
            if (!(usuarios.isVisible())) {
                dkInterfaces.add(usuarios);
                usuarios.setVisible(true);
                usuarios.setClosable(true);
            }
        }
    }

    public void abrirIntCursos() {
        if (dkInterfaces.getAllFrames().length == 0) {
            if (!(cursos.isVisible())) {
                dkInterfaces.add(cursos);
                cursos.setVisible(true);
                cursos.setClosable(true);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkInterfaces = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mInterfaces = new javax.swing.JMenu();
        mIntEstudiantes = new javax.swing.JMenuItem();
        mIntUsuarios = new javax.swing.JMenuItem();
        mIntCursos = new javax.swing.JMenuItem();
        mReportes = new javax.swing.JMenu();
        mIntRepoCursos = new javax.swing.JMenuItem();
        mIntProvincias = new javax.swing.JMenuItem();
        mIntGeneral = new javax.swing.JMenuItem();
        mSesion = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dkInterfacesLayout = new javax.swing.GroupLayout(dkInterfaces);
        dkInterfaces.setLayout(dkInterfacesLayout);
        dkInterfacesLayout.setHorizontalGroup(
            dkInterfacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1228, Short.MAX_VALUE)
        );
        dkInterfacesLayout.setVerticalGroup(
            dkInterfacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        mInterfaces.setText("Interfaces");

        mIntEstudiantes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mIntEstudiantes.setText("Estudiantes");
        mIntEstudiantes.setMargin(new java.awt.Insets(1, 1, 1, 1));
        mIntEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIntEstudiantesActionPerformed(evt);
            }
        });
        mInterfaces.add(mIntEstudiantes);

        mIntUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mIntUsuarios.setText("Usuarios");
        mIntUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIntUsuariosActionPerformed(evt);
            }
        });
        mInterfaces.add(mIntUsuarios);

        mIntCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mIntCursos.setText("Cursos");
        mIntCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIntCursosActionPerformed(evt);
            }
        });
        mInterfaces.add(mIntCursos);

        jMenuBar1.add(mInterfaces);

        mReportes.setText("Reportes");

        mIntRepoCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mIntRepoCursos.setText("Cursos");
        mIntRepoCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIntRepoCursosActionPerformed(evt);
            }
        });
        mReportes.add(mIntRepoCursos);

        mIntProvincias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        mIntProvincias.setText("Provincias");
        mIntProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIntProvinciasActionPerformed(evt);
            }
        });
        mReportes.add(mIntProvincias);

        mIntGeneral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        mIntGeneral.setText("General");
        mIntGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIntGeneralActionPerformed(evt);
            }
        });
        mReportes.add(mIntGeneral);

        jMenuBar1.add(mReportes);

        mSesion.setText("Cerrar sesión");
        mSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSesionActionPerformed(evt);
            }
        });

        miLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        miLogout.setText("Logout");
        miLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogoutActionPerformed(evt);
            }
        });
        mSesion.add(miLogout);

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mSesion.add(miSalir);

        jMenuBar1.add(mSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkInterfaces)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkInterfaces, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mIntEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIntEstudiantesActionPerformed
        abrirIntEstudiantes();
    }//GEN-LAST:event_mIntEstudiantesActionPerformed

    private void mSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSesionActionPerformed

    }//GEN-LAST:event_mSesionActionPerformed

    private void miLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogoutActionPerformed
        logout();
    }//GEN-LAST:event_miLogoutActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void mIntRepoCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIntRepoCursosActionPerformed
        abrirIntReportes();
    }//GEN-LAST:event_mIntRepoCursosActionPerformed

    private void mIntProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIntProvinciasActionPerformed
        abrirIntRepoProvincias();
    }//GEN-LAST:event_mIntProvinciasActionPerformed

    private void mIntUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIntUsuariosActionPerformed
        abrirIntUsuarios();
    }//GEN-LAST:event_mIntUsuariosActionPerformed

    private void mIntCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIntCursosActionPerformed
        abrirIntCursos();
    }//GEN-LAST:event_mIntCursosActionPerformed

    private void mIntGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIntGeneralActionPerformed
        abrirIntRepoGeneral();
    }//GEN-LAST:event_mIntGeneralActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkInterfaces;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mIntCursos;
    private javax.swing.JMenuItem mIntEstudiantes;
    private javax.swing.JMenuItem mIntGeneral;
    private javax.swing.JMenuItem mIntProvincias;
    private javax.swing.JMenuItem mIntRepoCursos;
    private javax.swing.JMenuItem mIntUsuarios;
    private javax.swing.JMenu mInterfaces;
    private javax.swing.JMenu mReportes;
    private javax.swing.JMenu mSesion;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
