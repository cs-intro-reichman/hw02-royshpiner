
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int num = 2;
		double child = Math.random();
		boolean boy = (child<=0.5);
		boolean girl = (child>0.5);
				while (boy){
			System.out.print("b ");
			child = Math.random();
			if (child>0.5){
				System.out.println("g");
				System.out.println("You made it... and you now have " + num + " children.");
				break;
				}		
			num++;
		
	}
		if (num==2){			while (girl){
				System.out.print("g ");
				child = Math.random();
				if (child>=0.5){
					System.out.println("b");
					System.out.println("You made it... and you now have " + num + " children.");
					break;
				}
				num++;	
			}
		}			
	}
}
