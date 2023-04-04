package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class p3052 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i <10; i++) {
			int num = Integer.parseInt(br.readLine());
			set.add(num%42);
		}//더하
		System.out.print(set.size());

	}
}
