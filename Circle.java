
public class Circle extends Shapes{
	private double radius;
	
	public Circle(){
		radius = 0;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calcArea() {
		double area = radius * radius * 3.14;
		return area;
	}
	
}
