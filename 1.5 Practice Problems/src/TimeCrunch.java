public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int time = 839335;
        int numHours = time/3600;
        time = time % 3600;
        int numMinutes = time/60;
        time = time % 60;
        int numSeconds = time;
        System.out.println("Hours: " + numHours);
        System.out.println("Minutes: " +numMinutes);
        System.out.println("Seconds: " + numSeconds);
    }

}
