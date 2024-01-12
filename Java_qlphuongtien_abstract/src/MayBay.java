
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	public MayBay(HangSx hsx ,String loaiNhienLieu) {
		super("May bay",hsx);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}
	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public void catCanh() {
		System.out.println("cat canh");
	}
	public void haCanh() {
		System.out.println("ha canh");
	}
	@Override
	public double layVanToc() {
		return 200;
	}
}
