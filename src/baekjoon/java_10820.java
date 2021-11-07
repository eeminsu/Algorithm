package baekjoon;

import java.io.*;

public class java_10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		while((str=br.readLine()) != null) {
			
			int A = 0;
			int B = 0;
			int C = 0;
			int D = 0;
			
			for(int i=0; i<str.length(); i++) {
				if(65 <= str.charAt(i) && str.charAt(i) <= 90)
					A++;
				else if(97 <= str.charAt(i) && str.charAt(i) <= 122)
					B++;
				else if(48 <= str.charAt(i) && str.charAt(i) <= 57)
					C++;
				else if(str.charAt(i) == 32)
					D++;
			}
			
			System.out.println(B + " " + A + " " + C + " " + D);
		}
	}

}
