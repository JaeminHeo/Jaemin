package testing;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			
			int num2 = (int)(Math.random()*6)+1;
			
			System.out.println(num1+","+num2);
			
			int num3 = num1+num2;
			if(num3==5) {
				break;
			}
		}
		System.out.println("두 정수의 합이 5라서 프로그램 종료.");
	}

}
