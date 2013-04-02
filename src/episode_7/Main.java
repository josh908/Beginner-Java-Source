package episode_7;

public class Main 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		boolean b1, b2, b3, b4;
		
		// Conditional AND
		b1 = (5 > 1) && (3 > 4);  	//false
		b2 = (1 < 2) && (10 > 6);	//true
		
		System.out.println(b1);
		System.out.println(b2);
		
		// Conditional OR
		b3 = (3 < 5) || (5 > 6);	// true
		b4 = (5 < 1) || (9 > 10);	// false
		
		System.out.println(b3);
		System.out.println(b4);
	}
}
