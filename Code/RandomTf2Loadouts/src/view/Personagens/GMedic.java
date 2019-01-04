
package view.Personagens;

import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
import view.MenuClasses;

public class GMedic extends javax.swing.JFrame {
Random n1 = new Random();

    public static int prim;
    public static int secon;
    public static int mel;
    
    public static String url1 = "www.google.com";
    public static String url2 = "www.wiki.com";
    public static String url3 = "www.teamfortress2.com";
    
    public static boolean RareWeaponsOff = false;
    
    public GMedic() {
        initComponents();
        setTitle("Random Loadout Medic");
        setSize(806, 479);
        tirarImgs();
        randomizarRWOn();
        verificarPrimary();
        verificarSecondary();
        verificarMelee();
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
        jlS1 = new javax.swing.JLabel();
        jlS2 = new javax.swing.JLabel();
        jlS3 = new javax.swing.JLabel();
        jlS4 = new javax.swing.JLabel();
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
        jlM12 = new javax.swing.JLabel();
        jlM13 = new javax.swing.JLabel();
        jlM14 = new javax.swing.JLabel();
        jlM15 = new javax.swing.JLabel();
        jlM16 = new javax.swing.JLabel();
        jbLinks1 = new javax.swing.JButton();
        jbLinks2 = new javax.swing.JButton();
        jbLinks3 = new javax.swing.JButton();
        jbRandomizer = new javax.swing.JButton();
        jbRareWeaponsOff = new javax.swing.JButton();
        jbRareWeaponsOn = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();
        gif = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jlP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Primary/Blutsauger.png"))); // NOI18N
        getContentPane().add(jlP1);
        jlP1.setBounds(110, 110, 130, 60);

        jlP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Primary/Crusader's_Crossbow.png"))); // NOI18N
        getContentPane().add(jlP2);
        jlP2.setBounds(110, 110, 130, 60);

        jlP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Primary/Overdose.png"))); // NOI18N
        getContentPane().add(jlP3);
        jlP3.setBounds(110, 110, 130, 60);

        jlP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Primary/Syringe_Gun.png"))); // NOI18N
        getContentPane().add(jlP4);
        jlP4.setBounds(110, 110, 130, 60);

        jlS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Secondary/Kritzkrieg.png"))); // NOI18N
        getContentPane().add(jlS1);
        jlS1.setBounds(110, 180, 130, 60);

        jlS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Secondary/Medi_Gun.png"))); // NOI18N
        getContentPane().add(jlS2);
        jlS2.setBounds(110, 180, 130, 60);

        jlS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Secondary/Quick-Fix.png"))); // NOI18N
        getContentPane().add(jlS3);
        jlS3.setBounds(110, 180, 130, 60);

        jlS4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Secondary/Vaccinator.png"))); // NOI18N
        getContentPane().add(jlS4);
        jlS4.setBounds(110, 180, 130, 60);

        jlM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Melee/Amputator.png"))); // NOI18N
        getContentPane().add(jlM1);
        jlM1.setBounds(110, 250, 130, 60);

        jlM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Bat_Outta_Hell.png"))); // NOI18N
        getContentPane().add(jlM2);
        jlM2.setBounds(110, 250, 130, 60);

        jlM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Melee/Bonesaw.png"))); // NOI18N
        getContentPane().add(jlM3);
        jlM3.setBounds(110, 250, 130, 60);

        jlM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Conscientious_Objector.png"))); // NOI18N
        getContentPane().add(jlM4);
        jlM4.setBounds(110, 250, 130, 60);

        jlM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Crossing_Guard.png"))); // NOI18N
        getContentPane().add(jlM5);
        jlM5.setBounds(110, 250, 130, 60);

        jlM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Freedom_Staff.png"))); // NOI18N
        getContentPane().add(jlM6);
        jlM6.setBounds(110, 250, 130, 60);

        jlM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Frying_Pan.png"))); // NOI18N
        getContentPane().add(jlM7);
        jlM7.setBounds(110, 250, 130, 60);

        jlM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Golden_Frying_Pan.png"))); // NOI18N
        getContentPane().add(jlM8);
        jlM8.setBounds(110, 250, 130, 60);

        jlM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Ham_Shank.png"))); // NOI18N
        getContentPane().add(jlM9);
        jlM9.setBounds(110, 250, 130, 60);

        jlM10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Memory_Maker.png"))); // NOI18N
        getContentPane().add(jlM10);
        jlM10.setBounds(110, 250, 130, 60);

        jlM11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Necro_Smasher.png"))); // NOI18N
        getContentPane().add(jlM11);
        jlM11.setBounds(110, 250, 130, 60);

        jlM12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Prinny_Machete.png"))); // NOI18N
        getContentPane().add(jlM12);
        jlM12.setBounds(110, 250, 130, 60);

        jlM13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/10_Multi Classes/Melee/Saxxy.png"))); // NOI18N
        getContentPane().add(jlM13);
        jlM13.setBounds(110, 250, 130, 60);

        jlM14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Melee/Solemn_Vow.png"))); // NOI18N
        getContentPane().add(jlM14);
        jlM14.setBounds(110, 250, 130, 60);

        jlM15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Melee/Ubersaw.png"))); // NOI18N
        getContentPane().add(jlM15);
        jlM15.setBounds(110, 250, 130, 60);

        jlM16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG/Armas tf2/07_Medic/Melee/Vita-Saw.png"))); // NOI18N
        getContentPane().add(jlM16);
        jlM16.setBounds(110, 250, 130, 60);

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

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gifs/medic.gif"))); // NOI18N
        getContentPane().add(gif);
        gif.setBounds(360, 100, 420, 290);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LoadoutsBG/Medic.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(GMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GMedic().setVisible(true);
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
    private javax.swing.JButton jbRandomizer;
    private javax.swing.JButton jbRareWeaponsOff;
    private javax.swing.JButton jbRareWeaponsOn;
    private javax.swing.JLabel jlM1;
    private javax.swing.JLabel jlM10;
    private javax.swing.JLabel jlM11;
    private javax.swing.JLabel jlM12;
    private javax.swing.JLabel jlM13;
    private javax.swing.JLabel jlM14;
    private javax.swing.JLabel jlM15;
    private javax.swing.JLabel jlM16;
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
    private javax.swing.JLabel jlS1;
    private javax.swing.JLabel jlS2;
    private javax.swing.JLabel jlS3;
    private javax.swing.JLabel jlS4;
    // End of variables declaration//GEN-END:variables

    private void tirarImgs() {
        jlP1.setVisible(false);
        jlP2.setVisible(false);
        jlP3.setVisible(false);
        jlP4.setVisible(false);
        
        jlS1.setVisible(false);
        jlS2.setVisible(false);
        jlS3.setVisible(false);
        jlS4.setVisible(false);
        
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
        jlM12.setVisible(false);
        jlM13.setVisible(false);
        jlM14.setVisible(false);
        jlM15.setVisible(false);
        jlM16.setVisible(false);
    }
    
    private void randomizarRWOff() {
        do{
            prim = n1.nextInt(5);
            secon = n1.nextInt(5);
            mel = n1.nextInt(17);
        }while(prim==0 || prim>4 || secon==0 || secon>4 || mel==0 || mel==10 || mel==13 || mel>16);
    }
    
    private void randomizarRWOn() {
        do{
            prim = n1.nextInt(5);
            secon = n1.nextInt(5);
            mel = n1.nextInt(17);
        }while(prim==0 || prim>4 || secon==0 || secon>4 || mel==0 || mel>16);
    }

    private void verificarPrimary() {
        switch(prim){
                case 1:
                        jlP1.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Blutsauger";
                    break;
                case 2:
                        jlP2.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Crusader%27s_Crossbow";
                    break;
                case 3:
                        jlP3.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Overdose";
                    break;
                case 4:
                        jlP4.setVisible(true);
                        url1="https://wiki.teamfortress.com/wiki/Syringe_Gun";
                    break;
                default:
                    break;
        }
    }

    private void verificarSecondary() {
        switch(secon){
                case 1:
                        jlS1.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Kritzkrieg";
                    break;
                case 2:
                        jlS2.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Medi_Gun";
                    break;
                case 3:
                        jlS3.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Quick-Fix";
                    break;
                case 4:
                        jlS4.setVisible(true);
                        url2="https://wiki.teamfortress.com/wiki/Vaccinator";
                    break;
                default:
                    break;
        }
    }

    private void verificarMelee() {
        switch(mel){
                case 1:
                        jlM1.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Amputator";
                    break;
                case 2:
                        jlM2.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Bat_Outta_Hell";
                    break;
                case 3:
                        jlM3.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Bonesaw";
                    break;
                case 4:
                        jlM4.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Conscientious_Objector";
                    break;
                case 5:
                        jlM5.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Crossing_Guard";
                    break;
                case 6:
                        jlM6.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Freedom_Staff";
                    break;
                case 7:
                        jlM7.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Frying_Pan";
                    break;
                case 8:
                        jlM8.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Golden_Frying_Pan";
                    break;
                case 9:
                        jlM9.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Ham_Shank";
                    break;
                case 10:
                        jlM10.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Memory_Maker";
                    break;
                case 11:
                        jlM11.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Necro_Smasher";
                    break;
                case 12:
                        jlM12.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Prinny_Machete";
                    break;
                case 13:
                        jlM13.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Saxxy";
                    break;
                case 14:
                        jlM14.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Solemn_Vow";
                    break;
                case 15:
                        jlM15.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Ubersaw";
                    break;
                case 16:
                        jlM16.setVisible(true);
                        url3="https://wiki.teamfortress.com/wiki/Vita-Saw";
                default:
                    break;
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons/GMedic.png")));
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
