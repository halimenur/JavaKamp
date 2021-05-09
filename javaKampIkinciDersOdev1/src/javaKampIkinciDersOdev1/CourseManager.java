package javaKampIkinciDersOdev1;

public class CourseManager {
    public void addToCourse(Course course) {
    	System.out.println(course.name+" kursuna kaydedildiniz!");
    }
    
    public void advanceCourse(Course course) {
    	System.out.println(course.name+" kursunda ilerlemeniz %"+course.finish);
    }
    
}
