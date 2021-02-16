public class Main {
    public static void main(String[] args) {
        Course course = new Course("Matematika 1", 4);
        System.out.println("Sikerult letrehozni az orat!");

        Course c = new Course("Algebra",2);
        ScheduledCourse sc=new ScheduledCourse(c,4);

        System.out.println(c);
        System.out.println(sc);
    }
}
