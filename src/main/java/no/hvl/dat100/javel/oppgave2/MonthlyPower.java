package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        System.out.println("Månedlig bruk: ");
        for (int i = 0; i < usage.length; i++) {
            System.out.print("Dag " + (i+1) + ": ");
            DailyPower.printPowerUsage(usage[i]);
            System.out.println();
            }
        }


    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        System.out.println("Månedlig kostnad (dag for dag): ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Dag " + (i + 1) + ": ");
            DailyPower.printPowerPrices(prices[i]);
            System.out.println();
            }
        }


    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        System.out.println("Total bruk: ");
        for (int i = 0; i < usage.length; i++) {
            DailyPower.computePowerUsage(usage[i]);
                sum += DailyPower.computePowerUsage(usage[i]);
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0;

        while(!exceeded && i < powerusage.length){
            for (int j = 0; j < powerusage[i].length; j++) {
                usage += powerusage[i][j];
            }
            if (usage > threshold){
                exceeded = true;
            }
            i++;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += prices[i][j]*usage[i][j];
            }
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                if (prices[i][j] > 0.5) {
                    support += (prices[i][j] - 0.5) * usage[i][j];
                }
            }
        }
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j]*0.5;
            }
        }

        return price;
    }
}