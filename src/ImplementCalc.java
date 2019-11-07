
public class ImplementCalc {

	public static void main(String[] args) {
		
		Calc cal1 = new Calc();
		cal1.x=100;
		cal1.y=5;
		
		int sum = cal1.add();
		System.out.println(sum);
		
		int sub = cal1.sub();
		
		System.out.println(sub);
		
		int m = cal1.multiplication(10, 5);
		System.out.println(m);
		
	int s1 =	cal1.add (5, 7, 7);
	System.out.println(s1);
	int s2 = cal1.add(10, 10.5, 5);
	System.out.println(s2);
		
		
		
		
		
	
		

	}

}
