
public class Schleifen {

	public static void main(String[] args) {
		
		/*
		// 1. Die Schleife:
		int a = 7;
		while (a > 0) {
		System.out.print(a + " ");
		a /= 2;//a = a/2;
		}
		System.out.println();
		// 2. Schleife
		int b = 7;
		do {
		b /= 2;
		System.out.print(b + " ");
		} while (b > 0);
		System.out.println();
		// 3. Schleife:
		for (int c = -3; c < 5; c += 2) {
		System.out.print(2 * c + 4 + " ");
		}
		System.out.println();
		// 4. Schleife:
		for (int d = 3; 2 * d > -3; d--) {
		System.out.print(d + " ");
		}
		System.out.println();
		// 5. Schleife:
		int e = 3;
		for (int i1 = 1; i1 <= e; i1++) {
		for (int i2 = 1; i2 <= 2 * e; i2++) {
		System.out.print("*");
		}
		System.out.println();
		}
		// 6. Schleife:
		int f = 5;
		for (int i1 = 1; i1 <= f; i1++) {
		for (int i2 = 1; i2 <= i1; i2++) {
		System.out.print("++");
		}
		System.out.println();
		}
		*/
		
		// 1
		for(int i = 1; i <= 10; i++) {
			//System.out.print(i + " ");
		}
		System.out.println();
		// 2
		for(int i = 10; i <= 40; i++) {
			if(i % 3 == 0) {
				//System.out.println(i);
			}
		}
		
		// 3
		//a
		for(int i = -5; i<=19; i+=3) {
			//System.out.print(i + " ");
		}
		
		//b
		for(int i = 1; i<=4096; i*=2) {
			//System.out.print(i + " ");
		}
		
		//c
		int j = -1;
		for(int i = 3; i<=4098; i+=Math.pow(2, j)) {
			//System.out.print(i + " ");
			j++;
			
		}
		
		//d
		j =-1;
		for(int i = 1; i<=92; i+=j+1) {
			System.out.print(i + " ");
			j++;
			
		}
		
		

	}

}
