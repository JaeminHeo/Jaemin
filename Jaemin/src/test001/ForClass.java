package test001;

import java.util.Scanner;

public class ForClass {
	Scanner sc = new Scanner(System.in);
	public void fortest1() {
		int num,cnt = 0;
		int an = (int)(Math.random()*100) +1;
		
		System.out.println("���� ���� ����.");
		System.out.println("������ �Է��� �ּ���!.");
		
		while (true) {
			System.out.println("> ");
			num = sc.nextInt();
			cnt++;
			if (num>an)
				System.out.println("Down!["+ cnt + "ȸ �Է�]");
			else if (num < an)
				System.out.println("Up!["+cnt+"ȸ �Է�]");
			else
				break;
		}
		
		System.out.println("�����մϴ�. ������ " + an + "�Դϴ�.");
		System.out.println("�� ["+cnt +"ȸ �Է�]�ϼ̽��ϴ�.");
		
	}
	
	public void fortest2() {
		int num = 0,cnt = 0;

		int an = (int)(Math.random()*100) +1;
		
		System.out.println("���� ���� ����.");
		System.out.println("������ �Է��� �ּ���!.");
		
		while (num != an) {
			System.out.println("> ");
			num = sc.nextInt();
			cnt++;
			if (num>an)
				System.out.println("Down!["+ cnt + "ȸ �Է�]");
			else if (num < an)
				System.out.println("Up!["+cnt+"ȸ �Է�]");
			else
				break;
			
			
		}
		System.out.println("�����մϴ�. ������ " + an + "�Դϴ�.");
		System.out.println("�� ["+cnt +"ȸ �Է�]�ϼ̽��ϴ�.");
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
