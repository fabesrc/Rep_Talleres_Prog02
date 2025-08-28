package defaultPackage;

public class Triangle implements Shape{

	private double base; 
	private double height;
	

	public Triangle(double base, double heigth) {
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		this.base = 0;
		this.height =0;
	}
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
//	Methods
	
	@Override
	public double getArea() {
		double areaTriangle = (base*height)/2;
		
		return areaTriangle;
	}

}
