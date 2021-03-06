/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Orion
 */
public class RoboBody extends javax.swing.JFrame {
    public Robo bobby = new Robo("Bobby", "20/20/2020", 10.0);
    public Bateria bat = bobby.robobateria;
    private String nomerobo = "Olá eu sou o " + bobby.getNome();
    private URL url = this.getClass().getResource("/robo/roboIcon.png");  
    private Image iconeRobo = Toolkit.getDefaultToolkit().getImage(url);
    /**
     * Creates new form RoboBody
     */
    public RoboBody() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roboPanel = new javax.swing.JPanel();
        subtrairButton = new javax.swing.JButton();
        somaButton = new javax.swing.JButton();
        multiplicaButton = new javax.swing.JButton();
        divisaoButton = new javax.swing.JButton();
        carregarBateriaButton = new javax.swing.JToggleButton();
        stbateriaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        roboLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(nomerobo);
        setIconImage(iconeRobo);
        setPreferredSize(new java.awt.Dimension(520, 520));
        setResizable(false);

        roboPanel.setMaximumSize(new java.awt.Dimension(504, 504));
        roboPanel.setMinimumSize(new java.awt.Dimension(500, 500));
        roboPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        subtrairButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        subtrairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robo/menosButton.jpg"))); // NOI18N
        subtrairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtrairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtrairButtonMouseClicked(evt);
            }
        });

        somaButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        somaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robo/maisButton.jpg"))); // NOI18N
        somaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        somaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                somaButtonMouseClicked(evt);
            }
        });

        multiplicaButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        multiplicaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robo/vezesButton.jpg"))); // NOI18N
        multiplicaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicaButtonMouseClicked(evt);
            }
        });

        divisaoButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        divisaoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robo/dividirButton.jpg"))); // NOI18N
        divisaoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divisaoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisaoButtonMouseClicked(evt);
            }
        });

        carregarBateriaButton.setText("Carregar Bateria");
        carregarBateriaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carregarBateriaButtonMouseClicked(evt);
            }
        });

        stbateriaLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                stbateriaLabelInputMethodTextChanged(evt);
            }
        });
        stbateriaLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                stbateriaLabelPropertyChange(evt);
            }
        });

        jLabel1.setText("Bateria");

        roboLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robo/RoboBody.png"))); // NOI18N

        javax.swing.GroupLayout roboPanelLayout = new javax.swing.GroupLayout(roboPanel);
        roboPanel.setLayout(roboPanelLayout);
        roboPanelLayout.setHorizontalGroup(
            roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roboPanelLayout.createSequentialGroup()
                .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roboPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stbateriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                    .addGroup(roboPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(roboPanelLayout.createSequentialGroup()
                                .addComponent(somaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtrairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roboPanelLayout.createSequentialGroup()
                                .addComponent(multiplicaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(roboPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(carregarBateriaButton)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roboPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(roboLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        roboPanelLayout.setVerticalGroup(
            roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roboPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(carregarBateriaButton)
                .addGap(4, 4, 4)
                .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stbateriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(somaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtrairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiplicaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(roboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roboPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(roboLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roboPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roboPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_somaButtonMouseClicked
        try{
            //JOptionPane.showMessageDialog(null, "O resultado é "+String.valueOf(bobby.operacional("+"))+"!", "Resultado", JOptionPane.INFORMATION_MESSAGE, bobby.roboIcon);
            bobby.operacional("+");
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.INFORMATION_MESSAGE, bobby.roboIcon);
        }
    }//GEN-LAST:event_somaButtonMouseClicked

    private void subtrairButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtrairButtonMouseClicked
        try{
            bobby.operacional("-");
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.INFORMATION_MESSAGE, bobby.roboIcon);
        }
    }//GEN-LAST:event_subtrairButtonMouseClicked

    private void multiplicaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicaButtonMouseClicked
        try{
            bobby.operacional("*");
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.INFORMATION_MESSAGE, bobby.roboIcon);
        }
    }//GEN-LAST:event_multiplicaButtonMouseClicked

    private void divisaoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisaoButtonMouseClicked
        try{
            bobby.operacional("/");
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.INFORMATION_MESSAGE, bobby.roboIcon);
        }
    }//GEN-LAST:event_divisaoButtonMouseClicked

    private void carregarBateriaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carregarBateriaButtonMouseClicked
        double bateria;
        try {
            bateria = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Entre com a bateria ", "Carregar Bateria", JOptionPane.QUESTION_MESSAGE, bobby.roboIcon, null, null));
            bat.setBateria(bateria);
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        } catch (Exception ex) {
            Logger.getLogger(RoboBody.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_carregarBateriaButtonMouseClicked

    private void stbateriaLabelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_stbateriaLabelInputMethodTextChanged
        try {
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        } catch (Exception ex) {
            Logger.getLogger(RoboBody.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stbateriaLabelInputMethodTextChanged

    private void stbateriaLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_stbateriaLabelPropertyChange
        try {
            stbateriaLabel.setText(String.valueOf(bat.getBateria()));
        } catch (Exception ex) {
            Logger.getLogger(RoboBody.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stbateriaLabelPropertyChange
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
            java.util.logging.Logger.getLogger(RoboBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoboBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoboBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoboBody.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoboBody().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton carregarBateriaButton;
    private javax.swing.JButton divisaoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiplicaButton;
    private javax.swing.JLabel roboLabel;
    private javax.swing.JPanel roboPanel;
    private javax.swing.JButton somaButton;
    private javax.swing.JLabel stbateriaLabel;
    private javax.swing.JButton subtrairButton;
    // End of variables declaration//GEN-END:variables
}
