/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage.otherClasses;
import javax.swing.*; 

import javax.swing.text.*; 
import java.awt.*; 
/**
 *
 * @author Saul Leonardo
 */
class MyLabelView extends LabelView { 

 
    public MyLabelView(Element elem) { 
        super(elem); 
    } 
 
    public void paint(Graphics g, Shape allocation) { 
        super.paint(g, allocation); 
        paintStrikeLine(g, allocation); 

    } 
 
    public void paintStrikeLine(Graphics g, Shape a) { 
        Color c=(Color)getElement().getAttributes().getAttribute("strike-color"); 
        if (c!=null) { 
            int y = a.getBounds().y + a.getBounds().height - (int) getGlyphPainter().getDescent(this); 

            y = y - (int) (getGlyphPainter().getAscent(this) * 0.3f); 
            int x1 = (int) a.getBounds().getX(); 
            int x2 = (int) (a.getBounds().getX() + a.getBounds().getWidth()); 

 
            Color old = g.getColor(); 
            g.setColor(c); 
            g.drawLine(x1, y, x2, y); 
            g.setColor(old); 
        } 
    } 
} 