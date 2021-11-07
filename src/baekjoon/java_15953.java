package baekjoon;

import java.io.*;
import java.util.*;

public class java_15953 {
	
	public static int[] money2017 = {500, 300, 200, 50, 30, 10};
	public static int[] rankCnt2017 = {1,2,3,4,5,6};
	public static int[] money2018 = {512, 256, 128, 64, 32};
	public static int[] rankCnt2018 = {1,2,4,8,16};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			moenyCnt(A,B);
		}

	}
	
	public static void moenyCnt(int rank2017, int rank2018) {
		
		int cntSum = 0;
		int mon2017 = 0;
		int mon2018 = 0;
		
		for(int i=0; i< rankCnt2017.length; i++) {
			cntSum += rankCnt2017[i];
			if(rank2017 > 0 && rank2017 <= cntSum) {
				mon2017 = money2017[i];
				break;
			}
		}
		
		cntSum = 0;
		for(int i=0; i< rankCnt2018.length; i++) {
			cntSum += rankCnt2018[i];
			if(rank2018 > 0 && rank2018 <= cntSum) {
				mon2018 = money2018[i];
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append((mon2017 + mon2018)*10000);
		
		System.out.println(sb.toString());
	}

}
