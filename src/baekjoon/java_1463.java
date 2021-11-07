package baekjoon;

import java.io.*;

public class java_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(X != 1) {
			if(X%3 == 0) {
				X /= 3;
				cnt++;
			}
			else if(X%2 == 0) {
				X /= 2;
				cnt++;
			}
			else if(X%3 != 0 && X%2 != 0) {
				X -= 1;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
