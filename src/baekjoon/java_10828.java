package baekjoon;

import java.io.*;
import java.util.*;

public class java_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int top = -1;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			if(str.equals("pop")){
				if(top >= 0)
					System.out.println(arr[top--]);
				else if(top < 0) {
					System.out.println(-1);
				}
			}
			else if(str.equals("size")) {
				System.out.println(top+1);
			}
			else if(str.equals("empty")) {
				if(top == -1)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(str.equals("top")) {
				if(top >= 0)
					System.out.println(arr[top]);
				else if(top < 0)
					System.out.println(-1);
			}
			else {
				StringTokenizer st = new StringTokenizer(str, " ");
				
				st.nextToken();
				arr[++top] = Integer.parseInt(st.nextToken());
			}
		}
	}
}
