
public class Square extends Shapes {
	
	private double side;
	
	public Square() {
		side = 0;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public double calcArea() {
		double area = side * side;
		return area;
	}
}
