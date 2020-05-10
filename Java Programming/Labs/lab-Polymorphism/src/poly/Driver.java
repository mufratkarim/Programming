package poly;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] s = new Shape[4];
		
		
		s[0] = new Circle(5);
		s[1] = new Rectangle(25,10);
		s[2] = new Circle(15);
		s[3] = new Rectangle(12,2);
		
		for (int i = 0; i < s.length; i++) {
			
			s[i].CalculateArea();
			
		}
		
		IDisplayable[] main_data = new IDisplayable[4];
		
		main_data[0] = new Circle(5);
		main_data[1] = new Rectangle(25,10);
		main_data[2] = new Circle(15);
		main_data[3] = new Rectangle(12,2);
		
		for (int i = 0; i< main_data.length; i++) {
			
			((Shape)main_data[i]).CalculateArea();
			
		}

		
		ShowAllData(main_data);
		
		
		

	}
	
	public static void ShowAllData(IDisplayable[] data) {
		
		for (int i = 0; i< data.length; i++) {
			
			data[i].Display();
			
		}
		
		
		
	}

}
