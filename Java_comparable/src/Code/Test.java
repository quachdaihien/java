package Code;

public class Test {
	public static void main(String[] args) {
		SinhVien sinhvienA = new SinhVien(30, "A", "12D", 7.5);
		SinhVien sinhvienB = new SinhVien(10, "B", "12D", 8.5);
		System.out.println(sinhvienA.compareTo(sinhvienB));
	}
}
