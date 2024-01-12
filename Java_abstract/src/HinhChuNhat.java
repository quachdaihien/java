
public class HinhChuNhat extends Hinh{
	private double dai, rong;
	public HinhChuNhat(ToaDo toaDo, double dai, double rong) {
		super(toaDo);
		this.dai = dai;
		this.rong = rong;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	@Override
	public double tinhDienTich() {
		return this.dai * this.rong;
	}
}
