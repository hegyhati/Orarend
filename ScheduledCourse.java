public class ScheduledCourse extends Course {
    private int start;

    public ScheduledCourse(String name, int duration, int start) {
        super(name,duration);
        this.start=start;
    }

    public ScheduledCourse(Course course, int start) {
        super(course.getName(), course.getDuration());
        this.start=start;
    }
    
    public int getStart() { return start; }
    public int getEnd() { return start + getDuration(); }

    @Override
    public String toString() { return getName() + " (" + getStart() + ":00 - " + getEnd() + ":00)"; }
}
