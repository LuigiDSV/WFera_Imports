package Codes;

import java.awt.Toolkit;

public class TelaCamisetas extends javax.swing.JFrame {
    public TelaCamisetas() {
        initComponents();
        //centralizar na tela
        setLocationRelativeTo(null);
        //desmarcar o botão de maximizar
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/WFera Texto.Png")));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        BTPaginaInicial = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
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
        ImagenCamiseta4 = new javax.swing.JLabel();
        DescCamiseta4 = new javax.swing.JLabel();
        LabelPreçoCamiseta4 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta1 = new javax.swing.JButton();
        BtComprarAgoraCamiseta2 = new javax.swing.JButton();
        BtComprarAgoraCamiseta3 = new javax.swing.JButton();
        BtComprarAgoraCamiseta4 = new javax.swing.JButton();
        ImagenCamiseta5 = new javax.swing.JLabel();
        DescCamiseta5 = new javax.swing.JLabel();
        LabelPreçoCamiseta5 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta5 = new javax.swing.JButton();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BTPaginaInicial3 = new javax.swing.JButton();
        PainelNavBar4 = new javax.swing.JPanel();
        BTConjuntos6 = new javax.swing.JButton();
        BTSeleções3 = new javax.swing.JButton();
        BTTimes3 = new javax.swing.JButton();
        LabelCategoria3 = new javax.swing.JLabel();
        BTQuemSomosNos3 = new javax.swing.JButton();
        BTduvidas3 = new javax.swing.JButton();
        BTRastrearPedido3 = new javax.swing.JButton();
        BTTermosDeerviço3 = new javax.swing.JButton();
        LabelInformações6 = new javax.swing.JLabel();
        BTConjuntos7 = new javax.swing.JButton();
        BTwpp3 = new javax.swing.JButton();
        LabelInformações7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BTInsta3 = new javax.swing.JButton();

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setPreferredSize(new java.awt.Dimension(1250, 1050));

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

        BTPaginaInicial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial.setText("Pagina inicial");
        BTPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNavBar1Layout = new javax.swing.GroupLayout(PainelNavBar1);
        PainelNavBar1.setLayout(PainelNavBar1Layout);
        PainelNavBar1Layout.setHorizontalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCategoria)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(BTConjuntos1)
                        .addGap(27, 27, 27)
                        .addComponent(BTPaginaInicial))
                    .addComponent(BTSeleções)
                    .addComponent(BTConjuntos)
                    .addComponent(BTTimes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
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
                .addGap(304, 304, 304)
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
                .addContainerGap(18, Short.MAX_VALUE)
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
                            .addComponent(BTConjuntos1)
                            .addComponent(BTPaginaInicial))
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
                            .addComponent(BTTimes)))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 1050));

        PainelProdutos.setBackground(new java.awt.Color(232, 226, 226));
        PainelProdutos.setPreferredSize(new java.awt.Dimension(1150, 750));
        PainelProdutos.setLayout(null);

        ImagenCamiseta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta5.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta1);
        ImagenCamiseta1.setBounds(6, 8, 270, 270);

        DescCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta1.setText("Camiseta Paris Saint Germain - cinza");
        PainelProdutos.add(DescCamiseta1);
        DescCamiseta1.setBounds(12, 284, 248, 17);

        LabelPreçoCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta1.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta1.setText("R$: 199,90");
        PainelProdutos.add(LabelPreçoCamiseta1);
        LabelPreçoCamiseta1.setBounds(96, 307, 77, 17);

        ImagenCamiseta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta6.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta2);
        ImagenCamiseta2.setBounds(294, 8, 270, 270);

        DescCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta2.setText("Camiseta Juventus - preta");
        PainelProdutos.add(DescCamiseta2);
        DescCamiseta2.setBounds(329, 284, 181, 17);

        LabelPreçoCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta2.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta2.setText("R$ 199,90");
        PainelProdutos.add(LabelPreçoCamiseta2);
        LabelPreçoCamiseta2.setBounds(390, 307, 72, 17);

        ImagenCamiseta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta4.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta3);
        ImagenCamiseta3.setBounds(582, 8, 270, 270);

        DescCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta3.setText("Camiseta Barcelona - dourado");
        PainelProdutos.add(DescCamiseta3);
        DescCamiseta3.setBounds(612, 284, 208, 17);

        LabelPreçoCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta3.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta3.setText("R$: 249,90");
        PainelProdutos.add(LabelPreçoCamiseta3);
        LabelPreçoCamiseta3.setBounds(678, 307, 77, 17);

        ImagenCamiseta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta8.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta4);
        ImagenCamiseta4.setBounds(873, 8, 270, 270);

        DescCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta4.setText("Camiseta Nike Olimpia");
        PainelProdutos.add(DescCamiseta4);
        DescCamiseta4.setBounds(928, 284, 173, 17);

        LabelPreçoCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta4.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta4.setText("R$: 249,90");
        PainelProdutos.add(LabelPreçoCamiseta4);
        LabelPreçoCamiseta4.setBounds(969, 313, 77, 17);

        BtComprarAgoraCamiseta1.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta1.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta1.setText("Comprar Agora");
        BtComprarAgoraCamiseta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta1ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta1);
        BtComprarAgoraCamiseta1.setBounds(362, 336, 137, 23);

        BtComprarAgoraCamiseta2.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta2.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta2.setText("Comprar Agora");
        BtComprarAgoraCamiseta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta2ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta2);
        BtComprarAgoraCamiseta2.setBounds(71, 336, 137, 23);

        BtComprarAgoraCamiseta3.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta3.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta3.setText("Comprar Agora");
        BtComprarAgoraCamiseta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta3ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta3);
        BtComprarAgoraCamiseta3.setBounds(940, 336, 137, 23);

        BtComprarAgoraCamiseta4.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta4.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta4.setText("Comprar Agora");
        BtComprarAgoraCamiseta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta4ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta4);
        BtComprarAgoraCamiseta4.setBounds(652, 336, 137, 23);

        ImagenCamiseta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta7.jpeg"))); // NOI18N
        PainelProdutos.add(ImagenCamiseta5);
        ImagenCamiseta5.setBounds(14, 377, 270, 270);

        DescCamiseta5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta5.setText("Conjunto Puma Inverno Vermelho");
        PainelProdutos.add(DescCamiseta5);
        DescCamiseta5.setBounds(20, 653, 239, 17);

        LabelPreçoCamiseta5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta5.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta5.setText("R$ 199,99");
        PainelProdutos.add(LabelPreçoCamiseta5);
        LabelPreçoCamiseta5.setBounds(94, 682, 72, 17);

        BtComprarAgoraCamiseta5.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta5.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta5.setText("Comprar Agora");
        BtComprarAgoraCamiseta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta5ActionPerformed(evt);
            }
        });
        PainelProdutos.add(BtComprarAgoraCamiseta5);
        BtComprarAgoraCamiseta5.setBounds(65, 711, 137, 23);

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

        BTPaginaInicial3.setBackground(new java.awt.Color(115, 115, 115));
        BTPaginaInicial3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTPaginaInicial3.setForeground(new java.awt.Color(242, 242, 242));
        BTPaginaInicial3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/B1.png"))); // NOI18N
        BTPaginaInicial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPaginaInicial3ActionPerformed(evt);
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
                .addComponent(BTPaginaInicial3)
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
                        .addComponent(BTPaginaInicial3))
                    .addGroup(PainelNavBarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelNavBar4.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar4.setPreferredSize(new java.awt.Dimension(1250, 180));

        BTConjuntos6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos6.setText("Conjuntos");
        BTConjuntos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos6ActionPerformed(evt);
            }
        });

        BTSeleções3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTSeleções3.setText("Seleções");
        BTSeleções3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSeleções3ActionPerformed(evt);
            }
        });

        BTTimes3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTimes3.setText("Times");
        BTTimes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTimes3ActionPerformed(evt);
            }
        });

        LabelCategoria3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelCategoria3.setText("Categorias");

        BTQuemSomosNos3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTQuemSomosNos3.setText("Quem somos");
        BTQuemSomosNos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTQuemSomosNos3ActionPerformed(evt);
            }
        });

        BTduvidas3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTduvidas3.setText("Duvídas");
        BTduvidas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTduvidas3ActionPerformed(evt);
            }
        });

        BTRastrearPedido3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTRastrearPedido3.setText("Rastrear Pedido");

        BTTermosDeerviço3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTTermosDeerviço3.setText("Termos de Serviço");
        BTTermosDeerviço3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTermosDeerviço3ActionPerformed(evt);
            }
        });

        LabelInformações6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações6.setText("Informações");

        BTConjuntos7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTConjuntos7.setText("Camisetas");
        BTConjuntos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConjuntos7ActionPerformed(evt);
            }
        });

        BTwpp3.setBackground(new java.awt.Color(115, 115, 115));
        BTwpp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wsp.png"))); // NOI18N

        LabelInformações7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelInformações7.setText("<html>Fique por dentro das promoções<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp cadastre seu email:");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Suporte via WhatsApp:");

        BTInsta3.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

        javax.swing.GroupLayout PainelNavBar4Layout = new javax.swing.GroupLayout(PainelNavBar4);
        PainelNavBar4.setLayout(PainelNavBar4Layout);
        PainelNavBar4Layout.setHorizontalGroup(
            PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCategoria3)
                    .addComponent(BTConjuntos7)
                    .addComponent(BTSeleções3)
                    .addComponent(BTConjuntos6)
                    .addComponent(BTTimes3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelInformações7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelNavBar4Layout.createSequentialGroup()
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelNavBar4Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(BTInsta3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTwpp3))
                            .addGroup(PainelNavBar4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)))
                        .addGap(59, 59, 59)))
                .addGap(321, 321, 321)
                .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTQuemSomosNos3)
                    .addComponent(LabelInformações6)
                    .addComponent(BTTermosDeerviço3)
                    .addComponent(BTduvidas3)
                    .addComponent(BTRastrearPedido3))
                .addGap(64, 64, 64))
        );
        PainelNavBar4Layout.setVerticalGroup(
            PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar4Layout.createSequentialGroup()
                        .addComponent(LabelInformações7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTInsta3)
                            .addComponent(BTwpp3)))
                    .addGroup(PainelNavBar4Layout.createSequentialGroup()
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelInformações6)
                            .addComponent(LabelCategoria3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTQuemSomosNos3)
                            .addComponent(BTConjuntos7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTTermosDeerviço3)
                            .addComponent(BTConjuntos6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTduvidas3)
                            .addComponent(BTSeleções3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTRastrearPedido3)
                            .addComponent(BTTimes3))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelNavBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(PainelNavBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BtComprarAgoraCamiseta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta5ActionPerformed
       TelaCarrinhoCamiseta7 TTC7 = new TelaCarrinhoCamiseta7();
      TTC7.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta5ActionPerformed

    private void BtComprarAgoraCamiseta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta4ActionPerformed
       TelaCarrinhoCamiseta4 TTC4 = new TelaCarrinhoCamiseta4();
      TTC4.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta4ActionPerformed

    private void BtComprarAgoraCamiseta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta2ActionPerformed
    TelaCarrinhoCamiseta5 TTC5 = new TelaCarrinhoCamiseta5();
      TTC5.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta2ActionPerformed

    private void BTPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicialActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicialActionPerformed

    private void BtComprarAgoraCamiseta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta1ActionPerformed
        TelaCarrinhoCamiseta6 TTC6 = new TelaCarrinhoCamiseta6();
      TTC6.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta1ActionPerformed

    private void BtComprarAgoraCamiseta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta3ActionPerformed
       TelaCarrinhoCamiseta8 TTC8 = new TelaCarrinhoCamiseta8();
      TTC8.setVisible(true);
    }//GEN-LAST:event_BtComprarAgoraCamiseta3ActionPerformed

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

    private void BTPaginaInicial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPaginaInicial3ActionPerformed
        PaginaInicial PGI = new PaginaInicial();
        PGI.setVisible(true);
    }//GEN-LAST:event_BTPaginaInicial3ActionPerformed

    private void BTConjuntos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos6ActionPerformed
        TelaConjuntos TCN = new TelaConjuntos();
        TCN.setVisible(true);
    }//GEN-LAST:event_BTConjuntos6ActionPerformed

    private void BTSeleções3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSeleções3ActionPerformed
        TelaSelecoes TSC = new TelaSelecoes();
        TSC.setVisible(true);
    }//GEN-LAST:event_BTSeleções3ActionPerformed

    private void BTTimes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTimes3ActionPerformed
        TelaListaTimes TLT = new TelaListaTimes();
        TLT.setVisible(true);
    }//GEN-LAST:event_BTTimes3ActionPerformed

    private void BTQuemSomosNos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTQuemSomosNos3ActionPerformed
        TelaQuemSomosNos TQSN = new TelaQuemSomosNos();
        TQSN.setVisible(true);
    }//GEN-LAST:event_BTQuemSomosNos3ActionPerformed

    private void BTduvidas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTduvidas3ActionPerformed
        TelaDuvidas TD = new TelaDuvidas();
        TD.setVisible(true);
    }//GEN-LAST:event_BTduvidas3ActionPerformed

    private void BTTermosDeerviço3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTermosDeerviço3ActionPerformed
        TelaTermoseServicos TTS = new TelaTermoseServicos();
        TTS.setVisible(true);
    }//GEN-LAST:event_BTTermosDeerviço3ActionPerformed

    private void BTConjuntos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos7ActionPerformed
        TelaCamisetas TC = new TelaCamisetas();
        TC.setVisible(true);
    }//GEN-LAST:event_BTConjuntos7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCamisetas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTConjuntos1;
    private javax.swing.JButton BTConjuntos6;
    private javax.swing.JButton BTConjuntos7;
    private javax.swing.JButton BTInsta;
    private javax.swing.JButton BTInsta3;
    private javax.swing.JButton BTPaginaInicial;
    private javax.swing.JButton BTPaginaInicial3;
    private javax.swing.JButton BTQuemSomosNos;
    private javax.swing.JButton BTQuemSomosNos3;
    private javax.swing.JButton BTRastrearPedido;
    private javax.swing.JButton BTRastrearPedido3;
    private javax.swing.JButton BTSeleções;
    private javax.swing.JButton BTSeleções3;
    private javax.swing.JButton BTTermosDeerviço;
    private javax.swing.JButton BTTermosDeerviço3;
    private javax.swing.JButton BTTimes;
    private javax.swing.JButton BTTimes3;
    private javax.swing.JButton BTduvidas;
    private javax.swing.JButton BTduvidas3;
    private javax.swing.JButton BTwpp;
    private javax.swing.JButton BTwpp3;
    private javax.swing.JButton BtComprarAgoraCamiseta1;
    private javax.swing.JButton BtComprarAgoraCamiseta2;
    private javax.swing.JButton BtComprarAgoraCamiseta3;
    private javax.swing.JButton BtComprarAgoraCamiseta4;
    private javax.swing.JButton BtComprarAgoraCamiseta5;
    private javax.swing.JButton BtHamburguer;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel DescCamiseta1;
    private javax.swing.JLabel DescCamiseta2;
    private javax.swing.JLabel DescCamiseta3;
    private javax.swing.JLabel DescCamiseta4;
    private javax.swing.JLabel DescCamiseta5;
    private javax.swing.JLabel ImagenCamiseta1;
    private javax.swing.JLabel ImagenCamiseta2;
    private javax.swing.JLabel ImagenCamiseta3;
    private javax.swing.JLabel ImagenCamiseta4;
    private javax.swing.JLabel ImagenCamiseta5;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelCategoria3;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelInformações1;
    private javax.swing.JLabel LabelInformações6;
    private javax.swing.JLabel LabelInformações7;
    private javax.swing.JLabel LabelPreçoCamiseta1;
    private javax.swing.JLabel LabelPreçoCamiseta2;
    private javax.swing.JLabel LabelPreçoCamiseta3;
    private javax.swing.JLabel LabelPreçoCamiseta4;
    private javax.swing.JLabel LabelPreçoCamiseta5;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JPanel PainelNavBar4;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
