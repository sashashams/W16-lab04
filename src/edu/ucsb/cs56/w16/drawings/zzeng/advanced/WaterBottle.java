package edu.ucsb.cs56.w16.drawings.zzeng.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
   A Water Bottle
      
   @author Ziliang Zeng
   @version for CS56, W16, UCSB
*/

public class WaterBottle extends Container implements Shape
{
    /**
       Constructor for objects of class WaterBottle
       
       @param x x coordinate of the center of the base of the Water Bottle
       @param y y coordinate of the center of the base of the Water Bottle
       @param r radius of the base of the Water Bottle
       @param h height of the body of the Water Bottle
       @param coneh height of the cone on top of cyclinder
       @param caph height of the cap of the Water Bottle
       @param capr radius of the cap of the Water Bottle
    */
    public WaterBottle(double x, double y, double r, double h,double coneh,double caph,double capr) {

	// create the body of the Water Bottle without the cone top and cap
	super(x,y,r,h);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Line2D.Double leftCone = new Line2D.Double (x-r,y-h,x-capr,y-h-coneh);
	Line2D.Double rightCone = new Line2D.Double (x+r,y-h,x+capr,y-h-coneh);
	Circle botCap = new Circle(x,y-h-coneh,capr);
	Circle topCap = new Circle(x,y-h-coneh-caph,capr);
	Line2D.Double leftCap = new Line2D.Double (x-capr,y-h-coneh,x-capr,y-h-coneh-caph);
	Line2D.Double rightCap = new Line2D.Double (x+capr,y-h-coneh,x+capr,y-h-coneh-caph);
      
	// add the top to the Water Bottle
	
        GeneralPath wholeBottle = this.get();
        wholeBottle.append(leftCone, false);
        wholeBottle.append(rightCone, false);
        wholeBottle.append(botCap, false); 
	wholeBottle.append(topCap, false);
	wholeBottle.append(leftCap, false);
	wholeBottle.append(rightCap, false);
    }
}
