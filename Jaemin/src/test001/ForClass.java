package test001;

import java.util.Scanner;

public class ForClass {
	Scanner sc = new Scanner(System.in);
	public void fortest1() {
		int num,cnt = 0;
		int an = (int)(Math.random()*100) +1;
		
		System.out.println("숫자 추측 게임.");
		System.out.println("정수를 입력해 주세요!.");
		
		while (true) {
			System.out.println("> ");
			num = sc.nextInt();
			cnt++;
			if (num>an)
				System.out.println("Down!["+ cnt + "회 입력]");
			else if (num < an)
				System.out.println("Up!["+cnt+"회 입력]");
			else
				break;
		}
		
		System.out.println("축하합니다. 정답은 " + an + "입니다.");
		System.out.println("총 ["+cnt +"회 입력]하셨습니다.");
		
	}
	
	public void fortest2() {
		int num = 0,cnt = 0;

		int an = (int)(Math.random()*100) +1;
		
		System.out.println("숫자 추측 게임.");
		System.out.println("정수를 입력해 주세요!.");
		
		while (num != an) {
			System.out.println("> ");
			num = sc.nextInt();
			cnt++;
			if (num>an)
				System.out.println("Down!["+ cnt + "회 입력]");
			else if (num < an)
				System.out.println("Up!["+cnt+"회 입력]");
			else
				break;
			
			
		}
		System.out.println("축하합니다. 정답은 " + an + "입니다.");
		System.out.println("총 ["+cnt +"회 입력]하셨습니다.");
	}
	
	public void closeScanner() {
		sc.close();
	}
	
	public void fortest3() {
		int a =0;
		while (a<=5) {
			System.out.println(a);
			a++;
			
		}
		
	}
	
}
