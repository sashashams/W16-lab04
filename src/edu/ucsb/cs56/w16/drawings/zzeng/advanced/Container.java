package edu.ucsb.cs56.w16.drawings.zzeng.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.w16.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w16.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a container which consists of two circles and two lines which creates a cyclinder.
   
   @author Ziliang Zeng 
   @version for CS56, W16, UCSB
   
*/
public class Container extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coordinate of the center of the base of the Container
       @param y y coordinate of the center of the base of the Container
       @param r radius of Container
       @param h height of the container
    */
    public Container(double x, double y, double r, double h)
    {
	Circle botCircle = new Circle(x,y,r);
	Circle topCircle = new Circle(x,y-h,r);
	Line2D.Double leftSide = new Line2D.Double (x-r,y,x-r,y-h);
	Line2D.Double rightSide =  new Line2D.Double (x+r,y,x+r,y-h);

	//Puts the Container together
	
	GeneralPath completeContainer = this.get();
	completeContainer.append(botCircle, false);
	completeContainer.append(leftSide, false);
	completeContainer.append(topCircle, false);
	completeContainer.append(rightSide, false);
       
    }
}
