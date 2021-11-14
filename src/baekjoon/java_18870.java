package baekjoon;

import java.io.*;
import java.util.*;

public class java_18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] tmp = arr.clone();
		
		Arrays.sort(arr);
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], cnt++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb.append(hmap.get(tmp[i])).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
