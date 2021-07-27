package inheritancehomework;

public class Instructor extends User{
	private String firstName;
	private String lastName;
	private String masterclass;
	private int ınstructorId;
	
	
	public Instructor() {
		
	}
	
	
	public Instructor(String firstName, String lastName, String masterclass, int instructorId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.masterclass = masterclass;
		ınstructorId = instructorId;
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
	public String getMasterclass() {
		return masterclass;
	}
	public void setMasterclass(String masterclass) {
		this.masterclass = masterclass;
	}
	public int getInstructorId() {
		return ınstructorId;
	}
	public void setInstructorId(int instructorId) {
		ınstructorId = instructorId;
	}
}
