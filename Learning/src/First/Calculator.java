package First;

public class Calculator {
	
	public void add (int a, int b){
	
		System.out.println(a+b);
	}
	
	public void subtract (int a, int b) {
		 
		System.out.println(a-b);
		
	}
//learn and earn
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
			basicCal.add(190,  200);
			basicCal.subtract(1000, 500);
	}
}
