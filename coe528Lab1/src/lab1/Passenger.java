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
public abstract class Passenger {

    String name;
    int age;

    public Passenger(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double applyDiscount(double p);

}

class Member extends Passenger {

   int yearsOfMembership;

    Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    public double applyDiscount(double p) {
        if (yearsOfMembership > 5) {
            p = (p - (p * 0.5));
        }
        else if (1 < yearsOfMembership || yearsOfMembership <= 5) {
            p = (p - (p * 0.1));
        }

        return p;

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}

class NonMember extends Passenger {

    NonMember(String name, int age) {
        super(name, age);
    }

    public double applyDiscount(double p) {
        if (age > 65) {
            p = (p - (p * 0.1));
        }

        return p;

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
