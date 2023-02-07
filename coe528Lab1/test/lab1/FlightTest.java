/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author my_mc
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    
    @Test
    public void testConstructor() {
        System.out.println("Setting up the flight");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        String expResult = " Flight 1030, Toronto to Greece, 28/08/23 12:00pm, original price: 128.5$";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        System.out.println("Setting up the flight");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Toronto");
        // TODO review the generated test code and remove the default call to fail.
    }   
    
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        int expResult = 1030;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        int expResult = 600;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        int expResult = 600;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        double expResult = 128.50;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        String expResult = "Greece";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        String expResult = "28/08/23 12:00pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1030;
        Flight instance = new Flight(flightNumber, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        instance.setFlightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Toronto";
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, origin, "Greece");
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Greece";
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", destination);
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "28/08/23 12:00pm";
        Flight instance = new Flight(1030, 600, departureTime, 128.50, "Toronto", "Greece");
        instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 600;
        Flight instance = new Flight(1030, capacity, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int capacity = 600;
        int numberOfSeatsLeft = capacity;
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 128.50;
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", originalPrice, "Toronto", "Greece");
        instance.setOriginalPrice(originalPrice);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1030, 0, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        boolean expResult = false;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1030, 600, "28/08/23 12:00pm", 128.50, "Toronto", "Greece");
        String expResult = " Flight 1030, Toronto to Greece, 28/08/23 12:00pm, original price: 128.5$";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Flight.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Flight.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
