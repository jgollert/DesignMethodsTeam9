
public class Credentials {
	
	private String userName;
	private String password;
	
	public Credentials (String _userName, String _password) {
		this.userName = _userName;
		this.password = _password;
	}
	
	public Credentials() {
		new Credentials(null,null);
	}

	public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }    
    
    //Checks if credentials are the same
    public boolean equals(Credentials c1) {
    	if (this.userName.equals(c1.userName) && this.password.equals(c1.password)) {
    		return true;
    	} else {
    		return false;
    	}
    }
	
}
