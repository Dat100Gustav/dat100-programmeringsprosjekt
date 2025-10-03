package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) TODO Ferdig uten test TODO
    public static void printPowerPrices(double[] prices) {

        for (double price : prices){
            System.out.printf("%.2f kWh \n", price);
        }
    }

    // b) TODO Ferdig uten test TODO
    public static void printPowerUsage(double[] usage) {

        for(double usag : usage){
            System.out.printf("%.2f kWh \n", usag);
        }
    }

    // c) TODO Ferdig uten test TODO
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for(int i = 0; i < usage.length; i++){
            sum += usage[i];
        }
        return sum;
    }

    // d) TODO Ferdig uten test TODO
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        for (int i = 0; i < usage.length; i++){
            price += usage[i] * prices[i];
        }
        return price;
    }

    // e) // TODO Ferdig uten test TODO
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        price *= usage;

        if (price > THRESHOLD){
            support = (price - THRESHOLD) * PERCENTAGE;
        }
        return support;
    }

    // f) TODO Ferdig uten test TODO
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for(int i = 0; i < usage.length; i++){
            support += getSupport(usage[i], prices[i]);
        }
        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) TODO Ferdig uten test TODO
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (double usag : usage) {
            price += usag * NORGESPRIS_KWH;
        }
        return price;
    }

    // h) TODO Ferdig uten test TODO
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for(int i = 0; i < usage.length; i++){
            if (temp_max < usage[i]){
                temp_max = usage[i];
            }
        }
        return temp_max;
    }
    // i) TODO Ferdig uten test TODO
    public static double findAvgPower(double[] usage) {

        double average = 0;
        for(double time : usage){
            average += time
        }
        average = average/usage.length;

        return average;
    }
}