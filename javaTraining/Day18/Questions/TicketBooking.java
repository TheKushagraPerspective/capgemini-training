package Day18.Questions;

public class TicketBooking {
	private final Object seatLock = new Object();
	private final Object paymentLock = new Object();
	
	
	public void bookByChoosingSeatFirst(String person) {
		synchronized(seatLock) {
			System.out.println(person + " -> got seat locked. Choosing seat...");
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(person + " -> waiting for payment lock...");
			
			synchronized(paymentLock) {
				System.out.println(person + " -> got payment locked. Booking Confirmed...");
			}
		}
	}
	
	public void bookByChoosingPaymentFirst(String person) {
		synchronized(paymentLock) {
			System.out.println(person + " -> got payment locked. paying payment...");
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(person + " -> waiting for seat lock...");
			
			synchronized(seatLock) {
				System.out.println(person + " -> got seat locked. Booking Confirmed...");
			}
		}
	}
}
