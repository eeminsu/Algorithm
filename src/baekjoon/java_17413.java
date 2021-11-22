package baekjoon;

import java.io.*;
import java.util.*;

public class java_17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		Stack<Character> st = new Stack<>();
		boolean tagChk = false;
		
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '<') {
				tagChk = true;
				
				while(!st.isEmpty()) {
					sb.append(st.pop());
				}
				sb.append(str.charAt(i));
			}
			else if(str.charAt(i) == '>') {
				tagChk = false;
				
				sb.append(str.charAt(i));
			}
			else if(tagChk) {
				sb.append(str.charAt(i));
			}
			else if(!tagChk) {
				if(str.charAt(i) == ' ') {
					while(!st.isEmpty()) {
						sb.append(st.pop());
					}
					sb.append(str.charAt(i));
				}
				else {
					st.push(str.charAt(i));
				}
			}
			
		}
		
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		System.out.println(sb);
	}

}
