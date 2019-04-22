package workshops;

public class Workshop2 {
	public static void main(String[] args) {
		
		/*Leave a space for your scanner stuff (Input and Output)
		 * We u
		 * se a temporary int variable as our input n
		 * */
		
		/*Integer class has a cache of constant values (-128, 128) <- exclusive brackets
		 *This means that all the wrapper classes have single byte values that are stored in cache, so
		 *whenever you try to create a variable referencing that value, it is referencing the same object
		 *
		 *Specifically interning is only related to the smaller primitive numbers aswell as the String class 
		 **/
		int xprim = 1000;
		int yprim = 1000;
		System.out.println(xprim == yprim);
		
		int[] nums = new int[] {1000,2000};
		System.out.println(nums[0]==xprim);
		
		String test = "Hello";
		String[] words = new String[] {"Hello"};
		System.out.println(words[0] == test);
		
		Integer x = 1000;
		Integer y = 1000;
		Integer z = y;
		System.out.println(z==y);
		
		/*String comparisons...*/
		String word = "Hello my name is bob";
		String not = "Hello my name is bob";
		System.out.println(word == not);
		
		System.out.println(x==y);
		
		int n = 9;
		
		String COL_SEP = "|";
		String ROW_SEP = "-----";
		String INTERSECTION = "+";
		
		// Output the header
		String output = "   * ";
		for (int i = 0; i < n; i++) {
			output += String.format(COL_SEP + " %3d ", i + 1);
		}
		System.out.println(output);
		
		// Output your rows 
		for (int row = 0; row < n; row++) {
			output = ROW_SEP;
			for (int col = 0; col < n; col++) {
				output += INTERSECTION + ROW_SEP;
			}
			System.out.println(output);
			
			output = String.format(" %3d ", row + 1); 
			for (int col = 0; col < n; col++) {
				output += String.format(COL_SEP + " %3d ", (col + 1) * (row + 1));
			}
			System.out.println(output);
		}
		
		
	}
}
