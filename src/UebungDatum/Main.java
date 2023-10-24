package UebungDatum;

public class Main {

	public static void main(String[] args) {
		Datum d1 = new Datum(0,12,2005);
		Datum d2 = new Datum(25,2,2021);
		//System.out.println(d1.vor(d2));
		System.out.println(Datum.vor(d1, d2));
		System.out.println(Datum.istDatumGueltig(d1));
		
	}

}
