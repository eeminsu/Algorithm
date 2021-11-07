package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class java_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int val = 2;
		
		if(N == 1) {
			System.out.println(1);
		}
		else {
			while(val <= N) {
				val = val + (6*count);
				count++;
			}
			
			System.out.println(count);
		}

	}

}
