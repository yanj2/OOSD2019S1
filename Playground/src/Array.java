import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		
		
		/* This method of initialising arrays means that they end up pointing at the same object ....
		 * pointers and shit remember????
		 * <type>[] var = new <type>[<size>];
		 * <type>[] var2 = var;
		 * */
		int[] nums = new int[] {1,5,2,6,3,7};
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		/*Arrays have their length stored as an attribute
		 * */
		System.out.println(nums.length);
		
		/*STATIC METHODS*/
		
		/*You can easily print out the contents of an array without needing to access each elem
		 * You need to import the java utilities arrays though 
		 * */
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		
		/*You can also use this method to adjust the length of your array*/
		int[] copy = Arrays.copyOf(nums, nums.length + 2);
		
		/*If the length of the new array you copy is less than that original size, then you would 
		 * only get the first n values, whatever you specify n to be
		 * If you tell it to copy it to an array of greater length, the values afterwards will be initialised to 0
		 * You can also use .clone() which just does a deep copy of everything in your array*/
		System.out.println(Arrays.toString(copy));
		int x = 1;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] == x);
		}
		
	}
}
