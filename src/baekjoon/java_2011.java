package baekjoon;

import java.io.*;

public class java_2011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int DIV = 1_000_000;
		
		String str = br.readLine();
		int N = str.length();
		
		long[] dp = new long[N+1];
		
		dp[0] = dp[1] = 1;
		
		if(str.charAt(0) == '0')
			System.out.println(0);
		else if(str.charAt(N-1) =='0' && str.charAt(N-2) != '1' && str.charAt(N-2) != '2')
			System.out.println(0);
		else {
			for(int i=2; i<=N; i++) {
				int val = str.charAt(i-1) - '0';
				if(val > 0) dp[i] = dp[i-1] % DIV;
				
				val += (str.charAt(i-2) - '0') * 10;
				if(10<=val && val<=26) dp[i] = (dp[i]+dp[i-2]) % DIV;
			}
			System.out.println(dp[N]);
		}
	}
}
