public class Box {
    /* convention:
     * horizontal, THEN vertical
     */
    public String box(int r, int c) {
	//convention: horizontal, then vertical
	String boxy = "";
	int row=0;
	int col=0;
	while(row < r) {
	    while(col < c) {
		boxy+="*";
		col++;
	    }
	    boxy+="\n";
	    col=0;
	    row++;
	}
	return boxy;
    }
    
}
