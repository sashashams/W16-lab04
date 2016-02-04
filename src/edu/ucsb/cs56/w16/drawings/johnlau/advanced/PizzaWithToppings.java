package edu.ucsb.cs56.w16.drawings.johnlau.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   A Slice of Pizza
      
   @author John Lau 
   @version for CS56, W16, UCSB
   
*/
public class PizzaWithToppings extends Pizza implements Shape
{
    /**
     * Constructor for objects of class Pizza
     */
    public PizzaWithToppings(double x, double y, double width, double height)
    {
	// construct the basic pizza shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	

	//draw circles within the slice of the pizza, between height*.1 and height*.9, and 
	//within the width of the slice itself


	double radius = 0.10 * width;
	
	Ellipse2D.Double pepperoni1 =
	    new Ellipse2D.Double(x + (width*0.6), y+(height*0.2), 2.0*radius, 2.0*radius);
	Ellipse2D.Double pepperoni2 =
	    new Ellipse2D.Double(x + (width*0.4), y+(height*0.5), 2.0*radius, 2.0*radius);
	Ellipse2D.Double pepperoni3 =
	    new Ellipse2D.Double(x + (width*0.2), y+(height*0.15), 2.0*radius, 2.0*radius);
	
		
        GeneralPath wholePizza = this.get();
        wholePizza.append(pepperoni1, false);
        wholePizza.append(pepperoni2, false);
        wholePizza.append(pepperoni3, false); 
    }    
}
