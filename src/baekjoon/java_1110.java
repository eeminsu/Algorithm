package baekjoon;

import java.io.*;

public class java_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int A = N;
		int count = 0;
		
		while(true) {
			N = ((N%10)*10) + ((N/10+N%10)%10);
			count++;
			
			if(N==A)
				break;
		}
		
		System.out.println(count);
	}
}
