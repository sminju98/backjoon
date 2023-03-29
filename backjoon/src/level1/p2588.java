package level1;

import java.io.IOException;
import java.util.Scanner;

public class p2588 {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A * (B % 10));
			System.out.println(A * ((B % 100) / 10));
			System.out.println(A * (B / 100));
			System.out.println(A * B);
		}
	}

}
