import java.util.*;

public class Code {
    Random rand = new Random();
    public int[] ints(int n) {
	/** @param number of integers to jam in the thing
	 *  @return int[] of size n
	 */
	int[] toReturn = new int[n];
	for(int i=0; i<n; i++) {
	    toReturn[i] = 75+rand.nextInt(75);
	}
	return toReturn;
    }
}
