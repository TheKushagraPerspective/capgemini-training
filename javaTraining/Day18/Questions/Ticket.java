package Day18.Questions;

public class Ticket {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		TicketBooking tb = new TicketBooking();
		
		Person1 p1 = new Person1(tb);
		Person2 p2 = new Person2(tb);
		
		p1.start();
//		p1.join();
		p2.start();
	}

}
