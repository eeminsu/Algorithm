package baekjoon;

import java.io.*;

public class java_1977 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = B;
		
		for(double i=A; i<=B; i++) {
			int n = (int) Math.sqrt(i);
			if(n == Math.sqrt(i)) {
				if(min > (int)i)
					min = (int)i;
				sum += (int)i;
			}
		}
		
		if(sum >0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else if(sum == 0) {
			System.out.println(-1);
		}
	}

}
