/**
 * @author Johann L
 */



public class EinfacheREchnungen {
	public static void main(String[] args) {
//		Schreibt ein Programm, dass die untenstehenden Rechenaufgaben (Lösungen stehen bei) jeweils in 
//		einer passenden Variablen speichert und diese dann auf der Kommandozeile ausgibt.
//		Rechenaufgaben
	
		Method2();

	}
	static void Method1() {
		int a = 1 + 7 - 9 + 43;
		int b = 12 % 2;
		int c = 43 - 9 + 7 + 1;
		int d = 13 % 5;
		int e = 4 * 3 + 1;
		int f =	12345 / 10;
		int g = 9 * (2 + 1);
		int h = 1234 / 10;
		int i = 4 * 3 / 6;
		int j = 123 / 10;
		int k = (3 - 7) * (7 + 4) ;
		int l = 12 / 10 ;
		int m = 3 / 4;
		int n = 1 / 10;
		double o = 3.0 / 4.0 ;
		int p = 12345 % 10;
		int q = 4 / 3 + 1 * 7;
		int r = 1234 % 10;
		double s = 4.0 / 3.0 + 1 * 7;
		int t = 123 % 10;
		int u = 2 * 2 * 2 * 2 * 2 * 2 * 2;
		int v = 12 % 10;
		int w = 42 / 7 / 3;
		int x = 1 % 10;
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// System.out.println(d);
		// System.out.println(e);
		// System.out.println(f);
		// System.out.println(g);
		// System.out.println(h);
		// System.out.println(i);
		// System.out.println(j);
		// System.out.println(k);
		// System.out.println(l);
		// System.out.println(m);
		// System.out.println(n);
		// System.out.println(o);
		// System.out.println(p);
		// System.out.println(q);
		// System.out.println(r);
		// System.out.println(s);
		// System.out.println(t);
		// System.out.println(u);
		// System.out.println(v);
		// System.out.println(w);
		// System.out.println(x);
	    System.out.println("1 + 7 - 9 + 43 = " + a);
	    System.out.println("12 % 2 = " + b);
	    System.out.println("43 - 9 + 7 + 1 = " + c);
	    System.out.println("13 % 5 = " + d);
	    System.out.println("4 * 3 + 1 = " + e);
	    System.out.println("12345 / 10 = " + f);
	    System.out.println("9 * (2 + 1) = " + g);
	    System.out.println("1234 / 10 = " + h);
	    System.out.println("4 * 3 / 6 = " + i);
	    System.out.println("123 / 10 = " + j);
	    System.out.println("(3 - 7) * (7 + 4) = " + k);
	    System.out.println("12 / 10 = " + l);
	    System.out.println("3 / 4 = " + m);
	    System.out.println("1 / 10 = " + n);
	    System.out.println("3.0 / 4.0 = " + o);
	    System.out.println("12345 % 10 = " + p);
	    System.out.println("4 / 3 + 1 * 7 = " + q);
	    System.out.println("1234 % 10 = " + r);
	    System.out.println("4.0 / 3.0 + 1 * 7 = " + s);
	    System.out.println("123 % 10 = " + t);
	    System.out.println("2 * 2 * 2 * 2 * 2 * 2 * 2 = " + u);
	    System.out.println("12 % 10 = " + v);
	    System.out.println("42 / 7 / 3 = " + w);
	    System.out.println("1 % 10 = " + x);
	}
	static void Method2() {
		int[] ints = {1 + 7 - 9 + 43,43 - 9 + 7 + 1 , 9 * (2+1), 4 * 3 + 1, 4 * 3 / 6, (3 - 7) * (7 + 4), 3 / 4, 4 / 3 + 1 * 7, 2 * 2 * 2 * 2 * 2 * 2 * 2, 42 / 7 / 3, 12 % 2, 13 % 5, 12345 / 10, 1234 / 10, 123 / 10, 12 / 10, 1 / 10, 12345 % 10, 1234 % 10, 123 % 10, 12 % 10, 1 % 10};
		String[] sInts = {"1 + 7 - 9 + 43", "43 - 9 + 7 + 1", "9 * (2+1)", "4 * 3 + 1", "4 * 3 / 6", "(3 - 7) * (7 + 4)", "3 / 4", "4 / 3 + 1 * 7", "2 * 2 * 2 * 2 * 2 * 2 * 2", "42 / 7 / 3", "12 % 2", "13 % 5", "12345 / 10", "1234 / 10", "123 / 10", "12 / 10", "1 / 10", "12345 % 10", "1234 % 10", "123 % 10", "12 % 10", "1 % 10"};

		double[] doubles = {3.0 / 4.0, 4.0 / 3.0 + 1 * 7};
		String[] sDoubles = {"3.0 / 4.0", "4.0 / 3.0 + 1 * 7"};
		
		System.out.println("\nInteger:");
		//integer
		for (int i = 0; i<ints.length; i++) {
			System.out.println(sInts[i] + " = " + ints[i]);
		}
		System.out.println("\nDoubles:");
		//double
		for (int i = 0; i<sDoubles.length; i++) {
			System.out.println(sDoubles[i] + " = " + doubles[i]);
		}
		
	}
}
