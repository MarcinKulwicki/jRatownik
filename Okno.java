/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import static java.lang.Math.sqrt;
import javax.swing.JComponent;

/**
 *
 * @author java
 */
public class Okno extends javax.swing.JFrame {
    static public int a=2;
    private String s;
    int get_X, get_Y; 
         static public int X1,Y1,X2,Y2;
    private Point p;
    private Graphics2D g2dd;
    private Graphics g;
    private double d;
    
    /**
     * Creates new form Okno
     */
    public Okno() {
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

        jPainter10 = new komponenty.JPainter();
        sandX = new javax.swing.JTextField();
        draw_line = new javax.swing.JButton();
        sandY = new javax.swing.JTextField();
        seaX = new javax.swing.JTextField();
        seaY = new javax.swing.JTextField();
        button_sea = new javax.swing.JButton();
        button_sand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPainter10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPainter10MouseClicked(evt);
            }
        });

        sandX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sandXFocusLost(evt);
            }
        });
        sandX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandXActionPerformed(evt);
            }
        });

        draw_line.setText("Draw Line");
        draw_line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                draw_lineActionPerformed(evt);
            }
        });

        sandY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandYActionPerformed(evt);
            }
        });

        seaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaXActionPerformed(evt);
            }
        });

        seaY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaYActionPerformed(evt);
            }
        });

        button_sea.setText("sea");
        button_sea.setToolTipText("");
        button_sea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_seaActionPerformed(evt);
            }
        });

        button_sand.setText("sand");
        button_sand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainter10, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_sand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seaX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(seaY, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                    .addComponent(button_sea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(draw_line)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sandX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(sandY, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainter10, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seaX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seaY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_sea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sandX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sandY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_sand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(draw_line)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sandXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sandXFocusLost
        // TODO add your handling code here:
        s = sandX.getText();
        a = Integer.parseInt(s);
    }//GEN-LAST:event_sandXFocusLost

    private void sandXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandXActionPerformed
        // TODO add your handling code here:
        s = sandX.getText();
        a = Integer.parseInt(s);
        
    }//GEN-LAST:event_sandXActionPerformed

    private void draw_lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draw_lineActionPerformed
        // TODO add your handling code here:
        s = sandX.getText();
        a = Integer.parseInt(s);
       int pol=0;
        double d1,d2,d1_wyb=9999,d2_wyb=9999;
        for (int i=0; i<jPainter10.getWidth();i++)
        {
            
            d1 = sqrt(((X1-i)*(X1-i))+(jPainter10.getHeight()/2-Y1)*(jPainter10.getHeight()/2-Y1));
            d2 = sqrt(((X2-i)*(X2-i))+(Y2-(jPainter10.getHeight()/2))*(Y2-(jPainter10.getHeight()/2)));
            if((d1/1+d2/3) < (d1_wyb/1+d2_wyb/3))
            {
                d1_wyb=d1;
                d2_wyb=d2;
                pol=i;
            }
            
        }
        
       jPainter10.draw(X1,Y1,pol,jPainter10.getHeight()/2,X2,Y2);
       
       
       //graph.drawLine(0, X1, 200, 300);
    }//GEN-LAST:event_draw_lineActionPerformed

    private void seaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seaXActionPerformed

    private void seaYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seaYActionPerformed

    private void sandYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sandYActionPerformed

    private void jPainter10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPainter10MouseClicked
        //Point pom = p.getLocation();
        PointerInfo a = MouseInfo.getPointerInfo();
        //Point pom = a.getLocation();
        Point pom = evt.getPoint();
        get_X = (int) pom.getX();
        get_Y = (int) pom.getY();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jPainter10MouseClicked

    private void button_seaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_seaActionPerformed
        // TODO add your handling code here:
        if (get_Y < jPainter10.getHeight()/2)
        {
        seaX.setText( Integer.toString(get_X));
        seaY.setText( Integer.toString(get_Y));
        X1 = get_X;
        Y1 = get_Y;
        }
        else
        {
        seaX.setText("Err");
        seaY.setText("Err");
        }
    }//GEN-LAST:event_button_seaActionPerformed

    private void button_sandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sandActionPerformed
        // TODO add your handling code here:
        if (get_Y >= jPainter10.getHeight()/2)
        {
        sandX.setText( Integer.toString(get_X));
        sandY.setText( Integer.toString(get_Y));
        X2 = get_X;
        Y2 = get_Y;
        }
        else
        {
        sandX.setText("Err");
        sandY.setText("Err");
        }
    }//GEN-LAST:event_button_sandActionPerformed

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
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_sand;
    private javax.swing.JButton button_sea;
    private javax.swing.JButton draw_line;
    private komponenty.JPainter jPainter10;
    private javax.swing.JTextField sandX;
    private javax.swing.JTextField sandY;
    private javax.swing.JTextField seaX;
    private javax.swing.JTextField seaY;
    // End of variables declaration//GEN-END:variables
}
