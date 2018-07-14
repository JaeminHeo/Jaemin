package test001;

public class WhileClass {
	public void whiletest1() {
		
		int line, space, star;
		
		for (line = 0; line < 4; line++) {
			for (space = 0; space <(4 - line); space++) {
				System.out.print(" ");
			}
			for (star= 0; star < (2 * line +1); star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (line = 5; line > 0; line--) {
			for (space = 0; space <(5 - line); space++) {
				System.out.print(" ");
			}
			for (star= 0; star < (2 * line -1); star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void whiletest2() {
		int line, space, star;
		for (line = 0; line <4; line++) {
			
			for (space = 0; space <(5-line) - 1; space++) {
				System.out.print(" ");
			}
			for (star =0; star < (2 * line + 1); star++) {
				if (star == 0 || star ==2 * line)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		for (star = 0; star < (2 * line + 1);star++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void whiletest3() {
		for(int a = 0 ; a <=5; a++) {
			System.out.println(a);
		}
	}
	public void whiletest4() {
		int apple =1;
		double piece = 0.1;
		int num = 7;
		
		double result = apple - num*piece;
		
		System.out.println(result);
	}
}		
