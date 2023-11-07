package Praktikum2;
/**
 *  Objekte der Klasse Punkt repraesentieren Punkte der zweidimensionalen Ebene.
 *
 */
public class Punkt
{
    /**
     *  die x-Koordinate des Punktes
     */
    private double x;

    /**
     *  die y-Koordinate des Punktes
     */
    private double y;


    /**
     *  Konstruktor f�r einen Punkt mit gegebenen Koordinatenwerten
     *
     *@param  xWert  Wert der x-Koordinate
     *@param  yWert  Wert der y-Koordinate
     */
    public Punkt(double xWert, double yWert)
    {
        x = xWert;
        y = yWert;
    }


    /**
     *  parameterloser Konstruktor f�r den Punkt im Koordinatenursprung
     */
    public Punkt()
    {
        x = 0;
        y = 0;
    }


    /**
     *  Holen der x-Koordinate
     *
     *@return    der Wert der x-Koordinate
     */
    public double getx()
    {
        return x;
    }


    /**
     *  Holen der y-Koordinate
     *
     *@return    der Wert der y-Koordinate
     */
    public double gety()
    {
        return y;
    }


    /**
     *  Zeichenkettendarstellung des Punkts
     *
     *@return    Zeichenkettendarstellung des Punkts
     */
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }


    /**
     *  Verschieben eines Punktes
     *
     *@param  dx  Differenz der x-Koordinate
     *@param  dy  Differenz der y-Koordinate
     */
    public void verschieben(double dx, double dy)
    {
        x = x + dx;
        y = y + dy;
    }


    /**
     *  Versetzen eines Punktes
     *
     *@param  xNeu  neue x-Koordinate
     *@param  yNeu  neue y-Koordinate
     */
    public void versetzen(double xNeu, double yNeu)
    {
        x = xNeu;
        y = yNeu;
    }


    /**
     *  Gleichheit zweier Punkte
     *
     *@param  p  der zu vergleichende Punkt
     *@return    true, falls der Punkt die gleichen Koordinaten hat
     */
    public boolean equals(Punkt p)
    {
        return (x == p.x) && (y == p.y);
    }

}



//package Praktikum2;
//
//public class Punkt {
//	double x, y;
//	
//	public Punkt() {
//		x = 0.0;
//		y = 0.0;				
//	}
//	public Punkt(double x, double y) {
//		this.x = x; this.y = y;
//	}
//	public double getX() {return x;}
//	public double getY() {return y;}
//	
//	public void setX(double x) {this.x = x;}
//	public void setY(double y) {this.y = y;}
//	public void setC(double x, double y) {this.x = x; this.y = y;}
//	
//	public void moveX(double x) {this.x += x;}
//	public void moveY(double y) {this.y += y;}
//	public void move(double x, double y) {this.x += x; this.y += y;}
//	
//	@Override
//	public String toString() {
//		return "Die Koordinaten lauten x:" + this.x +" y:" + this.y;
//	}	
//	
//	public boolean equals(Punkt p) {
//		return this.getX() == p.getX() && this.getY() == p.getY();
//	}
//	public static boolean equals(Punkt p1, Punkt p2) {
//		return p1.getX() == p2.getX() && p1.getY() == p2.getY();
//	}	
//}