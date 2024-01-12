
public class Author {
	private String nameAuthor;
	private Date dob;
	public Author(String name, Date dob) {
		this.nameAuthor = name;
		this.dob = dob;
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
