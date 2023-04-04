package level07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2566 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int[][] arr = new int[10][10];
		int max = 0;
		int x = 1;
		int y = 1;

		for (int i = 1; i <=9; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 1; j <= 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j]) {
					max = arr[i][j];
					x = i;
					y = j;
				}
				
			}
		}

		System.out.println(max);
		System.out.print(x+" "+y);	

	}
}