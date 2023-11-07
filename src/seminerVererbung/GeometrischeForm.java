package seminerVererbung;

import Praktikum2.Punkt; //Punkt, lol	

public class GeometrischeForm {
	private Punkt startpunkt;
	
	public GeometrischeForm() {this.startpunkt = new Punkt();}
	
	public GeometrischeForm(Punkt startpunkt) {this.startpunkt = startpunkt;}
	
	public void versetzen(int xNeu, int yNeu) {startpunkt.versetzen(xNeu, yNeu);}
	public void verschieben(int xNeu, int yNeu) {startpunkt.verschieben(xNeu, yNeu);}
	
	public Punkt getStartpunkt() {return startpunkt;}
	
//	public String toString() {
//		return startpunkt.getx() + " ; " + startpunkt.gety();
//	}
	
	
}
