package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

<<<<<<< Updated upstream
        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

<<<<<<< HEAD
=======
=======
>>>>>>> Eivind
        Customer customer = new Customer("Eivind", "m@gmail.com", 10, PowerAgreementType.POWERSUPPORT);
        Invoice invoiceE = new Invoice(customer, "Januar", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);

        Customer gustav = new Customer("Gustav", "callme@gmail.com", 90, PowerAgreementType.SPOTPRICE);
        Invoice invoiceG = new Invoice(gustav, "Juni", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Customer thomas = new Customer("Thomas", "thoma@gmail.com", 12, PowerAgreementType.NORGESPRICE);
        Invoice invoiceT = new Invoice(thomas, "Desember", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);


        Invoice[] invoiceTab = {invoiceE, invoiceG, invoiceT};

        for (Invoice invoice : invoiceTab){
            invoice.computeAmount();
        }

<<<<<<< HEAD

        Invoices.processInvoices(invoiceTab);
        // invoice.printInvoice();
=======
        Invoices.processInvoices(invoiceTab);
>>>>>>> Stashed changes
>>>>>>> Eivind
    }
}
