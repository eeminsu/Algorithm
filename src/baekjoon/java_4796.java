package baekjoon;

import java.io.*;

public class java_4796 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		
		while(true) {
			String[] str = br.readLine().split(" ");
			
			int L = Integer.parseInt(str[0]);
			int P = Integer.parseInt(str[1]);
			int V = Integer.parseInt(str[2]);
			
			if(L==0 & P==0 & V==0)
				break;
			
			int result = 0;
			
			if(V%P <= L) {
				result = (V/P)*L + V%P;
			} else {
				result = (V/P)*L + L;
			}
			
			sb.append("Case " + ++cnt + ": ").append(result).append("\n");
		}
		
		System.out.println(sb);
	}

}
