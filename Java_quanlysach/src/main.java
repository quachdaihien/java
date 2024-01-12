
public class main {
	public static void main(String[] args) {
		Date date1 = new Date(10,2,2024);
		Author author1 = new Author("hienqd",date1);
		Date date2 = new Date(10,2,2024);
		Author author2 = new Author("author",date2);
		Book book = new Book("Sach12",20000,2024,author1);
		Book book2 = new Book("Sach",20000,2024,author2);
		book.getName();
		book2.getName();
		System.out.println(book.equalNsx(book2) ? "cùng năm" : "khác năm");
		book.equalNsx(book2);
		System.out.println("sách sau khi sale: " +book.sale(20));
	}
}
