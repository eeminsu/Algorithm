package baekjoon;

import java.io.*;

public class java_15990 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long[][] dp = new long[100001][4];
		int div = 1_000_000_009;

		dp[1][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;

		for(int i=4; i<=100000; i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3])%div;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3])%div;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2])%div;
		}

		int N = Integer.parseInt(br.readLine());

		for(int i=0; i<N; i++) {
			int val = Integer.parseInt(br.readLine());
			
			long result = (dp[val][1] + dp[val][2] + dp[val][3])%div;
			
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
