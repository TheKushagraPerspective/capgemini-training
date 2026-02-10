package Day18.Practice;



public class Lamda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Lamda in Thread (Runnable) - replace anonymous class
		
		// old way
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Old Thread");
//			}
//		};
		
		// using lamda expression
		Runnable task = () -> {
			for(int i=1 ; i<=3 ; i++) {
				System.out.println("Song " + i + " playing...");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		};
		
		Thread t1 = new Thread(task);
		t1.start();
	}

}
