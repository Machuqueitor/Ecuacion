package ecuaciongd;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
import org.jfree.ui.RefineryUtilities;

public class MiVentana extends javax.swing.JFrame {

    public EcuacionGD egd;

    public MiVentana(EcuacionGD egd) {

        initComponents();
        this.egd = egd;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBRaices = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBGraficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });

        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bKeyTyped(evt);
            }
        });

        jLabel1.setText("x^2  +");

        jLabel2.setText("x+");

        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cKeyTyped(evt);
            }
        });

        jLabel3.setText("= 0");

        jBRaices.setText("Calcular Raices");
        jBRaices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRaicesActionPerformed(evt);
            }
        });

        jLabel4.setText("Raices Cuadraticas");

        jBGraficar.setText("Graficar");
        jBGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBRaices)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBGraficar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRaices)
                    .addComponent(jBGraficar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed
    private void validarEntrada(java.awt.event.KeyEvent evt, char tecla) {
        if ((tecla <= '9' && tecla >= '1' || tecla == '-')) {

        } else {
            JOptionPane.showMessageDialog(c, "Ingrese solo numeros");
            evt.consume();
        }

    }
    private void jBRaicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRaicesActionPerformed

        double numeroA = 0, numeroB = 0, numeroC = 0, raiz, resultado1, resultado2;


      
            numeroA = Double.parseDouble(a.getText());
            numeroB = Double.parseDouble(b.getText());
            numeroC = Double.parseDouble(c.getText());
            if (Math.pow(numeroB, 2) - (4 * numeroA * numeroC) >= 0) {  //verifico la raiz de la ecuacion sea positiva
                raiz = Math.sqrt(Math.pow(numeroB, 2) - (4 * numeroA * numeroC));

                if (numeroA == 0 && numeroB==0) {
                      JOptionPane.showMessageDialog(null, "No cumple igualdad");
                } else if(numeroA==0 && numeroB!=0){   
                    resultado1 = -numeroC / numeroB;
                    JOptionPane.showMessageDialog(null, "Raiz unica  :  " + resultado1);
                } else {

                    resultado1 = (-numeroB + raiz) / (2 * numeroA);
                    resultado2 = (-numeroB - raiz) / (2 * numeroA);
                    if (resultado1 == resultado2) {
                        JOptionPane.showMessageDialog(null, "Raiz unica  :  " + resultado1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Raiz 1  :  " + resultado1);
                        JOptionPane.showMessageDialog(null, "Raiz 2  :  " + resultado2);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solucion Compleja");

            }

    }//GEN-LAST:event_jBRaicesActionPerformed

    private void jBGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGraficarActionPerformed
        final Graficar demo = new Graficar("Grafica cuadratica", Integer.parseInt(a.getText()), Integer.parseInt(b.getText()), Integer.parseInt(c.getText()));
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);


    }//GEN-LAST:event_jBGraficarActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
        char tecla = evt.getKeyChar();
        validarEntrada(evt, tecla); // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped

    private void bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyTyped
             char tecla = evt.getKeyChar();
        validarEntrada(evt, tecla);  // TODO add your handling code here:
    }//GEN-LAST:event_bKeyTyped

    private void cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyTyped
               char tecla = evt.getKeyChar();
        validarEntrada(evt, tecla);// TODO add your handling code here:
    }//GEN-LAST:event_cKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JButton jBGraficar;
    private javax.swing.JButton jBRaices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
