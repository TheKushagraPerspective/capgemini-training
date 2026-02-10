package Day18.Practice;

@FunctionalInterface
interface Greeting {
	void sayHello();
}

public class Lamda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		traditional anonymous class
		Greeting g = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello from Kushagra...");
			}
		};
		
		System.out.println(g);
		g.sayHello();
		
		
////		using lamda expression
		Greeting g2 = () -> { System.out.println("Hello from Kushagra..."); };
		
		System.out.println(g2);
		g2.sayHello();

	}

}




