
public class Interviews {
	
	// really shitty temporary fixes 
	public static void main(String[] args) {
		//loadBalancing();
		//System.out.println(islands(new int[10][]));
		//System.out.println(expandSearch(new int[10][], 0,0));
		expandSearch(new int[10][], 0,0);
		
	}
	
	public class Computer {
		private int id;
		
		public Computer(int id) {
			this.id = id;
		}
	}
	
	public class loadBalancer{
		
		public int[] computers = new int[500];
		
		public loadBalancer() {}
		
		public void addComputer(int computer_id) {
			computers[computers.length] = computer_id;
		}
		
		public void deleteComputer(int computer_id) {
			// search for the computer_id in the list and then return to default 0 
		}
		
		// Somewhat uniformally distributed selection of computer
		public Computer retrieveComputer() {
			// based on the length of the array, find a rnadom number and access that computer
			return new Computer(1);
		}
	}
	
	public static void loadBalancing() {
		/* Give it a task --> allocate to a computer
		 * Needs to store id of each computer
		 * easily add a computer + remove
		 * Task comes --> randomly allocate a computer to task 
		 * Request to retreive a random computer 
		 * computer MAX 500 
		 * */
		
		
		//retrieveComputer(); 
		
	}
	
	public static int islands(int[][] map) {
		
		int count = 0;
		
		for (int row = 0; row < map.length; row ++) {
			for (int col = 0; col < map[0].length; col++) {
				if (map[row][col] == 1) {
					expandSearch(map, row, col);
					count += 1;
				}
				
				map[row][col] = -1; 
			}
		}
		
		return count;
	}
	/**
	 *
	 *Experimenting with shitty overloading
	public static void expandSearch(int[][] map, int row, int col) {
		
	}
	
	public static int expandSearch(int[][] map, int row, int col) {
		return 20;
	}
	**/
	public static void expandSearch(int[][] map, int row, int col) {
		
	}

	

}


