/*
 * 백준 - 팩토리얼
 */

package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class java_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
	}
	
	public static int factorial(int N) {
		if(N == 0) {
			return 1;
		}
		
		return N * factorial(N-1);
	}

}
