package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		
		
		StdDraw.setPenColor(131, 195, 235);
		StdDraw.filledRectangle(.5, .5, .4, 0.3);
		
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .4, .3);
		
		StdDraw.setPenColor(Color.WHITE);
		double[] x = { 0.25, 0.25, 0.4};
		double[] y = { 0.6, 0.4, 0.5};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.filledEllipse(.55, .5, .2, 0.1);	
		
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.65, .5, .01);
	}
}