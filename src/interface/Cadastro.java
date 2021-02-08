
import codeprojeto.Cliente;
import codeprojeto.Login;
import javax.swing.JLabel;


public class Cadastro extends javax.swing.JDialog {

    protected String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    protected String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    protected String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String pix1;

    public String getPix1() {
        return pix1;
    }

    public void setPix1(String pix1) {
        this.pix1 = pix1;
    }

    public String getPix2() {
        return pix2;
    }

    public void setPix2(String pix2) {
        this.pix2 = pix2;
    }

    public String getPix3() {
        return pix3;
    }

    public void setPix3(String pix3) {
        this.pix3 = pix3;
    }
    public String pix2;
    public String pix3;
    
    public Cadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable (false);
        lb_alerta.setVisible(false);
        
    }
    
    Login valor= new Login();
    Usuario info = new Usuario();
    
    public void salvaDados(){
        Cliente dado = new Cliente();
        dado.CadastroCliente(this.nome,this.email,this. telefone,this.senha);
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_login_cad = new javax.swing.JTextField();
        text_email_cad = new javax.swing.JTextField();
        text_tel_cad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        text_senha_cad = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_cancelar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_alerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_30px.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_secured_letter_30px.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_phone_30px_1.png"))); // NOI18N

        text_login_cad.setText(" Login");
        text_login_cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_login_cadMouseClicked(evt);
            }
        });
        text_login_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_login_cadActionPerformed(evt);
            }
        });

        text_email_cad.setText(" Email");
        text_email_cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_email_cadMouseClicked(evt);
            }
        });
        text_email_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_email_cadActionPerformed(evt);
            }
        });

        text_tel_cad.setText(" Telefone");
        text_tel_cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_tel_cadMouseClicked(evt);
            }
        });
        text_tel_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tel_cadActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bt_Conf.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        text_senha_cad.setText("digitesuasenha");
        text_senha_cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_senha_cadMouseClicked(evt);
            }
        });
        text_senha_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_senha_cadActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_lock_30px_1.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(91, 110, 128));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Criar sua conta");

        jSeparator1.setForeground(new java.awt.Color(91, 110, 128));

        lb_cancelar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lb_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cancelar.setText("Cancelar");
        lb_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cancelarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(91, 110, 128));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Após a criação de sua conta o sistema irá gerar outras três chaves PIX altomaticamente");

        lb_alerta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_alerta.setForeground(new java.awt.Color(204, 0, 0));
        lb_alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_alerta.setText("*Todos os campos devem ser preenchidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_login_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(text_senha_cad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(text_email_cad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(text_tel_cad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(lb_alerta))
                        .addGap(174, 174, 174))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(text_login_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(text_senha_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_email_cad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_tel_cad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_alerta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_cancelar)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_login_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_login_cadActionPerformed
        nome = text_email_cad.getText();
        //text_email_cad.setText(nome);
    }//GEN-LAST:event_text_login_cadActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        valor.validaLogin(nome, senha);
        nome = text_email_cad.getText();
        senha = text_senha_cad.getText();
        telefone = text_tel_cad.getText();
        email = text_email_cad.getText();
        info.getLb_pix1().setText(valor.getPix1User());
        pix2=valor.getPix2User();
        pix3=valor.getPix3User();
        //System.out.println(info.getLb_pix1().getText());
        
        
        
        if(text_login_cad.getText().equals(" ")||text_senha_cad.getText().equals("")||text_email_cad.getText().equals("")||text_tel_cad.getText().equals("")){
        lb_alerta.setVisible(true);
        }
        if(text_login_cad.getText().equals("Login")||text_senha_cad.getText().equals("digitesuasenha")||text_email_cad.getText().equals("Email")||text_tel_cad.getText().equals("Telefone")){
        lb_alerta.setVisible(true);
        }
        else{
        System.out.println(text_login_cad.getText());
        System.out.println(text_senha_cad.getText());
        System.out.println(text_email_cad.getText());
        System.out.println(text_tel_cad.getText());
        dispose();
        new Interface().setVisible(true);   
        }
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void text_senha_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_senha_cadActionPerformed
        senha = text_senha_cad.getText();
        //text_email_cad.setText(senha);
    }//GEN-LAST:event_text_senha_cadActionPerformed

    private void text_tel_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tel_cadActionPerformed
        telefone = text_tel_cad.getText();
        //text_email_cad.setText(nome);
    }//GEN-LAST:event_text_tel_cadActionPerformed

    private void text_email_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_email_cadActionPerformed
        email = text_email_cad.getText();
        //text_email_cad.setText(email);
    }//GEN-LAST:event_text_email_cadActionPerformed

    private void text_login_cadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_login_cadMouseClicked
        text_login_cad.setText("");
        
    }//GEN-LAST:event_text_login_cadMouseClicked

    private void text_senha_cadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_senha_cadMouseClicked
        text_senha_cad.setText("");
    }//GEN-LAST:event_text_senha_cadMouseClicked

    private void text_email_cadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_email_cadMouseClicked
        text_email_cad.setText("");
    }//GEN-LAST:event_text_email_cadMouseClicked

    private void text_tel_cadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_tel_cadMouseClicked
        text_tel_cad.setText("");
    }//GEN-LAST:event_text_tel_cadMouseClicked

    private void lb_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cancelarMouseClicked
        new Interface().setVisible(true);
        dispose();
    }//GEN-LAST:event_lb_cancelarMouseClicked

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro dialog = new Cadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_alerta;
    private javax.swing.JLabel lb_cancelar;
    private javax.swing.JTextField text_email_cad;
    private javax.swing.JTextField text_login_cad;
    private javax.swing.JPasswordField text_senha_cad;
    private javax.swing.JTextField text_tel_cad;
    // End of variables declaration//GEN-END:variables
}
