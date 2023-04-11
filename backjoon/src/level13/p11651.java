package level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class p11651 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		List<Point> list = new ArrayList<>();

		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new p11651.Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
					
		}
		
		Collections.sort(list);
		
		for(int i=0;i<N;i++) {
			System.out.println(list.get(i).x+" "+list.get(i).y);
			
		}
	}

static class Point implements Comparable<Point>{
	int x, y;
    
    public Point(int x, int y){
    	this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
       return this.y;
    }
	public int compareTo(Point o) {
		if (this.y == o.y) {
			return this.x < o.x? -1:1;
		}
		return this.y < o.y? -1:1;
	}
//이부분 외우기
}

}