package baekjoon;

import java.io.*;

public class java_1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
		String str = "";
		
		while(true) {
			if(count == N) {
				System.out.println(num);
				break;
			}
			
			num++;
			str = num + "";
			
			if(str.contains("666")) {
				count++;
			}
		}

	}

}
