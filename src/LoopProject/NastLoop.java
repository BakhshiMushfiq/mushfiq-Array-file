package LoopProject;

public class NastLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		

		
		
		
		for (int i = 0; i < grid[i].length; i++) {
			for (int j = 0; j < grid[j].length; j++) {
				System.out.print(grid[i][j]);
				
			}
			System.out.println();
		}
		int x = 6;
		for (int counter = 0;counter < x; counter++);
		System.out.println(counter);
		if (counter == 4) {
			break;
			
		}
	}

}
