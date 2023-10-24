package UebungDatum;

public class Datum {
	private int tag, monat, jahr;
	
	Datum(int tag, int monat, int jahr) {
		this.tag = tag; this.monat = monat; this.jahr = jahr;
		System.out.println("Schaltjahr " + this.istSchaltjahr(this.jahr));
		System.out.println("Tage im Monat " + anzahlTageImMonat(monat, jahr));
	}
	
	public int getTag() {return tag;}
	public int getMonat() {return monat;}
	public int getJahr() {return jahr;}
	
	public String toString() {return "Datum: " + tag+ "."+ monat +"." +jahr;}
	
	public boolean equals(Datum d) {
		return this.tag == d.getTag() && this.monat == d.getMonat() && this.jahr == d.getJahr();		
	}
	
	public boolean vor(Datum d) {
		return this.jahr < d.getJahr() || 
				((this.monat < d.monat) && (this.jahr <= d.getJahr())) || 
				((this.tag < d.getTag()) && (this.monat <= d.getMonat()) && (this.jahr <= d.getJahr()));
	}
	
	public static boolean vor(Datum d1, Datum d2) {
		return d1.getJahr() < d2.getJahr() || 
				((d1.getMonat() < d2.getMonat()) && (d1.getJahr() <= d2.getJahr())) || 
				((d1.getTag() < d2.getTag()) && (d1.getMonat() <= d2.getMonat()) && (d1.getJahr() <= d2.getJahr()));
	}
	
	public static boolean istDatumGueltig(Datum d) {
		if (d.getTag() <= 0 || d.getTag() > anzahlTageImMonat(d.getMonat(), d.getJahr())) {
			return false;
		}
		if (d.getMonat() < 0 || d.getMonat() > 12 ) return false;
		return true;
	}
	
	private static int anzahlTageImMonat(int monat, int jahr) {
		if (monat == 2) {		//schaltjahr und Februar checken
			if (istSchaltjahr(jahr)) {
				return 29;
			} else return 28;
		} else if (monat <= 7){ //Monate bis Juli haben in ungerade zaheln 31 Tage
			if (monat % 2 == 1) {
				return 31;
			} else return 30;
		} else {				//Monate ab  Juli haben in geraden zahlen 31 Tage
			if (monat % 2 == 0) {
				return 31;
			} else return 30;
		}
		
	}
	
	private static boolean istSchaltjahr(int jahr) {
		int defaultYear = 2020;//
		if (Math.abs(jahr-defaultYear) % 4 == 0) {return true;}
		else return false;
	}
	
}
