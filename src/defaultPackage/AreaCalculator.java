package defaultPackage;

import java.util.ArrayList;

public class AreaCalculator {

	public double sum(ArrayList<Shape> shapes) {
		double totalArea = 0;
		for(Shape s: shapes) {
			totalArea += s.getArea();
		}
		
		return totalArea;
	}

}
