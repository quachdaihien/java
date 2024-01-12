
public class main {
	public static void main(String[] args) {
		boolean isEql;
		Date date1  = new Date(10,10,2024);
		hangSanXuat hsx1 = new hangSanXuat("hang1", "vietnam");
		Film film1 = new Film("Film1",2024,hsx1,300000,date1);
		
		Date date2  = new Date(10,10,2024);
		hangSanXuat hsx2 = new hangSanXuat("hang2", "canada");
		Film film2 = new Film("Film2",2024,hsx2,200000,date2);
		isEql = film1.equalPrice(film2);
		System.out.println(isEql ? "đắt hơn" : "rẻ hơn");
		System.out.println(film1.tenHangSx());
		System.out.println(film1.sale(10));
	}
}
