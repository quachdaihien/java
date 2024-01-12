package Code;

import java.util.Arrays;

public class Example2 {
 public static void main(String[] args) {
	SinhVien sv1 = new SinhVien(100, "han", "12F", 9);
	SinhVien sv2 = new SinhVien(80, "binh", "12E", 6);
	SinhVien sv3 = new SinhVien(200, "an", "12D", 10);
	SinhVien [] sv = new SinhVien[] {sv1,sv2,sv3};
	System.out.println("Truoc: "+ Arrays.toString(sv));
	Arrays.sort(sv);
	System.out.println("Sau: "+ Arrays.toString(sv));
	System.out.println(Arrays.binarySearch(sv, sv2));
}
}
