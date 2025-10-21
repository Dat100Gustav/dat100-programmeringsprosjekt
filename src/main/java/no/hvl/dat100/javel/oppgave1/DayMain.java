package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // oppgave a)
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        // oppgave b)
        DailyPower.printPowerUsage(powerusage_day);

        // oppgave c)
        System.out.println(DailyPower.computePowerUsage(powerusage_day));

        // oppgave d)
        System.out.println(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));

        // oppgave e) og f)
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));

        // oppgave g)
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));

        // oppgave h)
        System.out.println(DailyPower.findPeakUsage(powerusage_day));

        // oppgave i)
        System.out.println(DailyPower.findAvgPower(powerusage_day));
    }
}
