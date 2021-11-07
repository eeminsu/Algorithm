package baekjoon;

import java.io.*;

public class java_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			if(i != 0 && i%10 == 0)
				System.out.println();
			System.out.print(str.charAt(i));
		}
	}

}
