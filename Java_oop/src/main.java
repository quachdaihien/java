
public class main {
	public static void main(String[] args) {
		date dt = new date(2,5,2024);
		date dt2 = new date(11,5,2024);
		dt.printDay();
		dt.setDay(12);
		dt.printDay();
		dt.printMonth();
		dt.printYear();
		dt.printDate();
		System.out.println(dt);
		System.out.println(dt.equals(dt2));
		System.out.println(dt.hashCode());
	}
}
