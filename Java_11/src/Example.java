import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//		declare
		int a, b;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhập a: ");
			a = sc.nextInt();
			System.out.println("Nhập b: ");
			b = sc.nextInt();
			int tong = a + b;
			System.out.println("Tổng " + a + " + " + b + " = " + tong);
			int hieu = a - b;
			System.out.println("Hiệu " + a + " - " + b + " = " + hieu);
			int nhan = a * b;
			System.out.println("Nhân " + a + " * " + b + " = " + nhan);
			float chia = (float)a / b;
			System.out.println("Chia " + a + " : " + b + " = " + chia);
			int du = a % b;
			System.out.println("Chia " + a + " % " + b + " = " + du);

		}
	}
}
