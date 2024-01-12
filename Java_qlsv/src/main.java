
public class main {
	public static void main(String[] args) {
		Date date1 = new Date(10,10,2021);
		LopHoc lh1 = new LopHoc("CNTT","HTTT1");
		HocSinh hs1 = new HocSinh("HS01","NguyenVanA",date1,7,lh1);
		Date date2 = new Date(10,10,2021);
		HocSinh hs2 = new HocSinh("HS02","NguyenVanA",date2,3,lh1);
		System.out.println(hs1.getTenKhoa());
		System.out.println(hs1.checkPass() ? "Đậu" : "Loại");
		System.out.println(hs1.checkDob(hs2) ? "Cùng ngày sinh" : "Không cùng ns");
	}
}
