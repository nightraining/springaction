package com.thit.impt;


public class SelectService {

	public void dosomething(Enums enums){
		switch (enums){
			case spring:
				System.out.println("spring");
				break;
			case mybatis:
				System.out.println("mybatis");
				break;
			default:
				System.out.println("other");
				break;
		}
	}
	
}
