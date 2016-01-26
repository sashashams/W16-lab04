package edu.ucsb.cs56.w16.drawings.josue.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   A Pine Tree
      
   @author Josue Montenegro 
   @version for CS56, W16, UCSB
   
*/
public class PineTree  extends Arrow implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public PineTree(double x, double y, double topWidth, double height)
    {
	// construct the basic arrow shape
	super(x,y,topWidth,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	

	double topHeight = .75 * height;


	
	
	Line2D.Double treeTopLeft1 =
	    new Line2D.Double (x, y + topHeight/1.7,
			       x + topWidth/2.0, y-(topHeight/1.5));
	
	Line2D.Double treeTopRight1 =
	    new Line2D.Double (x + topWidth/2.0, y-(topHeight/1.5),
			       x + topWidth, y + topHeight/1.7);
	
	Line2D.Double baseTreeTop1 =
	    new Line2D.Double (x, y + topHeight/1.7,
			       x+ topWidth, y + topHeight/1.7);
	
	
	Line2D.Double treeTopLeft2 =
	    new Line2D.Double (x, y,
			       x + topWidth/2.0,y-topHeight*1.5) ;
	
	Line2D.Double treeTopRight2 =
	    new Line2D.Double (x + topWidth/2.0,
			       y-topHeight*1.5,
			       x + topWidth, y);
	
	Line2D.Double baseTreeTop2 =
	    new Line2D.Double (x, y,
			       x + topWidth, y);
	
			       
			       
			       
			       
			       




	// add extra layers of leaves to the tree top
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeTree = this.get();
        wholeTree.append(treeTopRight1, false);
        wholeTree.append(treeTopLeft1, false);
        wholeTree.append(baseTreeTop1, false); 
	wholeTree.append(treeTopRight2, false);
	wholeTree.append(treeTopLeft2, false);
	wholeTree.append(baseTreeTop2, false);


    }    
}
