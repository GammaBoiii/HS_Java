
public class Kontrollstrukturen {

	public static void main(String[] args) {
		int z1 = -1, z2 = 9, z3 = 6, z4 = 0, z5 = 0, betrag = 0, max = 0;
		// 1.
		if (z1 < 0) {
			z1 = 0;
		}

		// 2.
		if (z2 >= 0) {
			z2 *= 1.1;
			System.out.println("Der Wert von z2 ist: " + z2);
		}

		// 3.
		if (z3 % 2 == 0) {
			z3 /= 2;
		} else {
			z3 *= 2;
		}
		System.out.println(z3);

		// 4.
		z3 = 100;
		int counter = 0;
		while (counter < z3) {
			counter += 2;
		}
		if (counter == z3) {
			System.out.println("Gerade");
		} else {
			System.out.println("Ungerade");
		}

		// 5.

		z1 = 10;
		z2 = 7;
		
		if (z1 >= z2) {
			System.out.println(z2 + "\n" + z1);
		} else {
			System.out.println(z1 + "\n" + z2);
		}
		
		// 6.
		
		z1 = -19;
		if (z1 > 0) {
			z1--;
		} else if (z1 < 0) {
			z1++;
		}
		System.out.println(z1);
		
		// 7. 
		z2 = 5;
		if (z2 != 0) {
			z2--;
		}
		System.out.println(z2);
		
		// 8.
		z1 = 4; z2 = 7 ; z3  = 9;
		int max1 = z1 < z2 ? z2 : z1;
		max = z3 < max1 ? max1 : z3;
		System.out.println("Max: " + max);
		
		// 9.
		z1 = 6;z2 = 7;z3 = 3;z4 = 1; z5  = 4;
		int m1 = z1 > z2 ? z1 : z2;
		int m2 = m1 > z3 ? m1 : z3;
		int m3 = m2 > z4 ? m2 : z4;
		int m4 = m3 > z5 ? m3 : z5;
		System.out.println("Max2: " + m4);
		
		// 10.
		
		betrag = 1302;
		if (betrag > 100 && betrag <= 500) {
			betrag *= 0.97;
		} else if (betrag > 500 && betrag <= 1000) {
			betrag *=0.95;
		} else if(betrag > 1000) {
			betrag *= 0.94;
		}
		System.out.println("Neuer Betrag: " + betrag);
		
		
		// sysout
		// System.out.println("z1: " + z1 +"\n" + "z2: " + z2 +"\n" + "z3: " + z3 +"\n"
		// +"z4: " + z4 +"\n" + "z5: " + z5 +"\n" + "betrag: " + betrag +"\n" + "max: "
		// + max +"\n");
	}

}
