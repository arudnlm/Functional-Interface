package com.tcs.trs.manager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ErrorManager {
	
	private static  ErrorManager obj = new ErrorManager();
	private static Properties prop = null;
	
	static {		
		prop = new Properties();
		InputStream is = ErrorManager.class.getResourceAsStream("/com/tcs/trs/data/error.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private ErrorManager() {	
	}
	
	public static ErrorManager getInstance() {
		return obj;
	}
	
	public String getMessage(int code) {
		return prop.getProperty(code+"");
	}
	

}
