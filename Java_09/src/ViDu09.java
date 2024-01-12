import java.util.Scanner;
public class ViDu09 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){	
			System.out.println("Nhập họ và tên");
			String hoVaTen = sc.nextLine();
			
			System.out.println("Nhập mã sv");
			long maSV = sc.nextLong();
			
			System.out.println("Nhập vào điểm thi");
			float diemThi = sc.nextFloat();
			
			System.out.println("------------");
			System.out.println("Ho va ten "+ hoVaTen);
			System.out.println("Msv "+ maSV);
			System.out.println("Diem thi " +diemThi);
		}	
	}
}
