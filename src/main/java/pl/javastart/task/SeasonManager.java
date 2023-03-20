package pl.javastart.task;

import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        String season = getSeason(scanner);
        Season valueForSeason = Season.getValueForSeason(season);
        printMonthsForSeason(valueForSeason);
    }

    private void printMonthsForSeason(Season valueForSeason) {
        System.out.println("W tej porze roku są następujące miesiące:");
        String[] months = valueForSeason.getMonths();
        for (String month : months) {
            System.out.println(month);
        }
    }

    private String getSeason(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value.getNamePl());
        }
        return scanner.nextLine();
    }

}
