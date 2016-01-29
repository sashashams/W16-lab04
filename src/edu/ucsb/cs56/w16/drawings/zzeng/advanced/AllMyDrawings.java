package edu.ucsb.cs56.w16.drawings.zzeng.advanced;

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
 * @author Phill Conrad 
 * @author Ziliang Zeng (edited)
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few water bottles 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	WaterBottle wb1 = new WaterBottle(100,250,25,65,10,3,5);
	g2.setColor(Color.CYAN);     g2.draw(wb1);
	
	// Make a black water bottle that's half the size
	// and moved over 150 pixels in x direction
	Shape wb2 = ShapeTransforms.scaledCopyOfLL(wb1,0.5,0.5);
	wb2 = ShapeTransforms.translatedCopyOf(wb2,150,0);
	g2.setColor(Color.BLACK);    g2.draw(wb2);
      
	// Here's a water bottle that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	Shape wb3 = ShapeTransforms.scaledCopyOfLL(wb2,4,4);
	wb3 = ShapeTransforms.translatedCopyOf(wb3,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(wb3); 

	// Add a description and author
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Water bottles by Ziliang Zeng", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Containers.
	
	Container small = new Container(20,50,40,30);
	Container tallSkinny = new Container(20,150,20,40);
	Container shortFat = new Container(20,250,40,20);
	
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	WaterBottle wb1 = new WaterBottle(100,250,25,75,20,5,2);
	g2.setColor(Color.CYAN); g2.draw(wb1);
	
	// Make a black water bottle that's half the size, 
	// and moved over 150 pixels in x direction
	Shape wb2 = ShapeTransforms.scaledCopyOfLL(wb1,0.5,0.5);
	wb2 = ShapeTransforms.translatedCopyOf(wb2,150,0);
	g2.setColor(Color.BLACK); g2.draw(wb2);
	
	// Here's a water bottle that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	Shape wb3 = ShapeTransforms.scaledCopyOfLL(wb2,4,4);
	wb3 = ShapeTransforms.translatedCopyOf(wb3,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(wb3); 
	
	// Draw two water bottles
	
	WaterBottle wb4 = new WaterBottle(50,350,40,75,23,10,7);
	WaterBottle wb5 = new WaterBottle(200,350,50,150,40,7,4);
	
	g2.draw(wb4);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second water bottle 45 degrees around its center.
	Shape wb6 = ShapeTransforms.rotatedCopyOf(wb5, Math.PI/4.0);
	
	g2.draw(wb6);
       
	// Add description and author
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Containers and Water Bottles by Ziliang Zeng", 20,20);
    }
    

    // Draws a picture with various Containers
    
    public static void drawPicture3(Graphics2D g2) {
	
	// labels the drawing
	
	g2.drawString("A bunch of Containers by Ziliang Zeng", 20,20);	
	
	// Draw some Containers.

	Container large = new Container(175,380,60,200);
	Container small = new Container(500,380,15,90);
	Container wide = new Container(500, 125,45,70);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLACK);   g2.draw(wide);
	
    }
}
