package baekjoon;

import java.io.*;
import java.util.*;

public class java_10799 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<>();
		
		String str = br.readLine();
		int sum = 0;
		boolean state = false;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				state = false;
				st.push(str.charAt(i));
			}
			else if(state == false & str.charAt(i) == ')') {
				state = true;
				st.pop();
				sum += st.size();
			}
			else if(state == true & str.charAt(i) == ')') {
				st.pop();
				sum += 1;
			}
		}
		
		System.out.println(sum);
		
	}

}
