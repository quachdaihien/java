
public class Film {
	private String nameFilm;
	private int nsx;
	private hangSanXuat hsx;
	private double price;
	private Date dateShow;
	public Film(String nameFilm, int nsx, hangSanXuat hsx, double price, Date dateShow) {
		this.nameFilm = nameFilm;
		this.nsx = nsx;
		this.hsx = hsx;
		this.price = price;
		this.dateShow = dateShow;
	}
	public String getNameFilm() {
		return nameFilm;
	}
	public void setNameFilm(String nameFilm) {
		this.nameFilm = nameFilm;
	}
	public int getNsx() {
		return nsx;
	}
	public void setNsx(int nsx) {
		this.nsx = nsx;
	}
	public hangSanXuat getHsx() {
		return hsx;
	}
	public void setHsx(hangSanXuat hsx) {
		this.hsx = hsx;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDateShow() {
		return dateShow;
	}
	public void setDateShow(Date dateShow) {
		this.dateShow = dateShow;
	}
	public boolean equalPrice(Film filmKhac) {
		return this.price >= filmKhac.price;
	}
	public String tenHangSx() {
		return this.hsx.getNameSx();
	}
	public double sale(int sale) {
		return this.price - this.price*sale/100;
	}
}
