package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_1463 {

	public static int[] dp = new int[1000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Arrays.fill(dp, -1);
		int X = Integer.parseInt(br.readLine());
		dp[0] = 0;
		dp[1] = 0;
		
		System.out.println(rec(X));
		
	}
	
	public static int rec(int N) {
		
		if(dp[N] == -1) {
			if(N%6 == 0) {
				dp[N] = Math.min(rec(N-1), Math.min(rec(N/3), rec(N/2)))+1;
			}
			else if(N%3 == 0) {
				dp[N] = Math.min(rec(N/3), rec(N-1))+1;
			}
			else if(N%2 == 0) {
				dp[N] = Math.min(rec(N/2), rec(N-1))+1;
			}
			else {
				dp[N] = rec(N-1)+1;
			}
		}
		
		return dp[N];
	}

}
