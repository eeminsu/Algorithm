package baekjoon;

import java.io.*;

public class java_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int index = 0;
		int count = 0;
		
		str = str.toUpperCase();
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - 65]++;
		}
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i])
				count++;
		}
		
		if(count >1)
			System.out.println("?");
		else
			System.out.println((char)(index+65));
		
	}

}
