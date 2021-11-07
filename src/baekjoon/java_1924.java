package baekjoon;

import java.io.*;
import java.util.*;

public class java_1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		int hap =0;
		
		int monVal = Integer.parseInt(st.nextToken());
		int dayVal = Integer.parseInt(st.nextToken());
		

		for(int i=0; i<monVal-1; i++) {
			hap += month[i];
		}
		
		hap += dayVal;
		
		System.out.println(day[(hap%7)]);

	}

}
