package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class test {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			DanhSachSinhVien dssv = new DanhSachSinhVien();
			int opt = 0;
			do {
				System.out.println("******Menu******");
				System.out.println("1. Thêm. \n" + "2. In \n" + "3.Kiểm tra.\n" + "4. Lấy số lượng trong danh sách.\n"
						+ "5. Làm rỗng dssv .\n" + "6. Kiểm tra sv có tồn tại hay không .\n" + "7. Xóa 1 sinh viên .\n"
						+ "8. Tìm kiếm tất cả sv dựa theo tên .\n" + "9. Xuất ra sv có điểm từ cao đến thấp .\n"
						+ "0. Thoát");
				opt = sc.nextInt();
				sc.nextLine();
				switch (opt) {
				case 1: {
					System.out.println("Nhập mã sv:");
					String maSinhVien = sc.nextLine();
					System.out.println("Nhập họ và tên:");
					String hoVaTen = sc.nextLine();
					System.out.println("Nhập năm sinh:");
					int namSinh = sc.nextInt();
					System.out.println("Nhập điểm trung bình:");
					float diemTrungBinh = sc.nextFloat();
					SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
					dssv.themSV(sv);
					break;
				}
				case 2: {
					dssv.inDanhSach();
					break;
				}
				case 3: {
					dssv.checkEmpty();
					break;
				}
				case 4: {
					System.out.println("size2"+dssv.sizeList());
					break;
				}
				case 5: {
					dssv.doEmpty();
					break;
				}
				case 6: {
					System.out.println("Nhập mã sv:");
					String maSinhVien = sc.nextLine();
					SinhVien sv = new SinhVien(maSinhVien);
					System.out.println(dssv.checkExist(sv) ? "sv đã tồn tại" : "sv chưa tồn tại");
					break;
				}
				case 7: {
					System.out.println("Nhập mã sv:");
					String maSinhVien = sc.nextLine();
					SinhVien sv = new SinhVien(maSinhVien);
					System.out.println("Xóa sv:" +dssv.removeSV(sv));
					break;
				}
				case 8: {
					System.out.println("Nhập tên tìm kiếm");
					String hoVaTen = sc.nextLine();
					dssv.findSV(hoVaTen);
					break;
				}
				case 9: {
					dssv.sortSv();
					break;
				}
				default:
					System.out.println("Not in cludes menu");
					break;
				}
			} while (opt != 0);
		}
	}
}
