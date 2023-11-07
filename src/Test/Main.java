package Test;

public class Main {

	public static void main(String[] args) {
		int x; double w = 8.6;
		x = -3 + 4 * 5 - 18; System.out.println(x);//1
		x = 3 + 4 % 5 - 6; System.out.println(x);//2
		x = -3 * 5 % 6 / 3; System.out.println(x);//3
		x = (7 + 6) % 5 / 2; System.out.println(x);//4
		x = (int)(7 - w); System.out.println(x);//5
		w = w / 2; System.out.println(w);//6
		w = 7 / 2; System.out.println(w);//7
		w = 7 / 2.0; System.out.println(w);//8

	}

}
