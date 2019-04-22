
public class Strings {
	public static void main(String[] args) {
		
		/* Note for variable initialisations: You can use a variable 
		only in the block/scope that you defined it in... So if you 
		try to initialise without the data type, Java assumes that it is
		looking for a variable that has already been declared and initialised
		but since it doesn't exist yet, it will throw an error
		<Insert name> can not be resolved to a variable --> i.e can't find
		the variable*/
		String word = "testing";
		
		//slicing?? --> Substring, single arguments in substrings is same as python
		String shorter = word.substring(1);
		String supershort = word.substring(1, 2);

		//finding length
		int length = word.length();
		
		//upper/lowercase --> note this does not change the value of var. word
		String WORD = word.toUpperCase();
		
		/* split gives an array of Strings, you must explicitly tell it 
		 * which character/s to split it by
		 * 1.  If the character is at the ends of the string, it will have an 
		 * empty string where the character was
		 * 2. You cannot print the output of the split function in one go, you
		 * must iterate through the array of strings to print it out
		 * 3. length is an attribute of arrays, so checking the length is simple
		 * a process of accessing that attribute 
		 * */
		String[] split = word.split("t");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println(split);
		
		/* check substring presence
		 * */
		System.out.println(word.contains("te"));
		
		/* finding substring location
		 * 1. if the substring does not exist, the return value is -1
		 * */
		int position = word.indexOf("x");
		System.out.println("The position of the substring x is " + position);
		
		/*
		 * Formatting
		 * % - begins format specifier 
		 * 1$ - [Argument Index]
		 * +0 - [Flags] - [you can use more than one flag]!!!!!!
		 * 		'-' - result will be left justified
		 * 		'+' - result will always include a sign
		 * 		'#' - result should use a conversion-dependent alternate form
		 * 				- for o,x, X
		 *
		 * 20 - [Width]
		 * 1.0 - [Precision]
		 * f - [Conversion] - converting to a specific type, 
		 * */
		
		String s = String.format("%-#20x", 304);
		
		// the '<', means do what you just did on the left (as in take the same arg)
		System.out.format("%1$+d  %<05d\n", 10,20,9.0);
		System.out.println(s);
		
		printUsingSplit("Winter is Coming!", " ");
		printUsingSlicing("Winter isn't Coming!");
		formatPi(3.14159265);
		
	}
	
	public static void printUsingSplit(String text, String separator) {
		String[] words = text.split(separator);
		String middleWord = words[words.length/2];
		System.out.format(middleWord.toUpperCase() + "\n");
	}
	
	public static void printUsingSlicing(String text) {
		int begins = text.indexOf(" ") + 1;
		int ends = text.substring(begins).indexOf(" ");
		System.out.println(text.substring(begins, begins + ends));
	}
	
	public static void formatPi(double pi) {
		System.out.format("The value of 'pi' to four places is %09.4f", pi);
	}
}
