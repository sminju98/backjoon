package level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class p10814 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
		List<Member> list = new ArrayList<>();

		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Member(st.nextToken(),st.nextToken()));
					
		}
		
		Collections.sort(list);
        

		for(int i=0;i<N;i++) {
			System.out.println(list.get(i).getAge()+" "+list.get(i).getName());
					
		}
        return;
		
	}

static class Member implements Comparable<Member>{
	String age;
	String name;
    
    public Member(String age, String name){
    	this.age = age;
        this.name = name;
    }
    public String getAge(){
        return this.age;
    }

    public String getName(){
       return this.name;
    }
    @Override
	public int compareTo(Member o) {
    	return Integer.parseInt(getAge()) - Integer.parseInt(o.getAge());
        }
	}
//이부분 외우기
}
