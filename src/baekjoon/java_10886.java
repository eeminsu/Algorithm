package baekjoon;

import java.io.*;
import java.util.*;

public class java_10886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		
		for(int i=0; i<N; i++) {
			int vote = Integer.parseInt(br.readLine());
			if(vote == 1)
				a++;
			else if(vote == 0)
				b++;
		}
		
		if(a>b)
			System.out.println("Junhee is cute!");
		else if(b>a)
			System.out.println("Junhee is not cute!");
		
	}

}
