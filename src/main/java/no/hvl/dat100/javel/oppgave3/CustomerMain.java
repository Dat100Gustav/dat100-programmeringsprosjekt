package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */

        Customer mats = new Customer("Mads Dittman Mikkelsen","mats@gmail.com",1004, PowerAgreementType.SPOTPRICE);

        System.out.println("**************TEST*************");


        System.out.println("\n**********Get Metoder**********\n");

        System.out.println("Navn: " + mats.getName());
        System.out.println("Email: " + mats.getEmail());
        System.out.println("id: " + mats.getCustomer_id());
        System.out.println("Agreement: " + mats.getAgreement());

        System.out.println("\n***********To String***********\n");

        System.out.println(mats.toString());

        System.out.println("\n**********Set Metoder**********\n");

        mats.setName("Markus Mikkelsen");
        mats.setCustomer_id(100);
        mats.setEmail("markus@gmail.com");
        mats.setAgreement(PowerAgreementType.NORGESPRICE);
        System.out.print(mats.toString());
    }
}
