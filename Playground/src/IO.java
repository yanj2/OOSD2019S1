import java.util.Scanner;


public class IO {
	public int x;
	public double y;
	public String why;
	public boolean idk;
	public int[] lst;
	public char c;
	public static String n;
	
	public static void main(String[] args) {
		
		/**
		IO test = new IO(2);
		System.out.println(test.x + test.why + test.y + test.idk);
		System.out.println(test.lst);
		System.out.println(test.c);
		System.out.println(IO.n);
		call();
		test.printDetails();
		int x = 1;
		double y = x;
		int c = (int) y;
		**/
		
		// the args in the main function gives the command line arguments as you saw them in C
		// if you want to have multiword strings, as in to treat everything in the commandline as if it were a single string
		// make sure to use double quotes around all of them 
		
		final int N_OPTIONS = 3;
		final int ORIGINAL = 0;
		final int NEW = 1;
		final int OTHER = 2;
		int results[] = new int[N_OPTIONS];
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String word = scanner.next();
		String other = scanner.next();
		System.out.format("%3d %s", num, word);
		
		/*
		while (scanner.hasNextInt()) {
		int vote = scanner.nextInt();
		results[vote] += 1;
		}
		*/
		
		System.out.println("Original Trilogy: " + results[ORIGINAL]);
		System.out.println("New Trilogy: " + results[NEW]);
		System.out.println("Other Trilogy: " + results[OTHER]);
		System.out.print("This line prints just the text without the newline at the end");
		
		
	}
	
	public IO(int x) {
		this.x = x;
	}
	
	public void printDetails() {
		System.out.println(x + y + why + idk + lst);
		System.out.println(n);
	}
	
	public static void call() {
		System.out.println(n);
//		for (int i = 0; i < 10; i++) {
//			
//		}
//		System.out.println(i);
		
		
		
		return;
	}
}
