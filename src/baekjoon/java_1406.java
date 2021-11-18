package baekjoon;

import java.io.*;
import java.util.*;

public class java_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> list = new LinkedList<>();
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			list.add(String.valueOf(str.charAt(i)));
		}
		
		int N = Integer.parseInt(br.readLine());
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext())
			it.next();
		
		for(int i=0; i<N; i++) {
			String command = br.readLine();
			
			if(command.equals("L")) {
				if(it.hasPrevious())
					it.previous();
			}
			else if(command.equals("D")) {
				if(it.hasNext())
					it.next();
			}
			else if(command.equals("B")) {
				if(it.hasPrevious()) {
					it.previous();
					it.remove();
				}
			}
			else {
				StringTokenizer st = new StringTokenizer(command, " ");
				st.nextToken();
				it.add(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Object oj : list.toArray()) {
			sb.append(oj);
		}
		
		System.out.println(sb);
	}

}
