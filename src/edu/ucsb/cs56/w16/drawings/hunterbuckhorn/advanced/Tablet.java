package edu.ucsb.cs56.w16.drawings.hunterbuckhorn.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.w16.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w16.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Tablet that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Hunter Buckhorn
   @version for CS56, W16, UCSB
   
*/
public class Tablet extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of Tablet
       @param y y coord of lower left corner of Tablet
       @param width width of the Tablet
       @param height of Tablet
    */
    public Tablet(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.


	Rectangle2D.Double tabletBody = new Rectangle2D.Double(x, y, width, height);

	double lineYtop =  y + height/15;
	double lineYbottom = y + height - height/15;
	Line2D.Double topLine = new Line2D.Double (x, lineYtop, x + width, lineYtop);

	Line2D.Double bottomLine = new Line2D.Double(x, lineYbottom, x + width, lineYbottom);


	double buttonX = x + width/2 - width/40;
	double buttonWidth = 2 * width/40;

	double buttonY = lineYbottom + height/80;

	Rectangle2D.Double button = new Rectangle2D.Double(buttonX, buttonY, buttonWidth, buttonWidth);

	/*        
	
	// make the lines at the top and bottom of the Tablet

        Line2D.Double leftRoof =
            new Line2D.Double (x, y + roofHeight,
                               x + width/2.0, y);


	// Add a button on the bottom of the screen
	//	Rectangle2D.Double button = new Rectangle2D.Double(x + width/2 - width/15, y + height - height/13,
	//						 x + width/2 + width/15, y + height - height/15);

	*/
        // put the whole tablet together
	
        GeneralPath wholeTablet = this.get();
        wholeTablet.append(tabletBody, false);
        wholeTablet.append(topLine, false);
        wholeTablet.append(bottomLine, false);
	wholeTablet.append(button, false);
    
    }
}
