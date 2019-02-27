package pkgShape;

public class Rectangle extends Shape  {

	private int Length;
	private int Width;
	
	
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(int length, int width) {
		this();
		Length = length;
		Width = width;
	}
	
	
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	
	public static double area(int Length, int Width)
	{
		return (double)Length * Width;
	}
	
	public double area()
	{
		return (double)this.Length * this.Width;
	}
}
