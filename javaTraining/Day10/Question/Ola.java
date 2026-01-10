package Day10.Question;

class Ola {
    public String userName;
    public long contactNumber;
    private double uberAccBal;


    public Ola(String username , long contactNumber , double uberAccBal) {
        this.userName = username;
        this.contactNumber = contactNumber;
        this.uberAccBal = uberAccBal;
    }

    public boolean login(String userName , long contactNumber) {
        return this.userName.equals(userName) && this.contactNumber == contactNumber;
    }


    public double getUberAccBal() {
        return this.uberAccBal;
    }

    public String getUserName() {
        return this.userName;
    }

    public long getUserContactNumber() {
        return this.contactNumber;
    }

    public void UpdateUberAccBal(double amount , String status) {
        if(status.equals("BOOKING")) {
            this.uberAccBal -= amount;
        }
        else if(status.equals("CANCEL")) {
            this.uberAccBal += amount;
        }
        else {
            System.out.println("Invalid Status");
        }
    }

    public void displayOlaAccDetails() {
        System.out.println("Uber Account details: ");
        System.out.println("User Name: " + this.userName);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println("Uber Account Balance: " + this.uberAccBal);
    }
}
