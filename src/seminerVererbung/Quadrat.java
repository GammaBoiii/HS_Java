package seminerVererbung;

import Praktikum2.Punkt;

public class Quadrat extends Rechteck {

	public Quadrat() {
		super(new Punkt(), 1.0,1.0);
	}

	public Quadrat(Punkt startpunkt, double a) {
		super(startpunkt, (double) a, (double) a);
		
	}

}
