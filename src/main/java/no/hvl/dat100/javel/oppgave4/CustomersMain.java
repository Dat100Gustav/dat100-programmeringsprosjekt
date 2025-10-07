package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */


        Customer kunde1 = new Customer("Eivind", "E@gmail.com", 100, PowerAgreementType.NORGESPRICE);

        Customers kunder = new Customers(10);

        kunder.customers[0] = kunde1;

        System.out.println(kunder.getCustomer(100));
    }
}
