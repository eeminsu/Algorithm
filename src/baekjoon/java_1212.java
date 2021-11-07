package baekjoon;

import java.io.*;

public class java_1212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i< s.length(); i++) {
			String str = Integer.toBinaryString(s.charAt(i) - '0');
			
			if(str.length()==2 && i != 0)
				str = "0" + str;
			else if(str.length() == 1 && i != 0)
				str = "00" + str;
			
			sb.append(str);
		}
		
		System.out.println(sb);
	}
}
