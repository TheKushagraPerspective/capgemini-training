package Day18.Questions;

public class Person1 extends Thread{
	private final TicketBooking ticket;
	
	public Person1(TicketBooking ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void run() {
		ticket.bookByChoosingSeatFirst("Rahul (Seat First)");
	}
}
