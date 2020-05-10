package poly;

public class Circle extends Shape implements IDisplayable {
	
	
	double m_radius;
	
	public Circle(double radius) {
		
		m_radius = radius;
		
	}
	

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		area = 3.14 * m_radius * m_radius;
		
	}


	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
		System.out.printf("The radius is: %f\nThe Area is: %f", m_radius, area);
	}
	
	

}
