/**
 * @author HienQD
 */
public class Hello {
	/**
	 * 
	 * @param args: tham số đầu vào
	 */
	public static void main(String[] args) {
		System.out.println("hello");
//		variable
		String count = "ad";
		int year = 2024;
		double price = 2.2;
		boolean isTrue = true;
		char code = 'M';
		/*
		 * count: string
		 * year: int
		 * price: double
		 * ...
		 */
		System.out.println("Bộ đếm"+" "+count+year+price+code+isTrue);
//		hằng số final + variable
		final int x = 10;
//		x = 100; báo lỗi
		
		System.out.println("x = " +x);
	}
}
