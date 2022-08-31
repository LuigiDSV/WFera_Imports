package Codes;

import java.awt.Toolkit;

public class TelaSelecoes extends javax.swing.JFrame {
    public TelaSelecoes() {
        initComponents();
        //centralizar na tela
        setLocationRelativeTo(null);
        //desmarcar o botão de maximizar
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/WFera Texto.Png")));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BTPaginaInicial = new javax.swing.JButton();
        PainelProdutos = new javax.swing.JPanel();
        ImagenCamiseta1 = new javax.swing.JLabel();
        DescCamiseta1 = new javax.swing.JLabel();
        LabelPreçoCamiseta1 = new javax.swing.JLabel();
        ImagenCamiseta2 = new javax.swing.JLabel();
        DescCamiseta2 = new javax.swing.JLabel();
        LabelPreçoCamiseta2 = new javax.swing.JLabel();
        ImagenCamiseta3 = new javax.swing.JLabel();
        DescCamiseta3 = new javax.swing.JLabel();
        LabelPreçoCamiseta3 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta1 = new javax.swing.JButton();
        BtComprarAgoraCamiseta2 = new javax.swing.JButton();
        BtComprarAgoraCamiseta4 = new javax.swing.JButton();
        ImagenCamiseta4 = new javax.swing.JLabel();
        DescCamiseta4 = new javax.swing.JLabel();
        LabelPreçoCamiseta4 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta3 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));

        PainelNavBar.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar.setPreferredSize(new java.awt.Dimension(1300, 78));

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

        PainelProdutos.setBackground(new java.awt.Color(232, 226, 226));
        PainelProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenCamiseta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CamisetaNigeria.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 6, 276, 274));

        DescCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta1.setText("Camiseta Nigéria - Branco");
        PainelProdutos.add(DescCamiseta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, -1));

        LabelPreçoCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta1.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta1.setText("R$: 249,90");
        PainelProdutos.add(LabelPreçoCamiseta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, -1, -1));

        ImagenCamiseta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CamisetaBrasil.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 6, -1, 274));

        DescCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta2.setText("Camiseta seleção Brasil - Azul");
        PainelProdutos.add(DescCamiseta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        LabelPreçoCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta2.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta2.setText("R$ 299,90");
        PainelProdutos.add(LabelPreçoCamiseta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        ImagenCamiseta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CamisetaBrasilAmarelo.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 6, -1, 274));

        DescCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta3.setText("Camiseta seleção Brasil - Amarela");
        PainelProdutos.add(DescCamiseta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        LabelPreçoCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta3.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta3.setText("R$: 249,90");
        PainelProdutos.add(LabelPreçoCamiseta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        BtComprarAgoraCamiseta1.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta1.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta1.setText("Comprar Agora");
        BtComprarAgoraCamiseta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta1ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        BtComprarAgoraCamiseta2.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta2.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta2.setText("Comprar Agora");
        BtComprarAgoraCamiseta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta2ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, -1, -1));

        BtComprarAgoraCamiseta4.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta4.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta4.setText("Comprar Agora");
        BtComprarAgoraCamiseta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta4ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        ImagenCamiseta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camisetaArgentina.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 6, 276, 274));

        DescCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta4.setText("Camiseta seleção Argentina - Azul");
        PainelProdutos.add(DescCamiseta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        LabelPreçoCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta4.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta4.setText("R$: 249,90");
        PainelProdutos.add(LabelPreçoCamiseta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        BtComprarAgoraCamiseta3.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta3.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta3.setText("Comprar Agora");
        BtComprarAgoraCamiseta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta3ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setPreferredSize(new java.awt.Dimension(1300, 180));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(PainelNavBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BtComprarAgoraCamiseta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta2ActionPerformed
     TelaCarrinhoCamisetaNigeria TCCN = new TelaCarrinhoCamisetaNigeria();
        TCCN.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta2ActionPerformed

    private void BtComprarAgoraCamiseta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta4ActionPerformed
       TelaCarrinhoCamisetaBrasilAmarela TCCBAZ = new TelaCarrinhoCamisetaBrasilAmarela();
        TCCBAZ.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta4ActionPerformed

    private void BtComprarAgoraCamiseta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta3ActionPerformed
        TelaCarrinhoCamisetaArgentina TCCA = new TelaCarrinhoCamisetaArgentina();
        TCCA.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta3ActionPerformed

    private void BtComprarAgoraCamiseta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta1ActionPerformed
        TelaCarrinhoCamisetaBrasilAzul TCCBA = new TelaCarrinhoCamisetaBrasilAzul();
        TCCBA.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta1ActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSelecoes().setVisible(true);
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
    private javax.swing.JButton BtComprarAgoraCamiseta1;
    private javax.swing.JButton BtComprarAgoraCamiseta2;
    private javax.swing.JButton BtComprarAgoraCamiseta3;
    private javax.swing.JButton BtComprarAgoraCamiseta4;
    private javax.swing.JButton BtHamburguer;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel DescCamiseta1;
    private javax.swing.JLabel DescCamiseta2;
    private javax.swing.JLabel DescCamiseta3;
    private javax.swing.JLabel DescCamiseta4;
    private javax.swing.JLabel ImagenCamiseta1;
    private javax.swing.JLabel ImagenCamiseta2;
    private javax.swing.JLabel ImagenCamiseta3;
    private javax.swing.JLabel ImagenCamiseta4;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelInformações1;
    private javax.swing.JLabel LabelPreçoCamiseta1;
    private javax.swing.JLabel LabelPreçoCamiseta2;
    private javax.swing.JLabel LabelPreçoCamiseta3;
    private javax.swing.JLabel LabelPreçoCamiseta4;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
