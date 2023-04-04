package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p10818 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]<min)min=arr[i];
			if(arr[i]>max)max=arr[i];
		}

		System.out.printf("%d %d",min, max);
		
		

	}
}
