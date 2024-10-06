package com.algonquin.loggy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class CCSpooler {


	    private ExecutorService spooler;

	    public CCSpooler() {
	        this.spooler = Executors.newFixedThreadPool(5);
	    }

	    // Add a new closed caption task
	    public void enqueue(Recording newrec, CaptionListener ccListener) {
	        CCWorker worker = new CCWorker(newrec);
	        worker.setCcListener(ccListener);
	        spooler.execute(worker);
	    }

	    // Shut down the spooler after processing all tasks
	    public void shutdown() {
	        
	        spooler.shutdown();
	        try {
	            // Wait for all tasks to finish execution for a maximum of 1 hour
	            if (!spooler.awaitTermination(60, TimeUnit.SECONDS)) {
	                spooler.shutdownNow();
	                System.err.println("Spooler did not terminate in the specified time.");
	            }
	        } catch (InterruptedException e) {
	            spooler.shutdownNow();
	            System.err.println("Spooler was interrupted during shutdown.");
	        }
	        System.out.println("Spooler has been shut down after all tasks were completed.");
	    }
	}
