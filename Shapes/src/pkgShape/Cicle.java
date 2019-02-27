package pkgShape;

public class Cicle extends Shape {

	private int Radius;

	public Cicle() {
		super();
	}

	public Cicle(int radius) {
		super();
		Radius = radius;
	}

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}
	
	public double area()
	{
		return Math.PI * this.Radius * this.Radius;
		
	}
}
