package baekjoon;

import java.io.*;

public class java_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int top = 0;
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '(') {
					top++;
				}
				else if(str.charAt(j) == ')') {
					top--;
					if(top < 0) {
						break;
					}
				}
			}
			
			if(top == 0)
				System.out.println("YES");
			else if(top != 0)
				System.out.println("NO");
		}
	}

}
