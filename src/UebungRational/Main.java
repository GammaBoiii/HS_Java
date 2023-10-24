package UebungRational;

public class Main {
	public static void main(String[] args) {
		Rational r = new Rational(2,3);
		Rational r2 = new Rational(1,2);
		System.out.println(r.durch(r2));
	}
}
