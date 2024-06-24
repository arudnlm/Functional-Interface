package com.tcs.trs.business;

import com.tcs.trs.execption.ABCException;

public class C {
	
	public static void process(int x) throws ABCException{		
		System.out.println("C :: process() ");		
		int data = 0;	
		try {
			data = ((x*x)-1)/(x-1);
		} catch (ArithmeticException e) {
		   // e.printStackTrace();
		    throw new ABCException(1001);
		}
	}

}
