/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author my_mc
 */
public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private static int nextTicketNum = 1;
    private double price;
    private int number;
    
    public Ticket(Passenger p, Flight flight, double price){
        
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.number = nextTicketNum++;
        
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /*public static int getNextTicketNum() {
        return nextTicketNum;
    }

    public static void setNextTicketNum(int nextTicketNum) {
        Ticket.nextTicketNum = nextTicketNum;
    }*/

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + this.passenger.getName() + getFlight() + ", tikcet price : " + getPrice() + " Ticket #" + getNumber();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Creating a new Flight");
        Flight flight1 = new Flight(1030, 600, "28/08/23 12:00pm", 50, "Toronto", "Greece");
        
        System.out.println("New Flight Is : " + flight1);
        Passenger passenger1 =  new Member("Caleb Joseph", 19,2);
        
        Passenger passenger2 =  new Member("Maria Theo", 19,10);
        
        Ticket ticket1 = new Ticket(passenger1, flight1, 40);
        System.out.println("New Ticket Is : " +ticket1);
        Ticket ticket2 = new Ticket(passenger2, flight1, 40);
        System.out.println("New Ticket Is : " +ticket2);
        
        
    }
    
}
