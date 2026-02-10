package Day10.Question;


class Prime extends Ola {
    private String pickUpPoint;
    private String dropPoint;
    private double price;
    private boolean cabBooked;

    {
        cabBooked = false;   // initially cab is not booked
    }


    public Prime(String username , long contactNumber , double uberAccBal , String pickUpPoint , String dropPoint) {
        super(username , contactNumber , uberAccBal);
        this.pickUpPoint = pickUpPoint;
        this.dropPoint = dropPoint;
    }

    public void bookCab() {
        double pricePerKm = 15.0;
        double distanceInKm = 19.5;    // default distance for checking
        double finalPayableAmount = getFinalPrice(pricePerKm, distanceInKm);

        if(super.getUberAccBal() >= finalPayableAmount) {
            this.cabBooked = true;
            super.UpdateUberAccBal(finalPayableAmount, "BOOKING");
            this.price = finalPayableAmount;
            System.out.println("Your Mini cab is successfully booked.");
        }
        else {
            System.out.println("Your Uber Account Balance is not sufficient to book the ride.\nPLease add some balance to book the ride and try again later.");
        }
    }

    public double getFinalPrice(double pricePerKm , double distanceInKm) {
        return pricePerKm * distanceInKm;
    }

    public void displayDetails() {
        System.out.println("Mini Cab Details for the customer: " + super.getUserName());
        if(this.cabBooked) {
            System.out.println(super.getUserName() + " customer has booked the cab from " + this.getPickUpPoint() + " to " + this.getDropPoint());
        }
        else {
            System.out.println("Currently, customer " + super.getUserName() + " doesn't have any cab booking");
        }
    }

    public String getPickUpPoint() {
        return this.pickUpPoint;
    }

    public String getDropPoint() {
        return this.dropPoint;
    }

    public double getPrice() {
        return this.price;
    }

    public void cancelRide(Prime obj) {
        if(obj.price > 0) {
            super.UpdateUberAccBal(obj.price, "CANCEL");
            obj.pickUpPoint = null;
            obj.dropPoint = null;
            obj.price = 0;
            obj.cabBooked = false;
            System.out.println("The customer " + super.getUserName() + " has Successfully cancelled the cab booking");
        }
        else {
            System.out.println("The customer " + super.getUserName() + " doesn't have ongoing cab booking to cancel");
        }     
    }
}
