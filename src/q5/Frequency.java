package q5;

import java.util.concurrent.Callable;

public class Frequency implements Callable<Integer> {
    public static int parallelFreq(int x, int[] A, int numThreads) {
    	try {
    		
    		int ret = 0;
    		for (int i = 0; i < A.length; i++) {
    			if (x == A[i]) {
    				ret++;
    			}
    		}
    		
    		return ret;
    		
    		/* Calculate work per thread */
//    		int work = A.length / numThreads;
//    		int remainder = A.length % numThreads;
//    		
//    		/* Start threads in loop */
//    		for (int i = 0; i < numThreads; i++) {
//    			Thread t = new Thread();
//    			t.start();
//    			return 0;
//    		}
    	}
    	catch (Exception e) {
    		return -1;	// Return -1 if invalid input
    	}
    }

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
