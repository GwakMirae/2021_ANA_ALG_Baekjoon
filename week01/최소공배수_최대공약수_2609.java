import java.util.Scanner;

public class 최소공배수_최대공약수_2609 {
	public static int gcd(int A, int B) {
		if(B==0) return A;
		else return gcd(B, A%B);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = gcd(a,b);
		int d = a * b / c;
		System.out.println(c);
		System.out.println(d);
	}
}
