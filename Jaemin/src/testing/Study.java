package testing;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=0; i<=100; i++) {
			
			if(i%3 !=0) {
			
			continue;
			}
			sum += i;
		}
		System.out.println("1~100까지중 3의 배수의 합:"+sum);
	}

}
