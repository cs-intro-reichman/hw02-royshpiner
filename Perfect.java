/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int a = 1;
		String s = "1";
		for (int i = 2; i <= N/2; i++){
			if (N%i==0){
				s = s + " + " + i;
				a = a + i;
			}		
		

		}
		if (a==N)	
			System.out.println(N + " is a perfect number since "+ N + " = "+s);
		else
			System.out.println(N + " is not a perfect number");
}		
}
