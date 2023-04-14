package level17;
import java.io.IOException;
import java.util.Scanner;

public class p10872 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		System.out.println(factorial(n));

	}

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
 
    }

	
}