package baekjoon;

import java.io.*;

public class java_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String val = br.readLine();
		int hap = 0;
		
		for(int i=0; i<N; i++) {
			char ch = val.charAt(i);
			hap += Integer.parseInt(Character.toString(ch));
		}
		
		System.out.println(hap);
		
	}

}
