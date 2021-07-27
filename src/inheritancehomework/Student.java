package inheritancehomework;

public class Student extends User {
	private String firstName;
	private String lastName;
	private int studentId;
	private String takenCourse;
	
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, int studentId, String takenCourse) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.takenCourse = takenCourse;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getTakenCourse() {
		return takenCourse;
	}
	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}
	
}
