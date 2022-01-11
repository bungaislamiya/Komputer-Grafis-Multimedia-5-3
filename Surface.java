/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika053;

/**
 *
 * @author lenovo
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surface extends JPanel {
    
    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setPaint(new Color(150, 150, 100));
        
        /* koordinat object - awal0 */
        String s = "Object ke-0";
        g2d.drawString(s, 15, 15);
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(100, 100, 150));
        s = "Scale ke-1";
        g2d.drawString(s, 100, 15);
        s = "Scale ke-2"
        g2d.drawString(s, 170, 15);
        
        AffineTransform tx1 = new AffineTransform();
        tx1.translate(110, 22);
        tx1.scale(0.5, 0.5); // posisi Scale 1
        g2d.setTransform(tx1);
        g2d.fillRect(0, 0, 80, 50);
        
        g2d.setPaint(new Color(100, 150, 150));
        AffineTransform tx2 = new AffineTransform();
        tx2.translate(170, 20);
        tx2.scale(1.5, 1.5); // posisi Scale 2
        g2d.setTransform(tx2);
        g2d.fillRect(0, 0, 80, 50);
        
        g2d.dispose();
    }
    
    @Override
    public void paintComponent (Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }
}
