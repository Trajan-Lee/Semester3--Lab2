package com.algonquin.loggy;


//Would probably use a generic listener interface in a larger program
public class CaptionListener {

	synchronized public void onTaskComplete(Recording rec, String ccFileReceived) {
		rec.setCcfile(ccFileReceived);
		System.out.println(ccFileReceived + " added");
	}
}
