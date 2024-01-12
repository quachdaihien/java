
public enum Thang {
	thang_1(30),
	thang_2(29),
	thang_3(31);
	private final int soNgay;
	Thang(int soNgay){
		this.soNgay = soNgay;
	}
	public int SoNgay() {
		return soNgay;
	}
}
