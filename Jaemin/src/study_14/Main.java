package study_14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("몇 게임 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();
		
		int [][] arr = new int[game][6];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*45)+1;
				int k =0;
				while(k<j) {
					if(arr[i][j]==arr[i][k]) {
						arr[i][j]=(int)(Math.random()*45)+1;
						k=0;
						continue;
					}
					k++;
				}
			}
		}
		for(int i =0; i<arr.length; i++) {
			Arrays.sort(arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
