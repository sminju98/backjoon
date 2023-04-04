package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10798 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[5][15];

		for (int i = 0; i <5; i++) {
			String line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				arr[i][j] = line.charAt(j);
				}
				
			}
		for (int i = 0; i <15; i++) {
			for (int j = 0; j <5; j++) {
				if((arr[j][i]<='9'&&arr[j][i]>='0')||(arr[j][i]<='z'&&arr[j][i]>='a')||(arr[j][i]<='Z'&&arr[j][i]>='A'))
						System.out.print(arr[j][i]);
				}
				
			}
		}
		


}