/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Marcin
 */
public class JPainter extends JComponent {

  
    //paintComponent(g);
    //Graphics2D g2d = (Graphics2D) g;
    //Okno okno = new Okno();
    //@Override
    public static int x1=0,x2=0,y1=0,y2=0,pomx=0,pomy=0;
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        
        g2d.setColor(Color.orange);
        g2d.fillRect(0, getHeight()/2, getWidth(), getHeight());
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, getWidth(), getHeight()/2);
        g2d.setColor(Color.BLACK);
        g2d.drawLine(x1, y1, pomx, pomy);
        g2d.drawLine(pomx, pomy,x2,y2);
        
    }
    
    public void draw(int x_1, int y_1,int pom_x, int pom_y, int x_2, int y_2){
        x1= x_1;
        x2= x_2;
        y1= y_1;
        y2= y_2;
        pomx= pom_x;
        pomy= pom_y;
        repaint();
    }
    
 
    
        @Override
        public Dimension getPreferredSize(){
        return new Dimension(200,100);
    }
    
    
}