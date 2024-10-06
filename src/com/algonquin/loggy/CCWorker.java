package com.algonquin.loggy;


public class CCWorker implements Runnable {
	
	private CaptionListener ccListener;
	
	public void setCcListener(CaptionListener ccListener) {
		this.ccListener = ccListener;
	}
	
	Recording newrec;
	
	 public CCWorker(Recording newrec) {
	     this.newrec = newrec;
	 }
	
	 @Override
	 public void run() {
	     processClosedCaption();
	 }
	
	 private void processClosedCaption() {
	     try {
	    	 System.out.println("Sending " + newrec.getName() + " to cloud for closed caption processing");
	         Thread.sleep(newrec.getSize()*10);  // Simulating delay, up to ~10 seconds
	         ccListener.onTaskComplete(newrec, newrec.getName() + "cc");
	    	 System.out.println("Ending task: " + newrec.getName() + ", " +Thread.currentThread().getName());
	     } catch (InterruptedException e) {
	     }
	 }
	}
