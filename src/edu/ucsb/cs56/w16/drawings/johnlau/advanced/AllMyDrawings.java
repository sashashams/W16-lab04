package edu.ucsb.cs56.w16.drawings.johnlau.advanced;

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
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pizza p1 = new Pizza(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(p1);
	

	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
		
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	    
	// Draw two pizzas with toppings
	
	PizzaWithToppings pt1 = new PizzaWithToppings(50,350,40,75); 
	PizzaWithToppings pt2 = new PizzaWithToppings(200,350,200,300);
       
	g2.draw(pt1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pt2);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few slices of Pizza by John Lau", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some pizza
	
	PizzaWithToppings large = new PizzaWithToppings(100,50,225,150);
	Pizza smallCC = new Pizza(20,50,40,30);
	Pizza tallSkinny = new Pizza(20,150,20,40);
	Pizza shortFat = new Pizza(20,250,40,70);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Pizza h1 = new Pizza(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a red pizza that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.RED); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two pizzas with toppings
	
	PizzaWithToppings pt1 = new PizzaWithToppings(50,350,100,100);
	PizzaWithToppings pt2 = new PizzaWithToppings(200,350,200,100);
	
	g2.draw(pt1);
	g2.setColor(new Color(0x8F00FE)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape pt3 = ShapeTransforms.rotatedCopyOf(pt2, Math.PI/4.0);
	
	g2.draw(pt3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Pizza slices and a few with toppings on them by John Lau", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Pizza Slices with Toppings by John Lau", 20,20);
	
	
	// Draw some pizza slices with toppings
	
	PizzaWithToppings large = new PizzaWithToppings(100,50,225,150);
	PizzaWithToppings smallP = new PizzaWithToppings(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.BLACK);   g2.draw(smallP);
	
    }       
}
