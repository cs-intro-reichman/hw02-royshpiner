/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String r = "";                    //r for reverse
		for (int i = 0; i < s.length(); i++){
			r = s.charAt(i) + r;
		}
		System.out.println(r);
		System.out.println("The middle character is " + r.charAt(r.length()/2));	
	}
}
