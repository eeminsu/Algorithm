package baekjoon;

import java.io.*;

public class java_1543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String word = br.readLine();
		
		int cnt = 0;
		
		while(true) {
			if(line.length() < word.length()) {
				break;
			}
			
			String tmp = line.substring(0,word.length());
			
			if(tmp.equals(word)) {
				cnt++;
				line = line.substring(word.length(), line.length());
			} else {
				line = line.substring(1, line.length());
			}
		}
		
		System.out.println(cnt);
		
	}

}
