package uta.interfaces;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IntLogin extends javax.swing.JFrame {

    public IntLogin() {
        initComponents();
        //Añadido el logo 
        ImageIcon img = new ImageIcon("src/uta/icon/Logo_LogIn.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(lbIcono.getWidth(), lbIcono.getHeight(), Image.SCALE_DEFAULT));
        lbIcono.setIcon(icono);
        this.repaint();
    }
    

    int k = 0, suma1 = 0, nd = 0, nc = 0, ns = 0, nm = 0, nf = 0, np = 0;
    int n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, acum = 0, dec, aux;
    String msk;

    public void validarCedula(String ced) {
        //do {
        msk = "ok";
        if (ced.length() < 10 || ced.length() > 10) {
            msk = "ERROR ==> *** N. Cédula Incorrecta ***";
            JOptionPane.showMessageDialog(null, msk);
        } else {

            n0 = (ced.charAt(0)) - 48;
            n1 = (ced.charAt(1)) - 48;
            n2 = (ced.charAt(2)) - 48;
            n3 = (ced.charAt(3)) - 48;
            n4 = (ced.charAt(4)) - 48;
            n5 = (ced.charAt(5)) - 48;
            n6 = (ced.charAt(6)) - 48;
            n7 = (ced.charAt(7)) - 48;
            n8 = (ced.charAt(8)) - 48;
            n9 = (ced.charAt(9)) - 48;
            aux = (n0 * 10) + n1;
            if (aux > 24) {
                msk = "ERROR ==> *** N. Cédula Incorrecta ***";
                JOptionPane.showMessageDialog(null, msk);
            } else {
                n0 = n0 * 2;
                n2 = n2 * 2;
                n4 = n4 * 2;
                n6 = n6 * 2;
                n8 = n8 * 2;

                if (n0 >= 9) {
                    n0 = n0 - 9;
                } else if (n2 >= 9) {
                    n2 = n2 - 9;
                } else if (n4 >= 9) {
                    n4 = n4 - 9;
                } else if (n6 >= 9) {
                    n6 = n6 - 9;
                } else if (n8 >= 9) {
                    n8 = n8 - 9;
                }

                acum = n0 + n1 + +n2 + n3 + n4 + n5 + n6 + n7 + n8;

                if (acum <= 9) {

                    dec = 10 - acum;

                } else {
                    dec = (int) acum / 10;
                    dec = (dec * 10) + 10;
                    dec = dec - acum;
                }

                if (dec == n9) {
                    msk = "ok";
                } else {
                    msk = "ERROR ==> *** N. Cédula Incorrecta ***";
                    JOptionPane.showMessageDialog(null, msk);
                }
            }
        }
        //} while (!("ERROR ==> *** N. Cédula Incorrecta ***".equals(msk)));
    }
    

    public void cargarUsuario() {
        try {
            String[] usuario = new String[3];
            if (txtUsuario.getText().isEmpty() || pfClave.getPassword().length == 0) {
                if(txtUsuario.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete los campos requeridos");
                   txtUsuario.requestFocus(); 
                }else if(pfClave.getPassword().length == 0){
                    JOptionPane.showMessageDialog(null, "Complete los campos requeridos");
                    pfClave.requestFocus();
                }
            } else {
                //Validacion de cedula;
                validarCedula(txtUsuario.getText());
            } 
            
            String contra = String.valueOf(pfClave.getPassword());
            conexion cc = new conexion();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select * from usuarios where CED_USU ='" + txtUsuario.getText() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                usuario[0] = rs.getString("CED_USU");
                usuario[1] = rs.getString("CLA_USU");
                usuario[2] = rs.getString("PER_USU");
            }

            if (usuario[1].equals(contra)) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Logueado con éxito");
                IntPrincipal principal = new IntPrincipal();
                principal.setVisible(true);
                if (!usuario[2].equals("ADMIN")) {
                    principal.bloquearReportes();
                }
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Error en al conectar a la Base de Datos");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pfClave = new javax.swing.JPasswordField();
        lbIcono = new javax.swing.JLabel();
        pBotones = new javax.swing.JPanel();
        btIngresar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Clave");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCamposLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIngresar)
                    .addComponent(btCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIngresar)
                .addGap(32, 32, 32)
                .addComponent(btCancelar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        cargarUsuario();
    }//GEN-LAST:event_btIngresarActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char c;
        c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(IntLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbIcono;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPasswordField pfClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
