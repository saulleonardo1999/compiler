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
public class NewViewFactory implements ViewFactory { 
    public View create(Element elem) { 
        String kind = elem.getName(); 
        if (kind != null) { 
            if (kind.equals(AbstractDocument.ContentElementName)) { 

                return new MyLabelView(elem); 
            } 
            else if (kind.equals(AbstractDocument.ParagraphElementName)) { 
                return new ParagraphView(elem); 
            } 
            else if (kind.equals(AbstractDocument.SectionElementName)) { 
                return new BoxView(elem, View.Y_AXIS); 

            } 
            else if (kind.equals(StyleConstants.ComponentElementName)) { 
                return new ComponentView(elem); 
            } 
            else if (kind.equals(StyleConstants.IconElementName)) { 
                return new IconView(elem); 
            } 

        } 
 
        // default to text display 
        return new LabelView(elem); 
    } 
} 