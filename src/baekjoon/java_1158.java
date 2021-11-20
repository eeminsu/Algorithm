package baekjoon;

import java.io.*;
import java.util.*;

public class java_1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			q.offer(i+1);
		}
		
		while(q.size() > 0) {
			for(int i=0; i<K-1; i++) {
				q.offer(q.poll());
			}
			
			if(q.size() > 1)
				sb.append(q.poll()).append(", ");
			else
				sb.append(q.poll());
		}
		System.out.println("<" + sb + ">");
	}

}
