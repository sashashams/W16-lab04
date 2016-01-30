package edu.ucsb.cs56.w16.drawings.josue.advanced;

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
 * @author Josue
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few arrows 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Arrow arr1 = new Arrow(150,150,50,75);
	g2.setColor(Color.MAGENTA); g2.draw(arr1);
	
	// Make a black arrow that's half the size, 
	// and moved over 250 pixels in x direction
	
	Shape arr2 = ShapeTransforms.scaledCopyOfLL(arr1,0.5,0.5);
	arr2 = ShapeTransforms.translatedCopyOf(arr2,250,0);
	g2.setColor(Color.BLACK); g2.draw(arr2);
	
	// Here's an arrow that's 4x as big (2x the original)
	// and moved over 150 more pixels to right and is green.
	arr2 = ShapeTransforms.scaledCopyOfLL(arr2,4,4);
	arr2 = ShapeTransforms.translatedCopyOf(arr2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(arr2); 
	
	
	// Draw three Pine Trees
	
	PineTree pn1 = new PineTree(50,150,40,75);
	PineTree pn2 = new PineTree(200,150,200,75);
	PineTree pn3 = new PineTree(420,150,130,75);	
	g2.draw(pn1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pn2);
	g2.setColor(Color.GREEN); g2.draw(pn3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A forrest of pine trees and arrows by Josue Montenegro", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some arrows
	
	Arrow medium = new Arrow(250,50,150,100);
	Arrow smallCC = new Arrow(100,60,40,30);
	Arrow tallSkinny = new Arrow(200,120,20,40);
	Arrow shortFat = new Arrow(20,179,40,20);
	
	g2.setColor(Color.RED);     g2.draw(medium);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.YELLOW);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	PineTree pn1 = new PineTree(100,350,50,75);
	g2.setColor(Color.BLUE);
	Shape dead1 = ShapeTransforms.rotatedCopyOf(pn1, Math.PI/2.5);
	g2.draw(dead1);
	
	// Make a black tree that's 0.7 the size, 
	// and moved over 150 pixels in x direction
	Shape pn2 = ShapeTransforms.scaledCopyOfLL(pn1,0.5,0.5);
	pn2 = ShapeTransforms.translatedCopyOf(pn2,150,0);
	g2.setColor(Color.BLACK);
	Shape dead2 = ShapeTransforms.rotatedCopyOf(pn2, Math.PI*2);
	g2.draw(dead2);
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	pn2 = ShapeTransforms.scaledCopyOfLL(pn2,4,4);
	pn2 = ShapeTransforms.translatedCopyOf(pn2,130,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(pn2); 
	
	// Draw two trees collapsing
	
	PineTree pn3 = new PineTree(50,350,40,75);
	PineTree pn4 = new PineTree(200,350,200,100);
	
	Shape dead3 = ShapeTransforms.rotatedCopyOf(pn3, Math.PI*2.5);
	g2.draw(dead3);
	g2.setColor(Color.GREEN); 
	
	// Rotate the second tree 45 degrees around its center.
	Shape dead4 = ShapeTransforms.rotatedCopyOf(pn4, Math.PI/4.0);
	
	g2.draw(dead4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("'The Trees die and their souls ascend' by Josue Montenegro", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("'The Tree of Life'- Josue Montenegro", 20,20);


	PineTree pn2= new PineTree(200,150,200,80);
	PineTree pn3 = new PineTree(135,240,330,70);
	
	
	
	g2.setColor(Color.RED);   g2.draw(pn2);
	g2.setColor(Color.CYAN);  g2.draw(pn3);
	
	PineTree pn4 = new PineTree(240,215,120,160);
	
	Stroke medium = new BasicStroke (2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(medium);
	g2.setColor(Color.YELLOW);     g2.draw(pn4);
	


	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	g2.setStroke(thick);
	
	// Draw the tree of life.
	PineTree pn1 = new PineTree(200,200,200,170);
	g2.setColor(Color.GREEN);     g2.draw(pn1);

	
    }       
}
