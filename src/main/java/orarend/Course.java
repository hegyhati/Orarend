package orarend;

/**
 * @author Mate Hegyhati
 * 
 * Simple class to represent an unscheduled course.
 */

public class Course {
    /**
     * This variable holds the name of the course.
     */
    private String name;
    /**
     * This variable holds its duration in hours.
     */
    private int duration;

    /**
     * This constructor creates an instance with the given parameters.  
     * @param name name of the course
     * @param duration duration of the course in hours
     */
    public Course(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    /**
     * Returns the name of the course
     * @return name of the course
     */
    public String getName() { return name; }
    /**
     * Returns the duration of the course in hours.
     * @return duration of the course in hours.
     */
    public int getDuration() { return duration; }

    /**
     * Provides a simple string conversion int he form @code{{name}({duration} ora)}
     */
    @Override
    public String toString() { return name + " (" + duration + " ora)"; }
}
