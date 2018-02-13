package First;

public class IT extends Manage {
	int bonus = 30000;
public void day() {
	System.out.println("today is Sunday");
}

	public static void main(String[] args) {
		IT Meenu = new IT();
		System.out.println(Meenu.Salary);
		System.out.println(Meenu.bonus);
		Meenu.day();
	}
}
