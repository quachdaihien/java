
public class Main {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("VN", "VietNamese");
		Date date1 = new Date(10, 1, 2024);
		MayTinh mt1 = new MayTinh(hsx1, date1, 20000000, 12);
		HangSanXuat hsx2 = new HangSanXuat("VN2", "VietNamese2");
		Date date2 = new Date(10, 1, 2024);
		MayTinh mt2 = new MayTinh(hsx2, date2, 30000000, 24);
		System.out.println(mt1.equalPrice(mt2) ? "giá hơn" : "nhỏ");
		System.out.println(mt1.getTenQuocGia());
		System.out.println(mt2.getTenQuocGia());
	}
}
