package com.tcs.trs.execption;

import com.tcs.trs.manager.ErrorManager;

public class ABCException extends Exception {
	
	private int code;
	
	public ABCException(String msg) {
		super(msg);
	}
	
	public ABCException(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		ErrorManager errorManagerObj = ErrorManager.getInstance();
		String message = errorManagerObj.getMessage(code);
		return message;
	}


}
