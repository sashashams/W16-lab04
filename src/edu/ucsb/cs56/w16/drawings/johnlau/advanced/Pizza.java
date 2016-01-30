package edu.ucsb.cs56.w16.drawings.johnlau.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.w16.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w16.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pizza slice that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author John Lau
   @version for CS56, W16, UCSB
   
*/
public class Pizza extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left of pizza slice
       @param y y coord of top left of pizza slice
       @param width width of the pizza
       @param height of pizza 
    */
    public Pizza(double x, double y, double width, double height){
        
	double w = width;
        double h = height;
        
        // Make the crust
        
        Rectangle2D.Double crust = 
            new Rectangle2D.Double(x, y ,
				   w, h*0.1);
	
        // make the actual pizza slice.
        
	Line2D.Double leftSliceLine = 
            new Line2D.Double (x, y+(h*0.1),
                               x + w/2.0,y+(h*0.9));
	
        Line2D.Double rightSliceLine =
            new Line2D.Double (x + w, y+(h*0.1),
                               x + w/2.0, y+(h*0.9));
	
        // put the whole pizza together
	
        GeneralPath wholePizza = this.get();
        wholePizza.append(crust, false);
        wholePizza.append(leftSliceLine, false);
	wholePizza.append(rightSliceLine, false);    
    }
}
