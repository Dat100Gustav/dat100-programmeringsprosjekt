package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        amount = 0;

    }

    public void computeAmount() {

        // TODO
        switch(c.getAgreement()){
            case PowerAgreementType.NORGESPRICE:
                amount = MonthlyPower.computeNorgesPrice(usage);
                break;
            case PowerAgreementType.SPOTPRICE:
                amount = MonthlyPower.computeSpotPrice(usage, prices);
                break;
            default:
                amount = MonthlyPower.computeSpotPrice(usage, prices) - MonthlyPower.computePowerSupport(usage, prices);
                break;
        }


    }

    public void printInvoice() {

        System.out.println(c.toString());

        System.out.println("\nMonth: " + month + "\nUsage: " + MonthlyPower.computePowerUsage(usage) + " kWh\nAmount: " + amount + " NOK\n");

    }
}
