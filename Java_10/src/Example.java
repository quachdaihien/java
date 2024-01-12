
public class Example {
	public static void main(String[] args) {
//		ép kiểu
		int a = 20;
		float b = a;
		System.out.println("b: "+b);
		float c = 20.5f;
		int d = (int)c;
		System.out.println("d " +d);
		@SuppressWarnings("removal")
		int x = new Integer(30);
		System.out.println("x :"+x);
	}
}
