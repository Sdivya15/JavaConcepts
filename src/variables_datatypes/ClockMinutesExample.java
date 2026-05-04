package variables_datatypes;

//Imagine you are writing code for a clock . If you have a variable totalMinutes = 130,
// how could you use the modulo (%) operator to find out how many minutes are "left over"
// after accounting for full hours?


public class ClockMinutesExample {

    public static void main(String[] args) {
        int minsPerHour = 60;
        int totalMinutes = 130;

        int totalHours = totalMinutes / minsPerHour;

        System.out.println("Total hrs: " + totalHours);

        int minutes = totalMinutes % minsPerHour;

        System.out.println("Minutes: " + minutes);
    }
}
