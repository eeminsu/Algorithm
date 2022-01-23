package baekjoon;

import java.io.*;

public class java_15904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int index = 0;
		
		char[] result = {'U', 'C', 'P', 'C'};
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == result[index]) {
				index++;
			}
			if(index == 4) {
				break;
			}
			
		}
		
		if(index == 4) {
			System.out.println("I love UCPC");
		} else {
			System.out.println("I hate UCPC");
		}
	}

}
