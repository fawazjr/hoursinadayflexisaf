interface HoursCalculator {
    int standardDayHours();
    int calculateHours(int customHours);
}

class DayHours implements HoursCalculator {
    @Override
    public int standardDayHours() {
        return 24;
    }

    @Override
    public int calculateHours(int customHours) {
        return customHours;
    }
}

public class Main {
    public static void main(String[] args) {

        DayHours dayHours = new DayHours();

        System.out.println("Standard hours in a day: " + dayHours.standardDayHours());

    }
}