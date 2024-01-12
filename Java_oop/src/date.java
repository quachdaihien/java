import java.util.Objects;

public class date {
	private int day, month, year;

//	constructor
	public date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

//	void
	public void printDay() {
		System.out.println("Ngày : " + this.day);
	}

//	set
	public void setDay(int d) {
		this.day = d;
	}

//	get
	public int getDay() {
		return day;
	}

	public void printMonth() {
		System.out.println("Tháng : " + this.month);
	}

	public void printYear() {
		System.out.println("Năm : " + this.year);
	}

	public void printDate() {
		System.out.println("Ngày sinh : " + this.day + " - " + this.month + " - " + this.year);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("ad"+this.getClass());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		date other = (date) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}

}
