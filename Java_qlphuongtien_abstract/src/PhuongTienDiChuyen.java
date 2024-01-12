
public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSx hsx;

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSx hsx) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hsx = hsx;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	public String layTenHangSx() {
		return this.hsx.getTenHangSx();
	}
	
	public void batDau() {
		System.out.println("bat dau");
	}
	public void tangToc() {
		System.out.println("tang toc");
	}
	public void dungLai() {
		System.out.println("dung lai");
	}
	 public abstract double layVanToc();
}
