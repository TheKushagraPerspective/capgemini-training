package Day18.Practice;


@FunctionalInterface
interface Adder {
	int add(int a , int b);
}


public class Lamda3 {

	public static void main(String[] args) {
		

//		traditional anonymous class
		Adder a1 = new Adder() {
			@Override
			public int add(int a , int b) {
				System.out.println("Adding " + a + " and " + b);
				return a + b;
			}
		};
		
		System.out.println("Result: " + a1.add(10 , 30));
		
		
//		using lamda expression
		Adder a2 = (a , b) -> { 
			System.out.println("Adding " + a + " and " + b); 
			return a + b;
		};
		
		System.out.println("Result: " + a2.add(10 , 30));

	}

}
