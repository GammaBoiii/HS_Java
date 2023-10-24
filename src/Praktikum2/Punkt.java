package Praktikum2;

public class Punkt {
	double x, y;
	
	Punkt() {
		x = 0.0;
		y = 0.0;				
	}
	public Punkt(double x, double y) {
		this.x = x; this.y = y;
	}
	public double getX() {return x;}
	public double getY() {return y;}
	
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
	public void setC(double x, double y) {this.x = x; this.y = y;}
	
	public void moveX(double x) {this.x += x;}
	public void moveY(double y) {this.y += y;}
	public void move(double x, double y) {this.x += x; this.y += y;}
	
	@Override
	public String toString() {
		return "Die Koordinaten lauten x:" + this.x +" y:" + this.y;
	}	
	
	public boolean equals(Punkt p) {
		return this.getX() == p.getX() && this.getY() == p.getY();
	}
	public static boolean equals(Punkt p1, Punkt p2) {
		return p1.getX() == p2.getX() && p1.getY() == p2.getY();
	}	
}