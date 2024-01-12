
public class test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(1, 2);
		Diem d = new Diem(td1);
		HinhTron ht = new HinhTron(td1, 10);
		System.out.println(ht.tinhDienTich());
		System.out.println(d.tinhDienTich());
	}
}
