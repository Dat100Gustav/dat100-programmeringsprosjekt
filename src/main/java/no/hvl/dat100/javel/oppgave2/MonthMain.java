package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //Oppgave a)
        MonthlyPower.print_PowerUsage(MonthPowerData.powerusage_month);

        //Oppgave b)
        MonthlyPower.print_PowerPrices(MonthPowerData.powerprices_month);

        //Oppgave c)
        System.out.printf("%.2f KWh", MonthlyPower.computePowerUsage(MonthPowerData.powerusage_month));

        //Oppgave d)
        System.out.printf("Har du oversteget månedlig grense (true, false): %b", MonthlyPower.exceedThreshold(MonthPowerData.powerusage_month, 1000));


        //Oppgave e)
        System.out.printf("Med norgespris skal du betale: %.2f NOK", MonthlyPower.computeNorgesPrice(MonthPowerData.powerusage_month));

        //Oppgave f)
        System.out.printf("Månedlig støtte ved norgespris: %.2f kr", MonthlyPower.computePowerSupport(MonthPowerData.powerusage_month, MonthPowerData.powerprices_month));

        //Oppgave g)
        System.out.printf("Din pris ved norgespris: %.2f kr", MonthlyPower.computeNorgesPrice(MonthPowerData.powerusage_month));

    }
}