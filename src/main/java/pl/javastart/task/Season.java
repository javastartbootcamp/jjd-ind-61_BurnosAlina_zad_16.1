package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", "marzec", "kwiecień", "maj"),
    SUMMER("Lato", "czerwiec", "lipiec", "sierpień"),
    AUTUMN("Jesień", "wrzesień", "październik", "listopad"),
    WINTER("Zima", "grudzień", "styczeń", "luty");

    private final String namePl;
    private final String[] months;

    Season(String namePl, String... months) {
        this.namePl = namePl;
        this.months = months;
    }

    static Season getValueForSeason(String season) {
        Season[] values = Season.values();
        for (Season value : values) {
            if (value.getNamePl().equalsIgnoreCase(season)) {
                return value;
            }
        }
        throw new NoSuchSeasonException("Nie ma takiej pory roku.");
    }

    public String getNamePl() {
        return namePl;
    }

    public String[] getMonths() {
        return months;
    }
}