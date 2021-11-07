package baekjoon;

import java.io.*;

public class java_8393 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int hap = 0;
		
		for(int i=0; i<N; i++) {
			hap += (i+1);
		}
		
		System.out.println(hap);
	}
}
