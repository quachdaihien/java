import java.util.Objects;

public class Book {
	private String nameBook;
	private int nsx;
	private double price;

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public int getNsx() {
		return nsx;
	}

	public void setNsx(int nsx) {
		this.nsx = nsx;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	private Author author;

	public Book(String nameBook, double price, int nsx, Author author) {
		this.nameBook = nameBook;
		this.price = price;
		this.nsx = nsx;
		this.author = author;
	}

	public void getName() {
		System.out.println("Name : " + this.nameBook);
	}

	public boolean equalNsx(Book bookKhac) {
		return this.nsx == bookKhac.nsx;
	}

	public double sale(int sale) {
		return this.price - this.price * sale / 100;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nsx);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return this.nsx == other.nsx;
	}
}
