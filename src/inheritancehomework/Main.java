package inheritancehomework;

public class Main {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.setFirstName("Mİray");
		student.setLastName("Çakır");
		student.setStudentId(1);
		student.setTakenCourse("Java/React");
		student.setUserName("miraycakir");
		student.setPassword("759632");
 
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInstructorId(1);
		instructor.setMasterclass("Coding");
		instructor.setUserName("engindemirog");
		instructor.setPassword("94654");
		
		UserManager usermanager = new UserManager();
		usermanager.add(student);
		usermanager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addedCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.givenCourse(instructor);
	}

}
