
public class Test {
	public static void main(String[] args) {
		HangSx hsx1 = new HangSx("hang1", "VN");
		HangSx hsx2 = new HangSx("hang2", "JP");
		HangSx hsx3 = new HangSx("hang3", "KR");
		
		MayBay p1 = new MayBay(hsx1, "Dau");
		PhuongTienDiChuyen p2 = new Oto(hsx2, "Xang");
		PhuongTienDiChuyen p3 = new XeDap(hsx3);
		
		System.out.println(p1.layTenHangSx());
		System.out.println(p2.layVanToc());
		p1.catCanh();
	}
}
