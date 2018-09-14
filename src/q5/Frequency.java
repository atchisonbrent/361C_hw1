package q5;

import java.util.concurrent.Callable;

public class Frequency implements Callable<Integer> {
    public static int parallelFreq(int x, int[] A, int numThreads) {
    	try {
    		
    		/* Sequential Solution */
//    		int ret = 0;
//    		for (int i = 0; i < A.length; i++) {
//    			if (x == A[i]) {
//    				ret++;
//    			}
//    		}
//    		
//    		return ret;
    		
    		/* Calculate work per thread */
    		int work = A.length / numThreads;
    		int remainder = A.length % numThreads;
    		
    		/* Start threads in loop */
    		// Potentially make array with each thread counting and setting values to own index
    		// Total up array values at the end
    		// Just need to figure out how shared arrays would work and assign threads integer identifiers
    		for (int i = 0; i < numThreads; i++) {
    			Frequency t = new Frequency();
    			t.start();
    			return 0;
    		}
    		
    		return 0;
    	}
    	catch (Exception e) {
    		return -1;	// Return -1 if invalid input
    	}
    }

	private void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
