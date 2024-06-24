package com.tcs.trs.business;

import com.tcs.trs.execption.ABCException;

public class B{
	
	public static void process(int x) throws ABCException{	
		System.out.println("B :: process() ");		
		C.process(x);
	}

}
