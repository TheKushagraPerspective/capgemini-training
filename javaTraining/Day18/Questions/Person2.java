package Day18.Questions;

public class Person2 extends Thread{
	private final TicketBooking ticket;
	
	public Person2(TicketBooking ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void run() {
		ticket.bookByChoosingPaymentFirst("Harsh (Payment First)");
	}
}
