package baekjoon;

import java.io.*;

public class java_15988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		final int MAX = 1_000_000;
		final int DIV = 1_000_000_009;
		
		long[] dp = new long[MAX+1];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<=MAX; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%DIV;
		}
		
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			int val = Integer.parseInt(br.readLine());
			
			sb.append(dp[val]%DIV).append("\n");
		}
		
		System.out.print(sb);
		
	}

}
