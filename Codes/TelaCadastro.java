package Codes;

import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
 String nome,email,senha,confirmaSenha,cep,complemento;
  
    public TelaCadastro() {
        initComponents();
        //desmarcar o botão de maximizar
        setResizable(false);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        LabelEmail = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        LabelEmail1 = new javax.swing.JLabel();
        TextCEP = new javax.swing.JTextField();
        LabelEmail2 = new javax.swing.JLabel();
        TextNomeCompleto = new javax.swing.JTextField();
        LabelEmail3 = new javax.swing.JLabel();
        LabelEmail4 = new javax.swing.JLabel();
        LabelEmail5 = new javax.swing.JLabel();
        TextComplemento = new javax.swing.JTextField();
        PainelNavBar1 = new javax.swing.JPanel();
        BTwpp = new javax.swing.JButton();
        BTInsta = new javax.swing.JButton();
        BTConjuntos = new javax.swing.JButton();
        BTSeleções = new javax.swing.JButton();
        BTTimes = new javax.swing.JButton();
        LabelCategoria = new javax.swing.JLabel();
        BTQuemSomosNos = new javax.swing.JButton();
        BTduvidas = new javax.swing.JButton();
        BTRastrearPedido = new javax.swing.JButton();
        BTTermosDeerviço = new javax.swing.JButton();
        LabelInformações = new javax.swing.JLabel();
        BTConjuntos1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TextSenha = new javax.swing.JPasswordField();
        TextSenhaConfirmacao = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));
        jPanel1.setPreferredSize(new java.awt.Dimension(1025, 1051));

        PainelNavBar.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtHamburguer.setBackground(new java.awt.Color(115, 115, 115));
        BtHamburguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuHam.png"))); // NOI18N

        BtPesquisar.setBackground(new java.awt.Color(115, 115, 115));
        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupinha.png"))); // NOI18N
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        TextPesquisa.setBackground(new java.awt.Color(232, 232, 232));
        TextPesquisa.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinho.png"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNavBarLayout = new javax.swing.GroupLayout(PainelNavBar);
        PainelNavBar.setLayout(PainelNavBarLayout);
        PainelNavBarLayout.setHorizontalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtHamburguer)
                .addGap(24, 24, 24)
                .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
        );
        PainelNavBarLayout.setVerticalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addComponent(TextPesquisa)
                        .addGap(2, 2, 2))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtPesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtHamburguer, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        LabelEmail.setText("Digite seu email:");

        TextEmail.setBackground(new java.awt.Color(255, 255, 255));
        TextEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(0, 0, 0));

        LabelEmail1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelEmail1.setForeground(new java.awt.Color(0, 0, 0));
        LabelEmail1.setText("Digite seu CEP:");

        TextCEP.setBackground(new java.awt.Color(255, 255, 255));
        TextCEP.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCEP.setForeground(new java.awt.Color(0, 0, 0));

        LabelEmail2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelEmail2.setForeground(new java.awt.Color(0, 0, 0));
        LabelEmail2.setText("Digite seu nome completo:");

        TextNomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        TextNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextNomeCompleto.setForeground(new java.awt.Color(0, 0, 0));

        LabelEmail3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelEmail3.setForeground(new java.awt.Color(0, 0, 0));
        LabelEmail3.setText("Digite sua Senha:");

        LabelEmail4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelEmail4.setForeground(new java.awt.Color(0, 0, 0));
        LabelEmail4.setText("Confirme sua Senha:");

        LabelEmail5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LabelEmail5.setForeground(new java.awt.Color(0, 0, 0));
        LabelEmail5.setText("Digite bloco/casa/Apartamento:");

        TextComplemento.setBackground(new java.awt.Color(255, 255, 255));
        TextComplemento.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextComplemento.setForeground(new java.awt.Color(0, 0, 0));
        TextComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BTwpp.setBackground(new java.awt.Color(115, 115, 115));
        BTwpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wsp.png"))); // NOI18N

        BTInsta.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

        BTConjuntos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos.setText("Conjuntos");
        BTConjuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntosActionPerformed(evt);
            }
        });

        BTSeleções.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTSeleções.setText("Seleções");
        BTSeleções.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSeleçõesActionPerformed(evt);
            }
        });

        BTTimes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTimes.setText("Times");

        LabelCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelCategoria.setText("Categorias");

        BTQuemSomosNos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTQuemSomosNos.setText("Quem somos");

        BTduvidas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTduvidas.setText("Duvídas");

        BTRastrearPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTRastrearPedido.setText("Rastrear Pedido");

        BTTermosDeerviço.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTermosDeerviço.setText("Termos de Serviço");

        LabelInformações.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações.setText("Informações");

        BTConjuntos1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos1.setText("Camisetas");
        BTConjuntos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Suporte via WhatsApp");

        javax.swing.GroupLayout PainelNavBar1Layout = new javax.swing.GroupLayout(PainelNavBar1);
        PainelNavBar1.setLayout(PainelNavBar1Layout);
        PainelNavBar1Layout.setHorizontalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTSeleções)
                            .addComponent(BTTimes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTConjuntos)
                            .addComponent(LabelCategoria)
                            .addComponent(BTConjuntos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(BTInsta)
                                .addGap(30, 30, 30)
                                .addComponent(BTwpp))
                            .addComponent(jLabel1))
                        .addGap(94, 94, 94)))
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTQuemSomosNos)
                    .addComponent(LabelInformações)
                    .addComponent(BTTermosDeerviço)
                    .addComponent(BTduvidas)
                    .addComponent(BTRastrearPedido))
                .addGap(64, 64, 64))
        );
        PainelNavBar1Layout.setVerticalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTInsta)
                            .addComponent(BTwpp)))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelInformações)
                            .addComponent(LabelCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTQuemSomosNos)
                            .addComponent(BTConjuntos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTTermosDeerviço)
                            .addComponent(BTConjuntos))
                        .addGap(6, 6, 6)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTduvidas)
                            .addComponent(BTSeleções))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTRastrearPedido)
                            .addComponent(BTTimes))))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        TextSenha.setBackground(new java.awt.Color(255, 255, 255));
        TextSenha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(0, 0, 0));

        TextSenhaConfirmacao.setBackground(new java.awt.Color(255, 255, 255));
        TextSenhaConfirmacao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextSenhaConfirmacao.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Criar Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PainelNavBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(LabelEmail2)
                        .addGap(18, 18, 18)
                        .addComponent(TextNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(LabelEmail1)
                        .addGap(16, 16, 16)
                        .addComponent(TextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelEmail5)
                        .addGap(17, 17, 17)
                        .addComponent(TextComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(LabelEmail4)
                            .addGap(18, 18, 18)
                            .addComponent(TextSenhaConfirmacao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(LabelEmail3)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(LabelEmail)
                                    .addGap(23, 23, 23)
                                    .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton1)))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelEmail2))
                    .addComponent(TextNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelEmail))
                    .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail3)
                    .addComponent(TextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LabelEmail4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TextSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEmail1)
                    .addComponent(TextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEmail5)
                    .addComponent(TextComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(PainelNavBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void BTConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTConjuntosActionPerformed

    private void BTSeleçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSeleçõesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTSeleçõesActionPerformed

    private void BTConjuntos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTConjuntos1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        nome = TextComplemento.getText();
        email = TextEmail.getText();
        senha = TextSenha.getText();
        confirmaSenha = TextSenhaConfirmacao.getText();
        cep = TextCEP.getText();
        complemento = TextComplemento.getText();        
        
        if(!confirmaSenha.equals(senha)){
          JOptionPane.showMessageDialog(null, "Campo Confirma senha Incorreto", "Erro", JOptionPane.WARNING_MESSAGE);
          confirmaSenha = "";
          TextSenhaConfirmacao.setText("");
          senha = "";
          TextSenha.setText("");
        }// END IF Validação de senha       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTConjuntos1;
    private javax.swing.JButton BTInsta;
    private javax.swing.JButton BTQuemSomosNos;
    private javax.swing.JButton BTRastrearPedido;
    private javax.swing.JButton BTSeleções;
    private javax.swing.JButton BTTermosDeerviço;
    private javax.swing.JButton BTTimes;
    private javax.swing.JButton BTduvidas;
    private javax.swing.JButton BTwpp;
    private javax.swing.JButton BtHamburguer;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelEmail1;
    private javax.swing.JLabel LabelEmail2;
    private javax.swing.JLabel LabelEmail3;
    private javax.swing.JLabel LabelEmail4;
    private javax.swing.JLabel LabelEmail5;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JTextField TextCEP;
    private javax.swing.JTextField TextComplemento;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNomeCompleto;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JPasswordField TextSenhaConfirmacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setMaximumSize(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
