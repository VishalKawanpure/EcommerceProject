package com.login;

public class LoginException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String massage= "You cannot login";

	public LoginException(String massage ) {
		super(massage);
		//LoginException.massage = massage;
	}

	
	}
	


