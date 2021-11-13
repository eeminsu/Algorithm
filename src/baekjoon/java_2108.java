package baekjoon;

import java.io.*;

public class java_2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] count = new int[8001];
		
		
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int center = 5000;
		int many = 5000;
		

		for(int i=0; i<N; i++) {
			int val = Integer.parseInt(br.readLine());
			
			sum += val;
			
			count[val + 4000]++;
			
			if(max < val) {
				max = val;
			}
			if(min > val) {
				min = val;
			}
			
		}
		
		int cnt = 0;
		int manyMax = 0;
		
		boolean state = false;
		
		for(int i = min+4000 ; i <= max + 4000; i++) {
			if(count[i] > 0) {
				if(cnt < (N+1)/2) {
					cnt += count[i];
					center = i - 4000;
				}
				
				if(manyMax < count[i]) {
					manyMax = count[i];
					many = i - 4000;
					state = true;
				}
				else if(manyMax == count[i] && state == true) {
					many = i-4000;
					state = false;
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(center);
		System.out.println(many);
		System.out.println(max - min);

	}

}
