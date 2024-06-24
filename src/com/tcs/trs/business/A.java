package com.tcs.trs.business;

import com.tcs.trs.execption.ABCException;

public class A {
	
	public static void process(int x) throws ABCException{	
		System.out.println("A :: process() ");	
		B.process(x);
	}

}
