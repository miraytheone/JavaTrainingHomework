package inheritancehomework;

public class InstructorManager {
	public void givenCourse(Instructor course) {
		System.out.println("New " + course.getMasterclass() + " course added by instructor who name is " + course.getUserName());
	}
}
