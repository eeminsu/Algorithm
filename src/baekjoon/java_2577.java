package baekjoon;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class java_2577 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		String inputStr = String.valueOf(input);
		
		for(int i=0; i<inputStr.length(); i++) {
			arr[inputStr.charAt(i) - '0']++;
		}
		
		for(int j=0; j<10; j++) {
			System.out.println(arr[j]);
		}
		
	}
}
