package be.hackthefuture.pipboy3000markv;

import android.util.Base64;

public class User {

	private String email;
    private Base64 password;



	public User() {
    }

    public User(String email, Base64 password) {
		this.email = email;
		this.password = password;

	}
    
    public String getEmail() {
		return email;
	}
    
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Base64 getPassword() {
		return password;
	}
	
	public void setNaam(Base64 password) {
		this.password = password;
	}
	

    
}
