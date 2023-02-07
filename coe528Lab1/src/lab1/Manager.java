/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author my_mc
 */
public class Manager {

    ArrayList<Flight> flights;
    ArrayList<Ticket> tickets;

    public Manager() {

        flights = new ArrayList<Flight>();
        tickets = new ArrayList<Ticket>();

    }

    public void createFlights() {

        String n;

        Scanner input = new Scanner(System.in);

        int flightNumber;
        String origin;
        String destination;
        String departureTime;
        int capacity;
        int numberOfSeatsLeft;
        double originalPrice;
        boolean run = true;
        boolean done = false;

        while (run == true) {
            System.out.println("Create a flight? (Yes or No) ");
            n = input.nextLine();
            
            if (n.equalsIgnoreCase("Yes")) {
                System.out.println("Enter the flight information [Flight #, Origin, Destination, Departure Time, Original Price] (To end say 1)");

                System.out.println("Origin : ");
                origin = input.nextLine();

                System.out.println("Destination : ");
                destination = input.nextLine();

                System.out.println("Departure Time : ");
                departureTime = input.nextLine();

                System.out.println("Capacity : ");
                capacity = input.nextInt();

                System.out.println("Flight # : ");
                flightNumber = input.nextInt();

                System.out.println("Original Price : ");
                originalPrice = input.nextDouble();

                flights.add(new Flight(flightNumber, capacity, departureTime, originalPrice, origin, destination));

            } else if (n.equalsIgnoreCase("No") && flights.size() > 0) {
                System.out.println("Creating flights is done");
                break;

            }

        }
    }

    public void displayAvailableFlights(String origin, String destination) {

        boolean availableFlight = false;

        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getOrigin().equalsIgnoreCase(origin) && flights.get(i).getDestination().equalsIgnoreCase(destination) && flights.get(i).getNumberOfSeatsLeft() > 0) {
                System.out.println("\n" + flights.get(i));
                availableFlight = true;
            } 
            if (availableFlight == false){
                System.out.println("\nSorry, there are no flights from " + origin + " to " + destination);
                throw new IllegalArgumentException();
            }

        }

    }

    public Flight getFlight(int flightNumber) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNumber() == flightNumber) {
                return flights.get(i);
            }
        }
        throw new IllegalArgumentException("Such flight does not exist");
    }

    public void bookSeat(int flightNumber, Passenger p) {

        Ticket ticket;

        if (getFlight(flightNumber).bookASeat() == true) {
            ticket = new Ticket(p, getFlight(flightNumber), p.applyDiscount(getFlight(flightNumber).getOriginalPrice()));
            tickets.add(ticket);
            System.out.println("\nThe following ticket has been purchased:\n" + ticket);
        } else {
            throw new IllegalArgumentException("There are no available tickets");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Manager man1 = new Manager();
        System.out.println("Creating a new Flight");
        man1.createFlights();

        Passenger passenger1 = null;
        int age = 0, yearsOfMembership, flightNum;
        String origin, destination, name, answer;

        boolean quit = false;

        do {
            System.out.print("Welcome to TMU Airlines. Please enter your name.\n");
            //scan.nextLine();
            name = scanner.nextLine();
            System.out.println("\nPlease enter your age.");
            boolean done = false;
            do {
                try {
                    age = scanner.nextInt();
                    done = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nPlease enter a valid age.");
                    scanner.next();
                }
            } while (done == false);

            do {
                System.out.println("\nAre you currently a member of the AirRewards program?(Yes/No)");
                answer = scanner.next();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("\nHow many years have you been a member?");
                done = false;

                do {
                    try {
                        yearsOfMembership = scanner.nextInt();
                        passenger1 = new Member(name, age, yearsOfMembership);
                        done = true;
                    } catch (InputMismatchException e) {
                        System.out.println("\nPlease enter a valid number.");
                        scanner.next();
                    }
                } while (done == false);

            } else {
                passenger1 = new NonMember(name, age);
            }
            done = false;
            do {
                try {
                    System.out.println("\nWhere are you traveling from?");
                    origin = scanner.next();

                    System.out.println("\nWhere do you want to travel?");
                    destination = scanner.next();
                    man1.displayAvailableFlights(origin, destination);
                    done = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Please enter a valid origin and destination.");
                    //scan.next();
                }
            } while (done == false);

            System.out.println("\nEnter a flight number to purchase a ticket");
            done = false;
            do {
                try {
                    man1.bookSeat(scanner.nextInt(), passenger1);
                    done = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nPlease enter a valid flight number.");
                    scanner.next();
                } catch (IllegalArgumentException e) {
                    System.out.println("\nPlease enter a valid flight number.");
                    //scan.next();
                }
            } while (done == false);

            do {
                System.out.println("\nDo you want to buy another ticket?(Yes/No)");
                answer = scanner.next();
                scanner.nextLine();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("");
                quit = false;
            } else {
                System.out.println("\nHere is your receipt.");
                for (Ticket item : man1.tickets) {
                    System.out.println(item.getNumber() + ": " + item.toString());
                }
                System.out.println("\nThank you for traveling with TMU Airlines!\nHave a great day!");
                quit = true;
            }
        } while (quit == false);

        //man1.displayAvailableFlights("A", "B");

        //man1.getFlight(1337);

    }

}
