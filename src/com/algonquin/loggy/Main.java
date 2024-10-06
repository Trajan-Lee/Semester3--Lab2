/**
 * 
 */
package com.algonquin.loggy;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//should I instantiate the listener in the main or the spooler?
		CaptionListener ccListener = new CaptionListener();
		
		
		List<Recording> recordings = new LinkedList<Recording>();
		// Set the mock-up recordings.
		for (int i = 0; i < 15; i++) {
			String fileName = "Recording " + String.valueOf(i);
			Long fileSize = (long) (Math.random() * (1024L - 1L));
			recordings.add(new Recording(UUID.randomUUID(), fileName, fileSize));
		}

		// Enqueue recordings for closed captioning.
		CCSpooler spooler = new CCSpooler();
		recordings.forEach((recording) -> {
			spooler.enqueue(recording, ccListener);
		});
		spooler.shutdown();
	}

}
