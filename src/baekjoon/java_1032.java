package baekjoon;

import java.io.*;

public class java_1032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = br.readLine();
		}
		
		char[] ch = str[0].toCharArray();
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length(); j++) {
				if(ch[j] == str[i].charAt(j))
					continue;
				else
					ch[j] = '?';
			}
		}
		System.out.println(String.valueOf(ch));
	}
}
