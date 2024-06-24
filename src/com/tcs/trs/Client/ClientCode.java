package com.tcs.trs.Client;

import com.tcs.trs.business.A;
import com.tcs.trs.execption.ABCException;

public class ClientCode {
	
	public static void main(String[] args) {
		
		System.out.println("ClientCode :: main()");
		
		for(int i=-2;  i<=2 ; i++) {
			try {
				A.process(i);
			} catch (ABCException e) {
				System.out.println("Error occor :: " + e.getMessage());
			}
		}
		
	}

}
