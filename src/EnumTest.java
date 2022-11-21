import java.util.Arrays;

enum Day {
    SUNDAY("Weekends are best."),
    MONDAY("Mondays are bad."),
    TUESDAY("Midweek days are so-so."),
    WEDNESDAY("Midweek days are so-so."),
    THURSDAY("Midweek days are so-so."),
    FRIDAY("Fridays are better."),
    SATURDAY("Weekends are best.");

    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.message;
    }

    Day(String message) {
        this.message = message;
    }
}


public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    /*public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }*/

    public void tellItLikeItIs() {
        System.out.println(day);
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        System.out.println(Arrays.toString(Day.values()));
    }
}
