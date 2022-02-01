package com.comcast.generalUtliity;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/***
	 * its used to generate random number upto 1000
	 * @return
	 */
	public int getRanDomNumber() {
		Random ranDom = new Random();
		int ranDomNum = ranDom.nextInt(1000);
		return ranDomNum;
	}
	/**
	 * its used to get the current System date & time
	 * @return
	 */
	public String getSystmeDate() {
		Date date = new Date();
		String systemDateAndTime = date.toString();
		return systemDateAndTime;
	}
	/**
	 * this method will return date in specified format
	 * @return
	 */
	public String getFinalDateFormat()
	
	{
		Date date=new Date();
		String d=date.toString();
		String[] dte=d.split(" ");
		String YYYY=dte[5];
		String DD=dte[2];
		String MM=dte[1];
		String today=YYYY+"-"+MM+"-"+DD;
		return today;
		
		
	}
   /**
     * used to pass Virtual Key to OS
     * @throws Throwable
     */
   /* public void pressVurtualEnterKey() throws Throwable {
    	
    	Robot rc=new Robot();
    	rc.keyPress(KeyEvent.VK_ENTER);
    	rc.keyRelease(KeyEvent.VK_ENTER);
    }*/


}
