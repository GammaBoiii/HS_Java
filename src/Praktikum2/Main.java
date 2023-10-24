package Praktikum2;

public class Main {

	public static void main(String[] args) {
		Punkt p1 = new Punkt(5.0, 8.0);
		p1.moveX(-3.0);
		p1.move(5, 2);
		Punkt p2 = new Punkt(7.0,10.0);
		System.out.println(p1);
		System.out.println(Punkt.equals(p1, p2));
		System.out.println(p1.equals(p2));

	}

}
