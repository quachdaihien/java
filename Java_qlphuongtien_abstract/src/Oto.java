
public class Oto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	public Oto(HangSx hsx, String loaiNhienLieu) {
		super("Oto",hsx);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}
	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 60;
	}
}
