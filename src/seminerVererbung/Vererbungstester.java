package seminerVererbung;

import Praktikum2.Punkt;

public class Vererbungstester {

	public static void main(String[] args) {
		Quadrat q1 = new Quadrat(new Punkt(4.0,5.0), 3.0);
		System.out.println(q1.berechneUmfang());
		System.out.println(q1.toString());
		System.out.println(q1.getBreite());
		Dreieck d1 = new Dreieck(new Punkt(5.0,1.0), new Punkt(1.0,1.5), new Punkt(6.0,12.0));
		System.out.println(d1.toString());
		Kreis k1 = new Kreis(new Punkt(5.0,5.0), 5);
		System.out.println(k1.toString());
	}

}
