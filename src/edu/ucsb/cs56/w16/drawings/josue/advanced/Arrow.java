package edu.ucsb.cs56.w16.drawings.josue.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.w16.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w16.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an arrow that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Josue Montenegro
   @version for CS56, W16, UCSB
   
*/

public class Arrow extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the arrow
       @param height of the arrow (including the tip)
    */
    public Arrow(double x, double y, double headWidth, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double tailHeight = .75 * height;
        double arrowHeadHeight = height - tailHeight;
        
        double tailUpperLeftY = y + tailHeight;
        
        // Make the tail
        
        Rectangle2D.Double Tail = 
            new Rectangle2D.Double(x+(headWidth/2)-(headWidth/8), tailUpperLeftY ,
				   headWidth/4, tailHeight);
	
        // make the Arrow Head.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftHead = 
            new Line2D.Double (x, y + tailHeight,
                               x + headWidth/2.0, y);
	
        Line2D.Double rightHead =
            new Line2D.Double (x + headWidth/2.0, y,
                               x + headWidth, y + tailHeight);

	Line2D.Double baseHead =
	    new Line2D.Double (x, y + tailHeight,
			       x+ headWidth, y + tailHeight);
	
        // put the whole arrow  together
	
        GeneralPath wholeArrow = this.get();
        wholeArrow.append(Tail, false);
        wholeArrow.append(leftHead, false);
        wholeArrow.append(rightHead, false);
	wholeArrow.append(baseHead, false);
			 
    }
}
