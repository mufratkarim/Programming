package poly;

public class Rectangle extends Shape implements IDisplayable {
	
	double m_length, m_width;
	
	public Rectangle(double length, double width) {
		
		m_length = length;
		m_width = width;
		
	}

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		
		area = m_length * m_width;
		
	}
	
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
		System.out.printf("The length is: %f\nThe width is: %f\nThe Area is: %f", m_length, m_width, area);
	}
	
	

}
