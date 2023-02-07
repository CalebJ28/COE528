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
public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    public Flight(int flightnum, int cap, String depart, double price, String org, String dest) {

        if (org == dest) {
            throw new IllegalArgumentException("Origin and destination cannot be equal!");
        }

        this.flightNumber = flightnum;
        this.capacity = cap;
        this.numberOfSeatsLeft = cap;
        this.originalPrice = price;
        this.origin = org;
        this.destination = dest;
        this.departureTime = depart;

    }

    //Getters
    public int getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    //Setters
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft -= 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return " Flight " + this.flightNumber + ", " + this.origin + " to " + this.destination + ", " + this.departureTime + ", original price: " + this.originalPrice + "$";
    }

    public static void main(String[] args) {
        System.out.println("Creating a new Flight");
        Flight flight1 = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        System.out.println("New Flight Is : " +flight1);
        

    }

}
