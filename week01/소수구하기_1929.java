import java.util.Scanner;

public class 소수구하기_1929 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		int[] check = new int[max+1];
		for (int i=0; i<check.length; i++) {
			check[i] = 0;
		}
		check[0] = check[1] = 1;
		
		for(int i=2; i<=max; i++) {
			for(int j= 2; i*j <= max; j++) {
				check[i*j] = 1;
			}
		}
		for(int i=min; i<= max; i++) {
			if(check[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
