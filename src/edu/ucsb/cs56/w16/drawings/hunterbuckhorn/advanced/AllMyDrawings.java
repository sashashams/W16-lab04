package edu.ucsb.cs56.w16.drawings.hunterbuckhorn.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.w16.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w16.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Hunter Buckhorn
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {

	// Window is 640 by 480?

	// draw windows surface

        TabletSurface x1 = new TabletSurface(100,50,150,175);
        g2.setColor(Color.GREEN);
        g2.draw(x1);



        // Make a black tablet that's the same size,
	// and moved over 100 pixels in the x and y directions.
        Shape x2 = ShapeTransforms.translatedCopyOf(x1, 200, 100);
        g2.setColor(Color.BLACK);
        g2.draw(x2);


	// Here's a tablet that's 5x as big (2x the original)
	// and moved over 200 more pixels to right.
	Shape t3 = ShapeTransforms.scaledCopyOfLL(x2,5,5);
	t3 = ShapeTransforms.translatedCopyOf(x2,100,0);
	
        // Here's a tablet that's 3x taller and 2x as wide as x2                                                    
        // and moved over 200 more pixels to right, and 100 pixels down

	Shape x3 = ShapeTransforms.scaledCopyOfLL(x2, 3, 2);
        x3 = ShapeTransforms.translatedCopyOf(x2,100,-150);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(t3); 
	g2.draw(x3);
	

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Tablets by Hunter Buckhorn", 20,20);



    }
    
    
    // Draw a Tablet and a Tablet Surface next to each other

    public static void drawPicture2(Graphics2D g2) {

	Tablet left = new Tablet(100, 100, 200, 200);
	TabletSurface right = new TabletSurface(350, 100, 200, 200);	
	g2.setColor(Color.BLACK);

        Stroke orig=g2.getStroke();
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	g2.setStroke(thick);
	g2.draw(left);
	g2.draw(right);



	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Tablet next to TabletSurface by Hunter Buckhorn", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A grid of Windows Tablets by Hunter Buckhorn", 20,20);
	

	for (int j = 30; j < 500; j+= 50) {
	
	    for (int i = 20; i < 450; i+= 50) {
		g2.draw(new TabletSurface(j, i, 40, 40));
		
	    }
	}
	//	TabletSurface large = new TabletSurface(100,50,225,250);
//	TabletSurface smallCC = new TabletSurface(20,50,40,30);
	
//	g2.setColor(Color.RED);     g2.draw(large);
//	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
