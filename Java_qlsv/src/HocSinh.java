
public class HocSinh {
	private String msv, hvt;
	private Date ns;
	private int dtb;

	public HocSinh(String msv, String hvt, Date ns, int dtb, LopHoc lop) {
		this.msv = msv;
		this.hvt = hvt;
		this.ns = ns;
		this.dtb = dtb;
		this.lop = lop;
	}

	private LopHoc lop;

	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getHvt() {
		return hvt;
	}

	public void setHvt(String hvt) {
		this.hvt = hvt;
	}

	public Date getNs() {
		return ns;
	}

	public void setNs(Date ns) {
		this.ns = ns;
	}

	public float getDtb() {
		return dtb;
	}

	public void setDtb(int dtb) {
		this.dtb = dtb;
	}

	public LopHoc getLop() {
		return lop;
	}

	public void setLop(LopHoc lop) {
		this.lop = lop;
	}

	public String getTenKhoa() {
		return this.lop.getTenKhoa();
	}

	public boolean checkPass() {
		return this.dtb >= 5.0;
	}

	public boolean checkDob(HocSinh hsKhac) {
//		checkDob(Date dateKhac)
//		return (this.ns.getDate() == dateKhac.getDate() && this.ns.getMonth() == dateKhac.getMonth()
//				&& this.ns.getYear() == dateKhac.getYear());
		System.out.println(this.ns);
		return this.getNs().equals(hsKhac.ns);
	}
}
