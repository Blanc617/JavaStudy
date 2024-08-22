package prac;

public class Lock {

	private String password;
	
	public Lock(String p) {
		password = p;
	}
	

	@Override
	public String toString() {
		return "Lock [password=" + password + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
