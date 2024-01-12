
public class MayTinh {
	private HangSanXuat hsx;
	private Date nsx;
	private double price;
	private int baoHanh;
	public MayTinh(HangSanXuat hsx, Date nsx, double price, int baoHanh) {
		this.hsx = hsx;
		this.nsx = nsx;
		this.price = price;
		this.baoHanh = baoHanh;
	}
	public HangSanXuat getHsx() {
		return hsx;
	}
	public void setHsx(HangSanXuat hsx) {
		this.hsx = hsx;
	}
	public Date getNsx() {
		return nsx;
	}
	public void setNsx(Date nsx) {
		this.nsx = nsx;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBaoHanh() {
		return baoHanh;
	}
	public void setBaoHanh(int baoHanh) {
		this.baoHanh = baoHanh;
	}
	public boolean equalPrice(MayTinh mtKhac) {
		return this.price >= mtKhac.price;
	}
	public String getTenQuocGia() {
		return this.hsx.getQuocGia();
	}
}
