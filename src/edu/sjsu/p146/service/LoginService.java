package edu.sjsu.p146.service;

public class LoginService {
	
	
	public LoginService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean loginUser(String username, String password){
		
		boolean status = false;
		if(username.equals("anjani") && password.equals("anjani")){
			status = true;
		}
		return status;		
		
	}
	

}
