package Code;

import java.util.Arrays;

public class Example {
	public static int[] reverse (int [] x) {
		int [] rs = new int[x.length];
		int index = 0;
		for(int i = x.length -1; i>=0;i--) {
			rs[index] = x[i];
			index ++;
		}
		return rs;
	}
	public static void main(String[] args) {
		int[] mang = { 1, 2, 34, 5 };
		int[] mang2 = new int[12];
		System.out.println("Trc" + Arrays.toString(mang));
		Arrays.sort(mang);
		System.out.println("Sau" + Arrays.toString(mang));
		System.out.println(Arrays.binarySearch(mang, 5));
		Arrays.fill(mang2, 5);
		System.out.println("Mang2" + Arrays.toString(mang2));
//		Ham sx giam dan
		Arrays.sort(mang);
		int[] a = Example.reverse(mang);
		System.out.println(Arrays.toString(a));
	}
}
