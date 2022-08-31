package Codes;

import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;


public class TelaCarrinhoCamisetaArgentina extends javax.swing.JFrame {

    PaginaInicial PG = new PaginaInicial();
    TelaCadastro TC = new TelaCadastro ();
    dadosCadastro DF = new dadosCadastro();
    String f, nomePDF, enderecoPDF,complementoPDF, valorPDF, emailPDF, enderecoDeEntrega, dados;
    int s=1; 
    double preco;
    double precoCamiseta9;
    double quantidadeCamoseta9;
    double total;
    
    public void MetodoPagamento (){
        f =  JOptionPane.showInputDialog(null, "Digite a forma de pagamento:");   
        if (f.equals("débito")){
            JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");
        }
        else if (f.equals("crédito")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito"); s =2;}
        else if (f.equals("pix")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");s =2;}
        else if (f.equals("dinheiro")){ JOptionPane.showMessageDialog(null, "metodo de pagamento aceito");s =2;}
        
        else{
        do { JOptionPane.showMessageDialog(null, "Esse método de pagamento não é aceito no restaurante");
             f =  JOptionPane.showInputDialog(null, "Digite a forma de pagamento:");
            } while (!(f.equals("credito") | f.equals("debito") | f.equals("pix") | f.equals("Dinheiro")));
        System.out.println(""+s);
        }// END else
        } // END metodoPagament

    public TelaCarrinhoCamisetaArgentina() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        setQuantidadeEscolhida = new javax.swing.JSpinner();
        setTamanhoEscolhido = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        recebeImagem = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtFinalizarCompra = new javax.swing.JButton();
        LabelPreçonumber = new javax.swing.JLabel();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BTPaginaInicial = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        BTInsta3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 1050));

        jPanel1.setBackground(new java.awt.Color(250, 250, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 1050));

        jPanel2.setBackground(new java.awt.Color(249, 255, 249));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 700));

        setQuantidadeEscolhida.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        setQuantidadeEscolhida.setRequestFocusEnabled(false);

        setTamanhoEscolhido.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        setTamanhoEscolhido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "M", "G", "GG", " " }));
        setTamanhoEscolhido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTamanhoEscolhidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Escolha a quantidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Camiseta Argentina - Azul");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Escolha o seu tamanho ideal:");

        jPanel3.setBackground(new java.awt.Color(115, 115, 115));

        recebeImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camisetaArgentina.jpeg"))); // NOI18N
        recebeImagem.setText("foto do produto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recebeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recebeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Preço:");

        BtFinalizarCompra.setBackground(new java.awt.Color(255, 51, 51));
        BtFinalizarCompra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        BtFinalizarCompra.setText("FinalizarCompra");
        BtFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFinalizarCompraActionPerformed(evt);
            }
        });

        LabelPreçonumber.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelPreçonumber.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçonumber.setText(" 249,90");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(setQuantidadeEscolhida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(LabelPreçonumber)
                            .addComponent(BtFinalizarCompra)
                            .addComponent(setTamanhoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setQuantidadeEscolhida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setTamanhoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPreçonumber)
                .addGap(35, 35, 35)
                .addComponent(BtFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

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

        PainelNavBar4.setBackground(new java.awt.Color(115, 115, 115));
        PainelNavBar4.setPreferredSize(new java.awt.Dimension(1300, 180));

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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Suporte via WhatsApp:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
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
                                .addComponent(jLabel7)))
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
                        .addComponent(jLabel7)
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
            .addComponent(PainelNavBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setTamanhoEscolhidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTamanhoEscolhidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setTamanhoEscolhidoActionPerformed

    private void BtFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFinalizarCompraActionPerformed
        MetodoPagamento();
        precoCamiseta9 = Double.parseDouble(LabelPreçonumber.getText().replace(",", "."));
        quantidadeCamoseta9 = Double.parseDouble(setQuantidadeEscolhida.getValue().toString());
        total = (precoCamiseta9 * quantidadeCamoseta9) + 15;
        System.out.println(total);
        nomePDF = DF.getNome();
        enderecoPDF = DF.getCep();
        complementoPDF = DF.getComplemento();
        emailPDF = DF.getEmail();

        Document docPDF = new Document();
        try {
            PdfWriter.getInstance(docPDF, new FileOutputStream(" Nota Fiscal PDF.pdf"));
            docPDF.open();
            docPDF.add(new Paragraph("     NOTA FISCAL     \n\n", new Font(Font.FontFamily.TIMES_ROMAN, 25, Font.BOLD)));
            docPDF.add(new Paragraph("PRESTADOR DE SERVIÇO\n"));
            docPDF.add(new Paragraph("Razão Social/Nome: WFera Imports\n"));
            docPDF.add(new Paragraph("CPF/CNPJ:030.727.240-90 "));
            docPDF.add(new Paragraph("Endereço: Av.Venancio Aires,93"));
            docPDF.add(new Paragraph("Inscrição Municipal:3454401687\n"));
            docPDF.add(new Paragraph("Fone:(51)996845907\n\n"));
            docPDF.add(new Paragraph("TOMADOR DE SERVIÇO\n"));
            docPDF.add(new Paragraph("Razão Social/Nome: lucas pedroso"));
            docPDF.add(new Paragraph("Endereço: Venancio aires"));
            docPDF.add(new Paragraph("Complemento: n:93 sala 401 "));
            docPDF.add(new Paragraph("Email: pedrosolucas1745@gmail.com"));
            docPDF.add(new Paragraph("\nFATURA\n"));
            docPDF.add(new Paragraph("Forma de pagamento: " + this.f));
            docPDF.add(new Paragraph("Quantidade do produto: " + this.quantidadeCamoseta9));
            docPDF.add(new Paragraph("Valor: " + this.total));

        } catch (FileNotFoundException erro1) {
            java.util.logging.Logger.getLogger(Codes.TelaCarrinhoCamiseta1.class.getName()).log(Level.SEVERE, null, erro1);
        } catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(Codes.TelaCarrinhoCamiseta1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            docPDF.close();
        }
        try {
            //abrir o pdf
            Desktop.getDesktop().open(new File(" Nota Fiscal PDF.pdf"));
        } catch (IOException erro) {
            java.util.logging.Logger.getLogger(Codes.TelaCarrinhoCamiseta1.class.getName()).log(Level.SEVERE, null, erro);
        }
    }//GEN-LAST:event_BtFinalizarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarrinhoCamisetaArgentina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinhoCamisetaArgentina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinhoCamisetaArgentina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinhoCamisetaArgentina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarrinhoCamisetaArgentina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTConjuntos6;
    private javax.swing.JButton BTConjuntos7;
    private javax.swing.JButton BTInsta3;
    private javax.swing.JButton BTPaginaInicial;
    private javax.swing.JButton BTQuemSomosNos3;
    private javax.swing.JButton BTRastrearPedido3;
    private javax.swing.JButton BTSeleções3;
    private javax.swing.JButton BTTermosDeerviço3;
    private javax.swing.JButton BTTimes3;
    private javax.swing.JButton BTduvidas3;
    private javax.swing.JButton BTwpp3;
    private javax.swing.JButton BtFinalizarCompra;
    private javax.swing.JButton BtHamburguer;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel LabelCategoria3;
    private javax.swing.JLabel LabelInformações6;
    private javax.swing.JLabel LabelInformações7;
    private javax.swing.JLabel LabelPreçonumber;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar4;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel recebeImagem;
    private javax.swing.JSpinner setQuantidadeEscolhida;
    private javax.swing.JComboBox<String> setTamanhoEscolhido;
    // End of variables declaration//GEN-END:variables
}
