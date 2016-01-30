package edu.ucsb.cs56.w16.drawings.makhamzadeh.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
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
 * @version for CS56, lab04, W16
 */


public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */

    public static void drawPicture1(Graphics2D g2) {

	SoccerField SF1 = new SoccerField(50,50,200);
	g2.setColor(Color.GREEN); g2.draw(SF1);

	Stroke Thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig = g2.getStroke();
	
	g2.setStroke(Thick);
	g2.setColor(Color.BLACK); 
	g2.drawString("A simple Soccer Field by Matin Akhamzadeh", 20,20);
	
    }


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
       
	// 
	
	SoccerField s1 = new SoccerField(100,100,100);
	SoccerField s2 = new SoccerField(200,200,200);
	
	g2.setColor(Color.RED);     g2.draw(s1);
	g2.setColor(Color.GREEN);   g2.draw(s2);

	//rotate one of the soccer fields
	
	Shape s3 = ShapeTransforms.rotatedCopyOf(s1, Math.PI/4.0);
	s3 = ShapeTransforms.translatedCopyOf(s3,0,300);
	g2.setColor(Color.BLUE); g2.draw(s3);
		
	Shape s4 = ShapeTransforms.scaledCopyOfLL(s2,1.75,1.75);
	s4 = ShapeTransforms.translatedCopyOf(s4,250,250);
	g2.setColor(Color.YELLOW); g2.draw(s4);

	Stroke Thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig = g2.getStroke();
	
	g2.setStroke(Thick);
	g2.setColor(Color.BLACK); 
	g2.drawString("Different Soccer Fields by Matin Akhamzadeh", 20,20);
	    

  
 
	    }
    public static void drawPicture3(Graphics2D g2) {
	Field f1 = new Field(100,100, 120);
	SoccerField s1 = new SoccerField(100,100,120);
	SoccerField s2 = new SoccerField(100,100,120);
	
	g2.setColor(Color.BLUE); g2.draw(f1);
	g2.setColor(Color.GREEN); g2.draw(s1);
	g2.setColor(Color.RED); g2.draw(s2);

	Shape f2 = ShapeTransforms.rotatedCopyOf(f1,Math.PI/2.0);
	g2.setColor(Color.BLACK); g2.draw(f2);

	Shape s3 = ShapeTransforms.rotatedCopyOf(s2,Math.PI/4.0);
	g2.setColor(Color.RED); g2.draw(s3);

	Shape s4 = ShapeTransforms.rotatedCopyOf(s1,3*Math.PI/4.0);
	g2.setColor(Color.BLUE); g2.draw(s4);

	Stroke Thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke orig = g2.getStroke();
	g2.setStroke(Thick);
	g2.setColor(Color.BLACK); 
	g2.drawString("Intersecting Fields by Matin Akhamzadeh", 20,20);
       
    }
    

}
