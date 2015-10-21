
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
	
}
