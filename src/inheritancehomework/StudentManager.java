package inheritancehomework;

public class StudentManager {
	public void addedCourse(Student course) {
		System.out.println("New " + course.getTakenCourse() + " course taken by the student " + course.getUserName());
	}
}
