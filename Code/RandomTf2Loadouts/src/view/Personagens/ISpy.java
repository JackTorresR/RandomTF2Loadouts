
package view.Personagens;

import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
import view.MenuClasses;

public class ISpy extends javax.swing.JFrame {
Random n1 = new Random();

    public static int prim;
    public static int secon;
    public static int mel;
    public static int pda;
    
    public static String url1 = "www.google.com";
    public static String url2 = "www.wiki.com";
    public static String url3 = "www.teamfortress2.com";
    public static String url4 = "www.teamfortress2.com";
        
    public static boolean RareWeaponsOff = false;
       
    public ISpy() {
        initComponents();
        setTitle("Random Loadout Spy");
        setSize(806, 479);
        tirarImgs();
        randomizarRWOn();
        verificarPrimary();
        verificarSecondary();
        verificarMelee();
        verificarPda();
        setIcon();
        tirarBotoes();
        verificarBtn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlP1 = new javax.swing.JLabel();
        jlP2 = new javax.swing.JLabel();
        jlP3 = new javax.swing.JLabel();
        jlP4 = new javax.swing.JLabel();
        jlP5 = new javax.swing.JLabel();
        jlP6 = new javax.swing.JLabel();
        jlS1 = new javax.swing.JLabel();
        jlS2 = new javax.swing.JLabel();
        jlS3 = new javax.swing.JLabel();
        jlS4 = new javax.swing.JLabel();
        jlS5 = new javax.swing.JLabel();
        jlM1 = new javax.swing.JLabel();
        jlM2 = new javax.swing.JLabel();
        jlM3 = new javax.swing.JLabel();
        jlM4 = new javax.swing.JLabel();
        jlM5 = new javax.swing.JLabel();
        jlM6 = new javax.swing.JLabel();
        jlM7 = new javax.swing.JLabel();
        jlM8 = new javax.swing.JLabel();
        jlM9 = new javax.swing.JLabel();
        jlM10 = new javax.swing.JLabel();
        jlM11 = new javax.swing.JLabel();
        jlPd1 = new javax.swing.JLabel();
        jlPd2 = new javax.swing.JLabel();
        jlPd3 = new javax.swing.JLabel();
        jlPd4 = new javax.swing.JLabel();
        jbLinks1 = new javax.swing.JButton();
        jbLinks2 = new javax.swing.JButton();
        jbLinks3 = new javax.swing.JButton();
        jbLinks4 = new javax.swing.JButton();
        jbRandomizer = new javax.swing.JButton();
        jbRareWeaponsOff = new javax.swing.JButton();
        jbRareWeaponsOn = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();
        gif = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jlP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Primary/Ambassador.png"))); // NOI18N
        getContentPane().add(jlP1);
        jlP1.setBounds(110, 110, 130, 60);

        jlP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Primary/Big_Kill.png"))); // NOI18N
        getContentPane().add(jlP2);
        jlP2.setBounds(110, 110, 130, 60);

        jlP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Primary/Diamondback.png"))); // NOI18N
        getContentPane().add(jlP3);
        jlP3.setBounds(110, 110, 130, 60);

        jlP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Primary/Enforcer.png"))); // NOI18N
        getContentPane().add(jlP4);
        jlP4.setBounds(110, 110, 130, 60);

        jlP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Primary/L'Etranger.png"))); // NOI18N
        getContentPane().add(jlP5);
        jlP5.setBounds(110, 110, 130, 60);

        jlP6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Primary/Revolver.png"))); // NOI18N
        getContentPane().add(jlP6);
        jlP6.setBounds(110, 110, 130, 60);

        jlS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Secondary/Cloak_and_Dagger.png"))); // NOI18N
        getContentPane().add(jlS1);
        jlS1.setBounds(110, 180, 130, 60);

        jlS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Secondary/Dead_Ringer.png"))); // NOI18N
        getContentPane().add(jlS2);
        jlS2.setBounds(110, 180, 130, 60);

        jlS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Secondary/Enthusiast's_Timepiece.png"))); // NOI18N
        getContentPane().add(jlS3);
        jlS3.setBounds(110, 180, 130, 60);

        jlS4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Secondary/Invis_Watch.png"))); // NOI18N
        getContentPane().add(jlS4);
        jlS4.setBounds(110, 180, 130, 60);

        jlS5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Secondary/Quackenbirdt.png"))); // NOI18N
        getContentPane().add(jlS5);
        jlS5.setBounds(110, 180, 130, 60);

        jlM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Big_Earner.png"))); // NOI18N
        getContentPane().add(jlM1);
        jlM1.setBounds(110, 250, 130, 60);

        jlM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Black_Rose.png"))); // NOI18N
        getContentPane().add(jlM2);
        jlM2.setBounds(110, 250, 130, 60);

        jlM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Conniver's_Kunai.png"))); // NOI18N
        getContentPane().add(jlM3);
        jlM3.setBounds(110, 250, 130, 60);

        jlM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Golden_Frying_Pan.png"))); // NOI18N
        getContentPane().add(jlM4);
        jlM4.setBounds(110, 250, 130, 60);

        jlM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Knife.png"))); // NOI18N
        getContentPane().add(jlM5);
        jlM5.setBounds(110, 250, 130, 60);

        jlM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Prinny_Machete.png"))); // NOI18N
        getContentPane().add(jlM6);
        jlM6.setBounds(110, 250, 130, 60);

        jlM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Saxxy.png"))); // NOI18N
        getContentPane().add(jlM7);
        jlM7.setBounds(110, 250, 130, 60);

        jlM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Sharp_Dresser.png"))); // NOI18N
        getContentPane().add(jlM8);
        jlM8.setBounds(110, 250, 130, 60);

        jlM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Spy-cicle.png"))); // NOI18N
        getContentPane().add(jlM9);
        jlM9.setBounds(110, 250, 130, 60);

        jlM10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Wanga_Prick.png"))); // NOI18N
        getContentPane().add(jlM10);
        jlM10.setBounds(110, 250, 130, 60);

        jlM11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/Melee/Your_Eternal_Reward.png"))); // NOI18N
        getContentPane().add(jlM11);
        jlM11.setBounds(110, 250, 130, 60);

        jlPd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/PDA/Ap-Sap.png"))); // NOI18N
        getContentPane().add(jlPd1);
        jlPd1.setBounds(110, 320, 130, 60);

        jlPd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/PDA/Red-Tape_Recorder.png"))); // NOI18N
        getContentPane().add(jlPd2);
        jlPd2.setBounds(110, 320, 130, 60);

        jlPd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/PDA/Sapper.png"))); // NOI18N
        getContentPane().add(jlPd3);
        jlPd3.setBounds(110, 320, 130, 60);

        jlPd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/09_Spy/PDA/Snack_Attack.png"))); // NOI18N
        getContentPane().add(jlPd4);
        jlPd4.setBounds(110, 320, 130, 60);

        jbLinks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/weblink.png"))); // NOI18N
        jbLinks1.setContentAreaFilled(false);
        jbLinks1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLinks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLinks1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbLinks1);
        jbLinks1.setBounds(250, 130, 73, 23);

        jbLinks2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/weblink.png"))); // NOI18N
        jbLinks2.setContentAreaFilled(false);
        jbLinks2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLinks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLinks2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbLinks2);
        jbLinks2.setBounds(250, 190, 73, 30);

        jbLinks3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/weblink.png"))); // NOI18N
        jbLinks3.setContentAreaFilled(false);
        jbLinks3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLinks3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLinks3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbLinks3);
        jbLinks3.setBounds(250, 260, 73, 30);

        jbLinks4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/weblink.png"))); // NOI18N
        jbLinks4.setContentAreaFilled(false);
        jbLinks4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLinks4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLinks4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbLinks4);
        jbLinks4.setBounds(250, 330, 73, 30);

        jbRandomizer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TryOther.png"))); // NOI18N
        jbRandomizer.setContentAreaFilled(false);
        jbRandomizer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRandomizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRandomizerActionPerformed(evt);
            }
        });
        getContentPane().add(jbRandomizer);
        jbRandomizer.setBounds(590, 400, 140, 40);

        jbRareWeaponsOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jbRareWeaponsOff.png"))); // NOI18N
        jbRareWeaponsOff.setContentAreaFilled(false);
        jbRareWeaponsOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRareWeaponsOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRareWeaponsOffActionPerformed(evt);
            }
        });
        getContentPane().add(jbRareWeaponsOff);
        jbRareWeaponsOff.setBounds(370, 400, 140, 40);

        jbRareWeaponsOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jbRareWeaponsOn.png"))); // NOI18N
        jbRareWeaponsOn.setContentAreaFilled(false);
        jbRareWeaponsOn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRareWeaponsOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRareWeaponsOnActionPerformed(evt);
            }
        });
        getContentPane().add(jbRareWeaponsOn);
        jbRareWeaponsOn.setBounds(370, 400, 140, 40);

        jbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        jbBack.setContentAreaFilled(false);
        jbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });
        getContentPane().add(jbBack);
        jbBack.setBounds(110, 400, 130, 40);

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gifs/Spy.gif"))); // NOI18N
        gif.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(gif);
        gif.setBounds(380, 90, 380, 280);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LoadoutsBG/Spy.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 800, 450);

        setSize(new java.awt.Dimension(816, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLinks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLinks1ActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url1));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbLinks1ActionPerformed

    private void jbLinks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLinks2ActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url2));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbLinks2ActionPerformed

    private void jbLinks3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLinks3ActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url3));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbLinks3ActionPerformed

    private void jbLinks4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLinks4ActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url4));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbLinks4ActionPerformed

    private void jbRandomizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRandomizerActionPerformed
        tirarImgs();
        if(RareWeaponsOff==false){
            randomizarRWOn();
        }else{
            randomizarRWOff();
        }
        verificarPrimary();
        verificarSecondary();
        verificarMelee();
        verificarPda();
    }//GEN-LAST:event_jbRandomizerActionPerformed

    private void jbRareWeaponsOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRareWeaponsOffActionPerformed
        //Desablitirar as armas raras está em true
        RareWeaponsOff=true;
        jbRareWeaponsOff.setVisible(false);
        jbRareWeaponsOn.setVisible(true);
    }//GEN-LAST:event_jbRareWeaponsOffActionPerformed

    private void jbRareWeaponsOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRareWeaponsOnActionPerformed
        //Desablitirar as armas raras está em false
        RareWeaponsOff=false;
        jbRareWeaponsOff.setVisible(true);
        jbRareWeaponsOn.setVisible(false);
    }//GEN-LAST:event_jbRareWeaponsOnActionPerformed

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        MenuClasses mn = new MenuClasses();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbBackActionPerformed

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
            java.util.logging.Logger.getLogger(ISpy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISpy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISpy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISpy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISpy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel gif;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbLinks1;
    private javax.swing.JButton jbLinks2;
    private javax.swing.JButton jbLinks3;
    private javax.swing.JButton jbLinks4;
    private javax.swing.JButton jbRandomizer;
    private javax.swing.JButton jbRareWeaponsOff;
    private javax.swing.JButton jbRareWeaponsOn;
    private javax.swing.JLabel jlM1;
    private javax.swing.JLabel jlM10;
    private javax.swing.JLabel jlM11;
    private javax.swing.JLabel jlM2;
    private javax.swing.JLabel jlM3;
    private javax.swing.JLabel jlM4;
    private javax.swing.JLabel jlM5;
    private javax.swing.JLabel jlM6;
    private javax.swing.JLabel jlM7;
    private javax.swing.JLabel jlM8;
    private javax.swing.JLabel jlM9;
    private javax.swing.JLabel jlP1;
    private javax.swing.JLabel jlP2;
    private javax.swing.JLabel jlP3;
    private javax.swing.JLabel jlP4;
    private javax.swing.JLabel jlP5;
    private javax.swing.JLabel jlP6;
    private javax.swing.JLabel jlPd1;
    private javax.swing.JLabel jlPd2;
    private javax.swing.JLabel jlPd3;
    private javax.swing.JLabel jlPd4;
    private javax.swing.JLabel jlS1;
    private javax.swing.JLabel jlS2;
    private javax.swing.JLabel jlS3;
    private javax.swing.JLabel jlS4;
    private javax.swing.JLabel jlS5;
    // End of variables declaration//GEN-END:variables

    private void tirarImgs() {
        jlP1.setVisible(false);
        jlP2.setVisible(false);
        jlP3.setVisible(false);
        jlP4.setVisible(false);
        jlP5.setVisible(false);
        jlP6.setVisible(false);
        
        jlS1.setVisible(false);
        jlS2.setVisible(false);
        jlS3.setVisible(false);
        jlS4.setVisible(false);
        jlS5.setVisible(false);
        jlS5.setVisible(false);
        
        jlM1.setVisible(false);
        jlM2.setVisible(false);
        jlM3.setVisible(false);
        jlM4.setVisible(false);
        jlM5.setVisible(false);
        jlM6.setVisible(false);
        jlM7.setVisible(false);
        jlM8.setVisible(false);
        jlM9.setVisible(false);
        jlM10.setVisible(false);
        jlM11.setVisible(false);
        
        jlPd1.setVisible(false);
        jlPd2.setVisible(false);
        jlPd3.setVisible(false);
        jlPd4.setVisible(false);
    }
    
    private void randomizarRWOff() {
        do{
            prim = n1.nextInt(7);
            secon = n1.nextInt(6);
            mel = n1.nextInt(12);
            pda = n1.nextInt(5);
        }while(prim==0 || prim>6 || secon==0 || secon>5 || mel==0 || mel==7 || mel>11 || pda==0 || pda>4); 
        
    }
    
    private void randomizarRWOn() {
        do{
            prim = n1.nextInt(7);
            secon = n1.nextInt(6);
            mel = n1.nextInt(12);
            pda = n1.nextInt(5);
        }while(prim==0 || prim>6 || secon==0 || secon>5 || mel==0 || mel>11 || pda==0 || pda>4); 
        
    }

    private void verificarPrimary() {
        switch(prim){
                case 1:
                        jlP1.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Ambassador";
                    break;
                case 2:
                        jlP2.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Big_Kill";
                    break;
                case 3:
                        jlP3.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Diamondback";
                    break;
                case 4:
                        jlP4.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Enforcer";
                    break;
                case 5:
                        jlP5.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/L%27Etranger";
                    break;
                case 6:
                        jlP6.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Revolver";
                    break;
                default:
                    break;
        }
    }

    private void verificarSecondary() {
        switch(secon){
                case 1:
                        jlS1.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Cloak_and_Dagger";
                    break;
                case 2:
                        jlS2.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Dead_Ringer";
                    break;
                case 3:
                        jlS3.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Enthusiast%27s_Timepiece";
                    break;
                case 4:
                        jlS4.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Invisibility_Watch";
                    break;
                case 5:
                        jlS5.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Qu%C3%A4ckenbirdt";
                    break;
                default:
                    break;
        }
    }

    private void verificarMelee() {
        switch(mel){
                case 1:
                        jlM1.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Big_Earner";
                    break;
                case 2:
                        jlM2.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Black_Rose";
                    break;
                case 3:
                        jlM3.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Conniver%27s_Kunai";
                    break;
                case 4:
                        jlM4.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Golden_Frying_Pan";
                    break;
                case 5:
                        jlM5.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Knife";
                    break;
                case 6:
                        jlM6.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Prinny_Machete";
                    break;
                case 7:
                        jlM7.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Saxxy";
                    break;
                case 8:
                        jlM8.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Sharp_Dresser";
                    break;
                case 9:
                        jlM9.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Spy-cicle";
                    break;
                case 10:
                        jlM10.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Wanga_Prick";
                    break;
                case 11:
                        jlM11.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Your_Eternal_Reward";
                    break;
                default:
                    break;
        }
    }

    private void verificarPda() {
        switch(pda){
                case 1:
                        jlPd1.setVisible(true);
                        url4="https://wiki.teamfortress.com/wiki/Ap-Sap";
                    break;
                case 2:
                        jlPd2.setVisible(true);
                        url4="https://wiki.teamfortress.com/wiki/Red-Tape_Recorder";
                    break;
                case 3:
                        jlPd3.setVisible(true);
                        url4="https://wiki.teamfortress.com/wiki/Sapper";
                    break;
                case 4:
                        jlPd4.setVisible(true);
                        url4="https://wiki.teamfortress.com/wiki/Snack_Attack";
                    break;
                default:
                    break;
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons/ISpy.png")));
    }

    private void tirarBotoes() {
        jbRareWeaponsOff.setVisible(true);
        jbRareWeaponsOn.setVisible(false);
    }

    private void verificarBtn() {
        
        if(RareWeaponsOff==true){
            jbRareWeaponsOff.setVisible(false);
            jbRareWeaponsOn.setVisible(true);
        }else{
            jbRareWeaponsOff.setVisible(true);
            jbRareWeaponsOn.setVisible(false);
        }
        
    }
    
}
