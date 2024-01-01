/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	int T = Integer.parseInt(args[0]);
	int twoChildren = 0;
	int threeChildren = 0;
	int fourOrMoreChildren = 0;
	Double childrens = 0.0;

	for (int i=1;i<=T;i++){
		int num = 2;
		double child = Math.random();
		boolean boy = (child<=0.5);
		boolean girl = (child>0.5);
				while (boy){
			child = Math.random();
			if (child>0.5){
				break;
				}		
			num++;
		
	}
		if (num==2){			while (girl){
				child = Math.random();
				if (child>=0.5){
					break;
				}
				num++;	
			}
		}
		childrens += num; 
		if (num==2){
			twoChildren++;
		}
		else if (num==3) {
			threeChildren++;
		}
		else {
			fourOrMoreChildren ++;
		}
			
	}

	System.out.println("Average: " + childrens/T + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + twoChildren);
	System.out.println("Number of families with 3 children: " + threeChildren);	
	System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
	if (twoChildren >= threeChildren && twoChildren >= fourOrMoreChildren)
		System.out.println("The most common number of children is 2.");
	else if (twoChildren < threeChildren && threeChildren >= fourOrMoreChildren)
		System.out.println("The most common number of children is 3.");
	else
		System.out.println("The most common number of children is 4 or more.");



		
}
}
