package seminerVererbung;

import Praktikum2.Punkt;

public class Kreis extends GeometrischeForm {
	private int radius;
	
	public Kreis(Punkt mp, int radius) {
		super(mp); this.radius = radius;
	}
	
	public String toString() {
		return "Der Kreis mit dem Radius " + radius + "LE, hat einen Umfang von " + (double) (2*Math.PI*radius);
	}

}
