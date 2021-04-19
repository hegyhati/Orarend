package orarend;

public class Course {
    private String name;
    private int duration;

    public Course(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public String getName() { return name; }
    public int getDuration() { return duration; }

    @Override
    public String toString() { return name + " (" + duration + " ora)"; }
}
