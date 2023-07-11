package day04.solved;

public class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		try {
			
			rec = new Rectangle (10, 5);
			System.out.println(rec.calculateArea());

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}