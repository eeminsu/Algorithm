package baekjoon;

import java.io.*;
import java.util.*;

public class java_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int val : list) {
			sb.append(val).append("\n");
		}
		System.out.println(sb);
	}
	
	
	/*
	 * 합병정렬 구현
	public static void mergeSort(int[] data, int p, int r) {
		if(p<r) {
			int q = (p+r)/2;
			
			mergeSort(data, p, q);
			mergeSort(data, q+1, r);
			merge(data, p, q, r);
		}
	}
	
	public static void merge(int[] data, int p, int q, int r) {
		int i=p, j=q+1, k=p;
		int[] tmp = new int[data.length];
		
		while(i<=q && j<=r) {
			if(data[i] <= data[j])
				tmp[k++] = data[i++];
			else
				tmp[k++] = data[j++];
		}
		while(i<=q)
			tmp[k++] = data[i++];
		while(j<=r)
			tmp[k++] = data[j++];
		
		for(int l=p; l<=r; l++) {
			data[l] = tmp [l];
		}
	}
	*/

}
