public class ScheduledCourse extends Course {
    private int start;

    public ScheduledCourse(String name, int duration, int start) {
        super(name,duration);
        this.start=start;
    }
    
    public int getStart() { return start; }
    public int getEnd() { return start + getDuration(); }
}
