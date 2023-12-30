/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int nr = (int)(10 * Math.random());        //nr stands for new random 
		int r = 0;                        // r stands for random
		do{
		r = nr;
		System.out.print (r + " ");
		nr = (int)(10 * Math.random());   
		} while (nr >= r);
		System.out.println();	
	}
}
