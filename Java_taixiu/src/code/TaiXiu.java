package code;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		int optPlay, taiKhoan;
		optPlay = 1;
		taiKhoan = 50000000;
		Locale lc = new Locale("vi","VN");
//		NumberFormat nb = NumberFormat.getInstance(lc);
		NumberFormat nb = NumberFormat.getCurrencyInstance(lc);
		System.out.println("************");
		System.out.println("User: User1");
		System.out.println("Tài khoản: " + nb.format(taiKhoan));
		System.out.println("************");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("----- Mời bạn nhập -----");
			System.out.println("***** Nhập 1 để tiếp tục || Nhập phím bất kỳ để dừng ****");
			optPlay = sc.nextInt();
			if (optPlay == 1) {
				System.out.println("***** Bắt đầu chơi ****");
				System.out.println("Vui lòng đặt cược");
				int datCuoc = 0;
				do {
					System.out.println("Nhập số tiền cược: ");
					datCuoc = sc.nextInt();
				} while (datCuoc < 0 || datCuoc > taiKhoan);
				int optTX = 0;
				do {
					System.out.println("*** Nhập '1': Tài || '2': Xỉu ***");
					optTX = sc.nextInt();
				} while (optTX != 1 && optTX != 2);
				Random sx1 = new Random();
				int rd1 = sx1.nextInt(5) + 1;
				int rd2 = sx1.nextInt(5) + 1;
				int rd3 = sx1.nextInt(5) + 1;
				int rd = rd1 + rd2 + rd3;
				System.out.println("*** sx1:" + rd1 + "-" + "sx2:" + rd2 + "-" + "sx3:" + rd3);
				if (rd == 3 || rd == 18) {
					System.out.println("*** All in ***");
					taiKhoan -= datCuoc;
				} else if (rd >= 4 && rd <= 10) {
					System.out.println("*** Tài ***");
					if (optTX == 1) {
						System.out.println("*** Bạn đã được " + datCuoc);
						taiKhoan += datCuoc;
					} else {
						System.out.println("*** Bạn đã mất " + datCuoc);
						taiKhoan -= datCuoc;
					}
				} else if (rd > 10 && rd < 18) {
					System.out.println("*** Xỉu ***");
					if (optTX == 2) {
						System.out.println("*** Bạn đã được " + datCuoc);
						taiKhoan += datCuoc;
					} else {
						System.out.println("*** Bạn đã mất " + datCuoc);
						taiKhoan -= datCuoc;
					}
				}
				System.out.println("***Account now****");
				System.out.println("User: User1");
				System.out.println("Tài khoản: " + nb.format(taiKhoan));
				System.out.println("************");
			}
		} while (optPlay == 1);
	}
}
