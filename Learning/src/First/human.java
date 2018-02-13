package First;

public class human {
	String color;
	int age;
	String gender;

	public human(String humanColor, int humanAge, String humanGender) {
		color = humanColor;
		age = humanAge;
		gender = humanGender;
	}

	public void printhuman() {

		System.out.println("Color is " + color + " Age is " + age + "Gender is " + gender);
	}

	public static void main(String[] args) {
		
		human meenu = new human("yellow", 27, "female");
		
		meenu.printhuman();
	}

}
