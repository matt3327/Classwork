
public class Triangle extends Shapes{
	
	private double height;
	private double base;
	
	public Triangle() {
		height = 0;
		base = 0;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public double calcArea() {
		double area = (base * height) / 2;
		return area;
	}
}
