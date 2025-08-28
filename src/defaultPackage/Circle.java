package defaultPackage;

public class Circle implements Shape{
	private double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		this.radius = 0;
		
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
//	Methods
	
	@Override
	public double getArea() {
		double areaCircle = Math.PI*(radius*radius);
		
		return areaCircle;
	}
	

}
