package breakConRe;

public class Example {
	public static void main(String[] args) {
//		break unlabel outer
//		int i, j;
//		for (i = 0; i < 10; i++) {
//			System.out.println("Out" + i);
//			for (j = 1; j < 10; j++) {
//				System.out.println("Out2/" + j);
//				if (j > 5)
//					break;
//			}
//			System.out.println("In" + j + "Out" + i);
//		}
//		System.out.println("Out" + i);
//		Break label outer
//		int i, j;
//		outer: for (i = 0; i < 10; i++) {
//			System.out.println("Out" + i);
//			for (j = 1; j < 10; j++) {
//				System.out.println("Out2/" + j);
//				if (j > 5)
//					break outer;
//			}
//			System.out.println("In" + j + "Out" + i);
//		}
//		System.out.println("OutB" + i);

//		continue
//		unlabel
//		int i, j;
//		for (i = 0; i < 10; i++) {
//			System.out.println("Out" + i);
//			for (j = 1; j < 10; j++) {
//				System.out.println("Out2/" + j);
//				if (j < 5)
//					continue;
//				System.out.println("In" + j);
//			}
//			System.out.println("In" + j + "Out" + i);
//		}
//		label
		int i, j;
		outer:for (i = 0; i < 10; i++) {
			System.out.println("Out" + i);
			for (j = 1; j < 10; j++) {
				System.out.println("Out2/" + j);
				if (j > 5)
					continue outer;
				System.out.println("In" + j);
			}
			System.out.println("In" + j + "Out" + i);
		}
		System.out.println("Stop");

	}
}
