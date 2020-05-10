package lab_YearlySales;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YearlySales ys = new YearlySales();
		
		ys.set(1, 200);
		ys.set(2, 500);
		ys.set(3, 200);
		ys.set(3, 500);
		ys.set(4, 200);
		ys.set(5, 500);
		ys.set(6, 200);
		ys.set(7, 500);
		ys.set(8, 200);
		ys.set(9, 500);
		ys.set(10, 200);
		ys.set(11, 500);
		ys.set(12, 200);
		
		double avg;
		avg = ys.average();
		System.out.printf("The average is %f\n", avg);
		
	}

}
