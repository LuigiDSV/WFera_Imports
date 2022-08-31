package Codes;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class TelaQuemSomosNos extends javax.swing.JFrame {

    public TelaQuemSomosNos() {
        initComponents();
        //centralizar na tela
        setLocationRelativeTo(null);
        //desmarcar o botão de maximizar
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/WFera Texto.Png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        TituloQuemSomosNos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextQuemSomosNos = new javax.swing.JTextArea();
        PainelNavBar1 = new javax.swing.JPanel();
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
        BTwpp = new javax.swing.JButton();
        LabelInformações1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTInsta = new javax.swing.JButton();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BTPaginaInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));
        jPanel3.setPreferredSize(new java.awt.Dimension(1025, 1051));
        jPanel3.setLayout(null);

        TituloQuemSomosNos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TituloQuemSomosNos.setText("Quem somos nós:");
        jPanel3.add(TituloQuemSomosNos);
        TituloQuemSomosNos.setBounds(520, 120, 330, 44);

        TextQuemSomosNos.setEditable(false);
        TextQuemSomosNos.setBackground(new java.awt.Color(243, 243, 243));
        TextQuemSomosNos.setColumns(20);
        TextQuemSomosNos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextQuemSomosNos.setForeground(new java.awt.Color(0, 0, 0));
        TextQuemSomosNos.setRows(5);
        TextQuemSomosNos.setText("     Nós da WFera_imports estamos desde 2021 no mercado se renovando mês a mês, somando qualidade aos produtos que oferecemos com objetivo\nde levar até você os melhores produtos, das melhores marcas com a maior comodidade, diretamente para o seu lar, para que você possa se vestir\nda melhor maneira e refletir sua personalidade em suas vestimentas.\n\n MISSÃO\n Conquistar o cliente, proporcionar felicidade e a certeza que nós, através de uma primorosa experiência de compra e excelentes produtos, somos a sua\nmelhor escolha.\n\n VALORES\n– Somos fiéis aos nossos valores\n– Buscamos sempre estar a frente da inovação e tendência\n– Trabalhamos por uma empresa com identidade\n– Enxergamos nosso cliente como o maior patrimônio\n– Atendemos nossos clientes de forma única, descontraída e casual");
        TextQuemSomosNos.setBorder(null);
        jScrollPane1.setViewportView(TextQuemSomosNos);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(200, 190, 930, 602);

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setPreferredSize(new java.awt.Dimension(1250, 180));

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
        BTTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTimesActionPerformed(evt);
            }
        });

        LabelCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelCategoria.setText("Categorias");

        BTQuemSomosNos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTQuemSomosNos.setText("Quem somos");
        BTQuemSomosNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuemSomosNosActionPerformed(evt);
            }
        });

        BTduvidas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTduvidas.setText("Duvídas");
        BTduvidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTduvidasActionPerformed(evt);
            }
        });

        BTRastrearPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTRastrearPedido.setText("Rastrear Pedido");

        BTTermosDeerviço.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTermosDeerviço.setText("Termos de Serviço");
        BTTermosDeerviço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTermosDeerviçoActionPerformed(evt);
            }
        });

        LabelInformações.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações.setText("Informações");

        BTConjuntos1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos1.setText("Camisetas");
        BTConjuntos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos1ActionPerformed(evt);
            }
        });

        BTwpp.setBackground(new java.awt.Color(115, 115, 115));
        BTwpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wsp.png"))); // NOI18N

        LabelInformações1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações1.setText("<html>Fique por dentro das promoções<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp cadastre seu email:");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Suporte via WhatsApp:");

        BTInsta.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

        javax.swing.GroupLayout PainelNavBar1Layout = new javax.swing.GroupLayout(PainelNavBar1);
        PainelNavBar1.setLayout(PainelNavBar1Layout);
        PainelNavBar1Layout.setHorizontalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCategoria)
                    .addComponent(BTConjuntos1)
                    .addComponent(BTSeleções)
                    .addComponent(BTConjuntos)
                    .addComponent(BTTimes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelInformações1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(BTInsta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTwpp))
                            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)))
                        .addGap(59, 59, 59)))
                .addGap(321, 321, 321)
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
                .addContainerGap()
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(LabelInformações1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTTermosDeerviço)
                            .addComponent(BTConjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTduvidas)
                            .addComponent(BTSeleções))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTRastrearPedido)
                            .addComponent(BTTimes))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.add(PainelNavBar1);
        PainelNavBar1.setBounds(0, 870, 1300, 180);

        PainelNavBar.setBackground(new java.awt.Color(115, 115, 115));

        BtHamburguer.setBackground(new java.awt.Color(115, 115, 115));
        BtHamburguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuHam.png"))); // NOI18N
        BtHamburguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHamburguerActionPerformed(evt);
            }
        });

        BtPesquisar.setBackground(new java.awt.Color(115, 115, 115));
        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupinha.png"))); // NOI18N
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        TextPesquisa.setBackground(new java.awt.Color(232, 232, 232));

        jButton3.setBackground(new java.awt.Color(115, 115, 115));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinho.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(115, 115, 115));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BTPaginaInicial.setBackground(new java.awt.Color(115, 115, 115));
        BTPaginaInicial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial.setForeground(new java.awt.Color(242, 242, 242));
        BTPaginaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/B1.png"))); // NOI18N
        BTPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicialActionPerformed(evt);
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
                .addGap(387, 387, 387)
                .addComponent(BTPaginaInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
        );
        PainelNavBarLayout.setVerticalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PainelNavBarLayout.createSequentialGroup()
                                .addComponent(TextPesquisa)
                                .addGap(2, 2, 2))
                            .addComponent(BtPesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtHamburguer, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTPaginaInicial))
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(PainelNavBar);
        PainelNavBar.setBounds(0, 0, 1300, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntosActionPerformed
        TelaConjuntos TCN = new TelaConjuntos();
        TCN.setVisible(true);
    }//GEN-LAST:event_BTConjuntosActionPerformed

    private void BTSeleçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSeleçõesActionPerformed
        TelaSelecoes TSC = new TelaSelecoes();
        TSC.setVisible(true);
    }//GEN-LAST:event_BTSeleçõesActionPerformed

    private void BTTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTimesActionPerformed
        TelaListaTimes TLT = new TelaListaTimes();
        TLT.setVisible(true);
    }//GEN-LAST:event_BTTimesActionPerformed

    private void BTQuemSomosNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuemSomosNosActionPerformed
        TelaQuemSomosNos TQSN = new TelaQuemSomosNos();
        TQSN.setVisible(true);
    }//GEN-LAST:event_BTQuemSomosNosActionPerformed

    private void BTduvidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTduvidasActionPerformed
        TelaDuvidas TD = new TelaDuvidas();
        TD.setVisible(true);
    }//GEN-LAST:event_BTduvidasActionPerformed

    private void BTTermosDeerviçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTermosDeerviçoActionPerformed
        TelaTermoseServicos TTS = new TelaTermoseServicos();
        TTS.setVisible(true);
    }//GEN-LAST:event_BTTermosDeerviçoActionPerformed

    private void BTConjuntos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos1ActionPerformed
        TelaCamisetas TC = new TelaCamisetas();
        TC.setVisible(true);
    }//GEN-LAST:event_BTConjuntos1ActionPerformed

    private void BtHamburguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHamburguerActionPerformed
        TelaMenuHamburguer TMH = new TelaMenuHamburguer();
        TMH.setVisible(true);
    }//GEN-LAST:event_BtHamburguerActionPerformed

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TelaCadastro TC = new TelaCadastro();
        TC.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BTPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicialActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicialActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuemSomosNos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTConjuntos1;
    private javax.swing.JButton BTInsta;
    private javax.swing.JButton BTPaginaInicial;
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
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelInformações1;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JTextArea TextQuemSomosNos;
    private javax.swing.JLabel TituloQuemSomosNos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
