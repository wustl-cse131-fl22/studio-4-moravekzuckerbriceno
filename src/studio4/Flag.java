package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, .3, .2);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.ellipse(0.5, 0.5, 0.15, 0.15);
		StdDraw.line(0.5, 0.5, 0.5, 0.65);
		StdDraw.line(0.5, 0.5, .6, 0.4);
		StdDraw.line(0.5, 0.5, 0.4, 0.4);
		
	}
}