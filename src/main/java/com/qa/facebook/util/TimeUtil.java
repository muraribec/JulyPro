package com.qa.facebook.util;

public class TimeUtil {
	
	//short wait
	//medium wait
	//long wait
	//Explicit wait---powerfull
	//Implicit wait--don't use
	//Fluent wait---1\2 sec polling
	
	public static void shortWait(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void mediumWait(){
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void longWait(){
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
