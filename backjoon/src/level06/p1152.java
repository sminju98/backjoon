package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1152 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int max = 0;
		boolean many = false;
		
		int[] alp = new int[26];

		for(int i=0;i<word.length();i++) {
			
			
			if ((int)word.charAt(i)-(int)'a'<0) {
				alp[(int)word.charAt(i)-(int)'A']+=1;
			}
			
			else {
				alp[(int)word.charAt(i)-(int)'a']+=1;
				
			}

		}

		for(int i=1;i<26;i++) {
			if(alp[i]>alp[max]) {
				max=i;
				many = false;
			}
			else if(alp[i]==alp[max]) {
				many = true;
			}
		}
		
		if(many == true)System.out.print('?');
		else System.out.print((char)('A'+max));
			
		
	}
}
