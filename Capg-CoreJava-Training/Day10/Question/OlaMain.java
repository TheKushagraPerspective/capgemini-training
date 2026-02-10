package Day10.Question;

import java.util.Scanner;


public class OlaMain {
    // MAIN MTH
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Contact Number: ");
        long contactNumber = sc.nextLong();

        System.out.print("Enter your Uber Account Balance: ");
        double uberAccBal = sc.nextDouble();


        do {
            System.out.println("Enter your Cab Booking Choice\n(1) Mini\n(2) Prime\n(3) Luxery\n(4) Exit");
            int choice = sc.nextInt();

            if(choice == 4) {
                break;
            }

            sc.nextLine();
            System.out.print("Enter your PickUp Point: ");
            String pickUpPoint = sc.nextLine();

            System.out.print("Enter your Drop Point: ");
            String dropPoint = sc.nextLine();

            switch (choice) {
                case 1:
                    {
                        // upcasting
                        Ola ola = new Mini(name , contactNumber , uberAccBal , pickUpPoint , dropPoint);
                        boolean isLogin = ola.login("Kushagra Varshney", 9876543210L);

                        if(isLogin) {
                            System.out.println("User is now logged in.\nCan perform the ride operations...");
                            if(ola instanceof Mini) {
                                // upcasting is there, now we can do downcasting
                                Mini mini = (Mini) ola;
                                mini.setMiniObjReference(mini);

                                do {
                                    System.out.println("Enter your Query Choice\n(1) Booking\n(2) Cancel\n(3) Details\n(4) Exit");
                                    int choice2 = sc.nextInt();

                                    if(choice2 == 4) {
                                        break;
                                    }
                                    
                                    switch (choice2) {
                                        case 1:
                                            {
                                                System.out.println("User now wants to book a ride...");
                                                mini.bookCab();
                                            }
                                            break;

                                        case 2:
                                            {
                                                System.out.println("User now wants to cancel a ride...");
                                                mini.cancelRide(mini);
                                            }
                                            break;

                                        case 3:
                                            {
                                                System.out.println("User now wants to get the details...");
                                                mini.displayDetails();
                                            }
                                            break;
                                
                                        default:
                                            {
                                                System.out.println("invalid choice");
                                            }
                                            break;
                                    }   
                                } while(true);
                            }
                            else {
                                System.out.println("Upcasting not found.\nTo access the members, first do upcasting then downcasting.");
                            }
                        }
                        else {
                            System.out.println(name + " user is not logged in.\nFirst login and then try to book a cab");
                        }
                    }
                    break;

                case 2:
                    {
                        // upcasting
                        Ola ola = new Prime(name , contactNumber , uberAccBal , pickUpPoint , dropPoint);
                        boolean isLogin = ola.login("Kushagra Varshney", 9876543210L);

                        if(isLogin) {
                            System.out.println("User is now logged in.\nCan book the ride...");
                            if(ola instanceof Prime) {
                                // upcasting is there, now we can do downcasting
                                Prime prime = (Prime) ola;

                                do {
                                    System.out.println("Enter your Query Choice\n(1) Booking\n(2) Cancel\n(3) Details\n(4) Exit");
                                    int choice2 = sc.nextInt();

                                    if(choice2 == 4) {
                                        break;
                                    }
                                    
                                    switch (choice2) {
                                        case 1:
                                            {
                                                System.out.println("User now wants to book a ride...");
                                                prime.bookCab();
                                            }
                                            break;

                                        case 2:
                                            {
                                                System.out.println("User now wants to cancel a ride...");
                                                prime.cancelRide(prime);
                                            }
                                            break;

                                        case 3:
                                            {
                                                System.out.println("User now wants to get the details...");
                                                prime.displayDetails();
                                            }
                                            break;
                                
                                        default:
                                            {
                                                System.out.println("invalid choice");
                                            }
                                            break;
                                    }   
                                } while(true);
                            }
                            else {
                                System.out.println("Upcasting not found.\nTo access the members, first do upcasting then downcasting.");
                            }
                        }
                        else {
                            System.out.println(name + " user is not logged in.\nFirst login and then try to book a cab");
                        }
                    }
                    break;

                case 3:
                    {
                        // upcasting
                        Ola uber = new Luxury(name , contactNumber , uberAccBal , pickUpPoint , dropPoint);
                        boolean isLogin = uber.login("Kushagra Varshney", 9876543210L);

                        if(isLogin) {
                            System.out.println("User is now logged in.\nCan book the ride...");
                            if(uber instanceof Luxury) {
                                // upcasting is there, now we can do downcasting
                                Luxury luxury = (Luxury) uber;
                                
                                do {
                                    System.out.println("Enter your Query Choice\n(1) Booking\n(2) Cancel\n(3) Details\n(4) Exit");
                                    int choice2 = sc.nextInt();

                                    if(choice2 == 4) {
                                        break;
                                    }
                                    
                                    switch (choice2) {
                                        case 1:
                                            {
                                                System.out.println("User now wants to book a ride...");
                                                luxury.bookCab();
                                            }
                                            break;

                                        case 2:
                                            {
                                                System.out.println("User now wants to cancel a ride...");
                                                luxury.cancelRide(luxury);
                                            }
                                            break;

                                        case 3:
                                            {
                                                System.out.println("User now wants to get the details...");
                                                luxury.displayDetails();
                                            }
                                            break;
                                
                                        default:
                                            {
                                                System.out.println("invalid choice");
                                            }
                                            break;
                                    }   
                                } while(true);
                            }
                            else {
                                System.out.println("Upcasting not found.\nTo access the members, first do upcasting then downcasting.");
                            }
                        }
                        else {
                            System.out.println(name + " user is not logged in.\nFirst login and then try to book a cab");
                        }
                    }
                    break;

                default:
                    {
                        System.out.println("Invalid choice of Available Options");
                    }
                    break;
            }
        } while (true);


        sc.close();
    }
}
