package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p5073 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int angle1 = Integer.parseInt(br.readLine());
		int angle2 = Integer.parseInt(br.readLine());
		int angle3 = Integer.parseInt(br.readLine());

		if(angle1==60&&angle2==60&&angle3==60) {System.out.print("Equilateral");
		return;}
		if((angle1+angle2+angle3==180)&&((angle1==angle2)||(angle3==angle1)||(angle3==angle2)))System.out.print("Isosceles");
		if((angle1+angle2+angle3==180)&&((angle1!=angle2)&&(angle3!=angle1)&&(angle3!=angle2)))System.out.print("Scalene");
		if(angle1+angle2+angle3!=180)System.out.print("Error");

	}

}