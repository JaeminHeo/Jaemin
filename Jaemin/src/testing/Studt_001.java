package testing;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Studt_001 {

	public static void main(String[] args) {
		System.out.println("4x + 5y = 60 �� ��� �ظ� ���ؼ� (x,y)�� ����ϱ�");
		// TODO Auto-generated method stub
		for(int i = 4; i<=40; i+=4) {
			
			for (int j =5; j<=50; j+=5) {
				if(i+j==60)
					System.out.println(i/4+ "," +j/5);
				}
			}
		}
	}


