public class Time {
    private int minutesSinceMidnight;

    public Time(int minutesSinceMidnight){
        this.minutesSinceMidnight = minutesSinceMidnight;
    }

    public Time(int hours, int minutes){
        this.minutesSinceMidnight=60*hours+minutes;
    }

    public int getHours() {
        return this.minutesSinceMidnight / 60;
    }
    public int getMinutes() {
        return this.minutesSinceMidnight % 60;
    }

    public boolean isBeforeNoon(){
        return true;
    }

}
