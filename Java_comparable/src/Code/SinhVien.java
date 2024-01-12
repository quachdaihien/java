package Code;

public class SinhVien implements Comparable<SinhVien> {
	private String hoVaTen, tenLop;
	private int maSinhVien;
	private double diemTb;
	public SinhVien(int maSv, String hoVaTen, String tenLop, double diemTb) {
		super();
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTb = diemTb;
		this.maSinhVien = maSv;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}
	public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}
		else {
			return s;
		}
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.getTen().compareTo(o.getTen());
//		return this.maSinhVien - o.maSinhVien;
//		String tenThis = this.getTen();
//		String tenO = o.getTen();
//		return tenThis.compareTo(tenO);
	}
	@Override
	public String toString() {
		return "sv [hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", maSinhVien=" + maSinhVien + ", diemTb="
				+ diemTb + "]";
	}
	
}
