package seminerVererbung;

import Praktikum2.Punkt;

public class Dreieck extends GeometrischeForm {
	private Punkt b, c;
	
	public Dreieck() {
		super(new Punkt());
		b = new Punkt(1.0,0.0);
		c = new Punkt(0.0,1.0);
	}
	
	public Dreieck(Punkt a, Punkt b, Punkt c) {
		super(a);
		this.b = b; this.c = c;
	}
	
	public String toString() {
		return "Dreieck :"  + super.getStartpunkt().toString() + " ; " + this.b.toString()+ " ; " + this.c.toString();
	}
}
