public class Code {
    public int[] ints(int n) {
	/** @param number of integers to jam in the thing
	 *  @return int[] of size n
	 */
	int[] toReturn = new int[n];
	for(int i=0; i<n; i++) {
	    toReturn[i] = i+1;
	}
	return toReturn;
    }
}
