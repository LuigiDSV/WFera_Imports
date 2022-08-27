package Codes;

public class PaginaInicial extends javax.swing.JFrame {

    public PaginaInicial() {
        initComponents();

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
        PainelCarrosel = new javax.swing.JPanel();
        BTFlechaDireita = new javax.swing.JButton();
        ImagenCarrosel = new javax.swing.JLabel();
        BTFlechaEsquerda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(671, 665));

        PainelNavBar.setBackground(new java.awt.Color(115, 115, 115));

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

        PainelProdutos.setBackground(new java.awt.Color(232, 226, 226));

        ImagenCamiseta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta2.jpeg"))); // NOI18N

        DescCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta1.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta1.setText("Conjunto Puma Inverno Vermelho");

        LabelPreçoCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta1.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta1.setText("R$: 249,90");

        ImagenCamiseta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta1.jpeg"))); // NOI18N

        DescCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta2.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta2.setText("Conjunto Puma Inverno Azul");

        LabelPreçoCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta2.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta2.setText("R$: 249,90");

        ImagenCamiseta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta4.jpeg"))); // NOI18N

        DescCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta3.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta3.setText("Camiseta Nike Spotify");

        LabelPreçoCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta3.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta3.setText("R$: 249,90");

        ImagenCamiseta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta8.jpeg"))); // NOI18N

        DescCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta4.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta4.setText("Camiseta Nike Olimpia");

        LabelPreçoCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta4.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta4.setText("R$: 249,90");

        BtComprarAgoraCamiseta1.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta1.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta1.setText("Comprar Agora");

        BtComprarAgoraCamiseta2.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta2.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta2.setText("Comprar Agora");
        BtComprarAgoraCamiseta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta2ActionPerformed(evt);
            }
        });

        BtComprarAgoraCamiseta3.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta3.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta3.setText("Comprar Agora");

        BtComprarAgoraCamiseta4.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta4.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta4.setText("Comprar Agora");
        BtComprarAgoraCamiseta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(LabelPreçoCamiseta1))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(BtComprarAgoraCamiseta2))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(DescCamiseta1)))
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(DescCamiseta2))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(LabelPreçoCamiseta2))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(BtComprarAgoraCamiseta1)))
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(DescCamiseta3))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(LabelPreçoCamiseta3))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(BtComprarAgoraCamiseta4))))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImagenCamiseta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImagenCamiseta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImagenCamiseta3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addComponent(ImagenCamiseta4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtComprarAgoraCamiseta3)
                                    .addComponent(DescCamiseta4))
                                .addGap(87, 87, 87))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPreçoCamiseta4)
                        .addGap(135, 135, 135))))
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addComponent(ImagenCamiseta4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescCamiseta4))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenCamiseta3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImagenCamiseta1)
                            .addComponent(ImagenCamiseta2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addComponent(DescCamiseta1)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPreçoCamiseta1)
                                .addGap(18, 18, 18)
                                .addComponent(BtComprarAgoraCamiseta2))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addComponent(DescCamiseta3)
                                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelPreçoCamiseta3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(BtComprarAgoraCamiseta4)
                                            .addComponent(BtComprarAgoraCamiseta3)))
                                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(LabelPreçoCamiseta4))))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addComponent(DescCamiseta2)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPreçoCamiseta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtComprarAgoraCamiseta1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar1.setPreferredSize(new java.awt.Dimension(1250, 1050));

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

        javax.swing.GroupLayout PainelNavBar1Layout = new javax.swing.GroupLayout(PainelNavBar1);
        PainelNavBar1.setLayout(PainelNavBar1Layout);
        PainelNavBar1Layout.setHorizontalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCategoria)
                            .addComponent(BTConjuntos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTInsta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTwpp)
                        .addGap(44, 44, 44))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTSeleções)
                            .addComponent(BTConjuntos)
                            .addComponent(BTTimes))
                        .addGap(12, 12, 12)))
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
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelInformações)
                            .addComponent(LabelCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTQuemSomosNos)
                            .addComponent(BTConjuntos1)))
                    .addComponent(BTwpp)
                    .addComponent(BTInsta))
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
                    .addComponent(BTTimes))
                .addContainerGap(919, Short.MAX_VALUE))
        );

        PainelCarrosel.setBackground(new java.awt.Color(238, 249, 250));

        BTFlechaDireita.setBackground(new java.awt.Color(239, 249, 249));
        BTFlechaDireita.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BTFlechaDireita.setForeground(new java.awt.Color(51, 51, 51));
        BTFlechaDireita.setText(">");
        BTFlechaDireita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTFlechaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTFlechaDireitaActionPerformed(evt);
            }
        });

        ImagenCarrosel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bannerCamisetas.png"))); // NOI18N

        BTFlechaEsquerda.setBackground(new java.awt.Color(239, 249, 249));
        BTFlechaEsquerda.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BTFlechaEsquerda.setForeground(new java.awt.Color(51, 51, 51));
        BTFlechaEsquerda.setText("<");
        BTFlechaEsquerda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTFlechaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTFlechaEsquerdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCarroselLayout = new javax.swing.GroupLayout(PainelCarrosel);
        PainelCarrosel.setLayout(PainelCarroselLayout);
        PainelCarroselLayout.setHorizontalGroup(
            PainelCarroselLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCarroselLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTFlechaEsquerda)
                .addGap(4, 4, 4)
                .addComponent(ImagenCarrosel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTFlechaDireita)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCarroselLayout.setVerticalGroup(
            PainelCarroselLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCarroselLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenCarrosel)
                .addGap(92, 92, 92))
            .addGroup(PainelCarroselLayout.createSequentialGroup()
                .addGroup(PainelCarroselLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCarroselLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BTFlechaDireita))
                    .addGroup(PainelCarroselLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(BTFlechaEsquerda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(PainelCarrosel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PainelNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelNavBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelCarrosel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelNavBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void BtComprarAgoraCamiseta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta2ActionPerformed
        
    }//GEN-LAST:event_BtComprarAgoraCamiseta2ActionPerformed

    private void BTFlechaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTFlechaDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTFlechaDireitaActionPerformed

    private void BTFlechaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTFlechaEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTFlechaEsquerdaActionPerformed

    private void BtComprarAgoraCamiseta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtComprarAgoraCamiseta4ActionPerformed

    private void BTConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTConjuntosActionPerformed

    private void BTSeleçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSeleçõesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTSeleçõesActionPerformed

    private void BTConjuntos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConjuntos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTConjuntos1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTConjuntos1;
    private javax.swing.JButton BTFlechaDireita;
    private javax.swing.JButton BTFlechaEsquerda;
    private javax.swing.JButton BTInsta;
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
    private javax.swing.JLabel ImagenCarrosel;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelPreçoCamiseta1;
    private javax.swing.JLabel LabelPreçoCamiseta2;
    private javax.swing.JLabel LabelPreçoCamiseta3;
    private javax.swing.JLabel LabelPreçoCamiseta4;
    private javax.swing.JPanel PainelCarrosel;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
