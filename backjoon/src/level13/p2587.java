package level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p2587 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();

		int adv = 0;

		for (int i = 0; i < 5; i++) {
			list.add(Integer.parseInt(br.readLine()));
			adv += list.get(i);

		}
		adv /= 5;
		Collections.sort(list);
		System.out.println(adv);
		System.out.println(list.get(2));

	}

}
