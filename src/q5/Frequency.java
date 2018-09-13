package q5;

import java.util.concurrent.Callable;

public class Frequency implements Callable<Integer> {
    public static int parallelFreq(int x, int[] A, int numThreads) {
    	try {
    		
    		/* Calculate work per thread */
    		int work = A.length / numThreads;
    		int remainder = A.length % numThreads;
    		
    		/* Start threads in loop */
    		for (int i = 0; i < numThreads; i++) {
    			Thread t = new Thread(new Runnable() {
    				
    				@Override
    				public void run() {
    					
    				}
    			});
    			t.start();
    			return 0;
    		}
    	}
    	catch (Exception e) {
    		return -1;	// Return -1 if invalid input
    	}
		return 0;
    }

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
