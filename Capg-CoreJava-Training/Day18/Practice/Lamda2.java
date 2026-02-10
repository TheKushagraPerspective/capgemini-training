package Day18.Practice;


@FunctionalInterface
interface Printer {
	void sayMessage(String message);
}


public class Lamda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		traditional anonymous class
		Printer g = new Printer() {
			@Override
			public void sayMessage(String msg) {
				System.out.println("Message: " + msg);
			}
		};
		
		g.sayMessage("How are you!");
		
		
////		using lamda expression
		Printer g2 = (msg) -> { System.out.println("Message: " + msg); };
		
		g2.sayMessage("How are you!");

	}

}
