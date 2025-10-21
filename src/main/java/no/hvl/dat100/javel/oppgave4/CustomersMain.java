package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.sql.SQLOutput;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        // oppgave a)
        Customers customerList = new Customers(5);

        // oppgave b)
        System.out.println("Antall kunder: " + customerList.countNonNull());
        System.out.println();

        // oppgave c) og d)
        Customer[] customerTab = {
            new Customer("Erik", "Erik@gmail.com", 50, PowerAgreementType.NORGESPRICE),

            new Customer("Dag", "Dag@gmail.com", 5, PowerAgreementType.POWERSUPPORT),

            new Customer("Eivind", "Eivind@gmail.com", 35, PowerAgreementType.SPOTPRICE)
        };

        for (Customer customer : customerTab){
            customerList.addCustomer(customer);
        }

        System.out.println(customerList.getCustomer(50) + "\n");

        // oppgave e)
        System.out.println("Antall kunder før fjerning: \n" + customerList.countNonNull());

        customerList.removeCustomer(50);
        System.out.println("Antall kunder etter fjerning: \n" + customerList.countNonNull() + "\n");

        // oppgave f)
        System.out.println("Alle kunder etter fjerning: ");

        for (Customer customer : customerList.getCustomers()){
            System.out.println(customer + "\n");
        };

        Customer kunde1 = new Customer("Eivind", "E@gmail.com", 100, PowerAgreementType.NORGESPRICE);

        Customers kunder = new Customers(10);

        kunder.customers[0] = kunde1;

        System.out.println(kunder.getCustomer(100));
    }
}
