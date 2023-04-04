package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10101 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		while(true) {
		st = new StringTokenizer(br.readLine());
		int line1 = Integer.parseInt(st.nextToken());
		int line2 = Integer.parseInt(st.nextToken());
		int line3 = Integer.parseInt(st.nextToken());
		
		if(line1==0)return;

		if(line1>=line2+line3) {System.out.println("Invalid");continue;}
		if(line2>=line1+line3) {System.out.println("Invalid");continue;}
		if(line3>=line1+line2) {System.out.println("Invalid");continue;}
		
		if(line1==line2&&line2==line3) {System.out.println("Equilateral");
		continue;}
		if(line1==line2||line1==line3||line3==line2)System.out.println("Isosceles");
		if(line1!=line2&&line3!=line1&&line3!=line2)System.out.println("Scalene");
		
			
			
			
			
		}
		
		
		
		
		
	}

}