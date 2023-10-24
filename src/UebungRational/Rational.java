package UebungRational;

public class Rational {
	private	int zaehler, nenner;
	
	Rational() {zaehler = 1; nenner = 1;}
	Rational(int z, int n) {
		this.zaehler = z;
		this.nenner	 = n;		
	}
	
	public int getZaehler() {return zaehler;}
	public int getNenner()  {return nenner;}
	
	public String toString() {return zaehler + "/" + nenner;}
	
	public boolean equals(Rational r) {
		return this.zaehler == r.getZaehler() && this.nenner == r.getNenner();
	}
	
	public double doubleValue() {return (double) (zaehler/nenner);}
	
	public Rational plus(Rational r) {
		//gemeinsamen Nenner finden:
		int newNenner = this.nenner * r.getNenner();
		int newZaehler = this.zaehler * r.getNenner() + r.getZaehler() * this.nenner;
		return new Rational(newZaehler, newNenner);
	}
	public Rational minus(Rational r) {
		int newNenner = this.nenner * r.getNenner();
		int newZaehler = this.zaehler * r.getNenner() - r.getZaehler() * this.nenner;
		return new Rational(newZaehler, newNenner);
	}
	
	public Rational mal(Rational r) {
		return new Rational(this.zaehler * r.zaehler, this.nenner * r.nenner);
	}
	public Rational durch(Rational r) {
		return new Rational(this.zaehler * r.nenner, this.nenner * r.zaehler);
	}
	
}
