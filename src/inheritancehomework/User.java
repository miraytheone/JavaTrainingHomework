package inheritancehomework;

public class User {
	private String password;
	private String userName;
	
	public User() {
		
	}
	
	public User(String email, String phoneNumber, String password, String userName) {
		super();
		this.password = password;
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
