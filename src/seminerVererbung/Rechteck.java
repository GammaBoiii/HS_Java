package seminerVererbung;

import Praktikum2.Punkt;

public class Rechteck extends GeometrischeForm {

	private double breite, hoehe;
	
	public Rechteck() {
		this.breite = 2.0; this.hoehe = 1.0;
	}
	
	public Rechteck(Punkt s, double hoehe, double breite) {
		super(s); this.hoehe = hoehe; this.breite = breite;
	}

	public Rechteck(double xS, double yS, double hoehe, double breite) {
		super(new Punkt(xS, yS));
		this.hoehe = hoehe; this.breite = breite;		
	}

	public double getBreite() {
		return breite;
	}

	public double getHoehe() {
		return hoehe;
	}
	
	public double berechneFlaeche() {
		return this.breite * this.hoehe;
	}
	
	public double berechneUmfang() {
		return this.breite * 2 + this.hoehe * 2;
	}
	
	public String toString() {
		return "Der Umfang ist: " + berechneUmfang() + "\nDie Fläche ist: " + berechneFlaeche();
	}
	
	public boolean equals(Rechteck r) {
		if (r.getBreite() == this.getBreite() && r.getHoehe() == this.getHoehe()) {
			return true;
		}
		return false;
	}
	
	
	
	

}
