package Day4.Questions;

import java.util.Scanner;

public class RailwayTicketConfirmation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Seats available for booking: ");
        int totalTickets = sc.nextInt();

        System.out.print("Enter Total seats booked till now: ");
        int bookedTickets = sc.nextInt();

        

        if(totalTickets > bookedTickets) {
            System.out.println("Ticket Status: Confirmed");
        }
        else {
            System.out.println("Confirm tickets are not available for now. You can check for reserved tickets");

            System.out.print("Enter no of extra seats reserved for booking (RAC): ");
            int racTickets = sc.nextInt();

            System.out.print("Enter current waitingList tickets no: ");
            int waitList = sc.nextInt();
            sc.nextLine();
            
            if(racTickets > waitList) {
                System.out.print("WaitingLists are available. If you want to book in waitingList then enter yes otherwise no: ");
                String wantToBook = sc.nextLine();

                if(wantToBook.equals("yes")) {
                    System.out.println("Ticket Status: Confirmed and WaitListed");
                }
                else {
                    System.out.println("Ticket Status: Cancelled");
                }
            }
            else {
                System.out.println("As WaitingList also closed so you are unable to book the ticket. Ticket Status: Cancelled");
            }
        }

        sc.close();
    }
}
