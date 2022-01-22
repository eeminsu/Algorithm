package baekjoon;

import java.io.*;

public class java_1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int oneCnt = 0;
		int zeroCnt = 0;
		
		for(int i=0; i<S.length()-1; i++) {
			if(S.charAt(i) == '1' && S.charAt(i+1) == '0') {
				oneCnt++;
			} else if(S.charAt(i) == '0' && S.charAt(i+1) == '1') {
				zeroCnt++;
			}
		}
		
		if(S.charAt(S.length()-1) == '1') {
			oneCnt++;
		} else if(S.charAt(S.length()-1) == '0') {
			zeroCnt++;
		}
		
		System.out.println(oneCnt <= zeroCnt? oneCnt : zeroCnt);
		
	}

}
