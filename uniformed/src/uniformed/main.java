package uniformed;
import java.util.*;


public class main {

	public static void main(String[] args) {	
		System.out.println("123\n456\n78_");
		System.out.println("Please input a puzzle. e.g. 12345678_;");
	
		
		Scanner in = new Scanner(System.in);
		
		String puzzle = in.nextLine();
		PrintPuzzle(puzzle);
	}

	
	public static void PrintPuzzle(String puz){
		char[] chr = puz.toCharArray();
		int index = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(chr[index]);
				index++;

			}
			System.out.println();
		}
	}
	class INode{
		private String initial;

		public INode(String in){
			initial = in;
		}
		
		
		
	}
}
