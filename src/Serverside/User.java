package Serverside;

public class User {
	private String name;
	private String pass;
	
	public User(String nm, String ps){
		name = nm;
		pass = ps;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
