package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_2667 {
	
	static int arr[][];
    static boolean visited[][];
    static int N;
    static int count = 1;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1}; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		
		for(int i=0; i<N; i++){
			String[] str = br.readLine().split("");
			
			for(int j=0; j<N; j++)
				arr[i][j] = Integer.parseInt(str[j]);
		}
		
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {
					dfs(i,j);
					count++;
				}
			}
		}
		
		int ans[] = new int[count];

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] != 0)
					ans[arr[i][j]]++;
			}
		}
		
		Arrays.sort(ans);
		
		System.out.println(count-1);
		
		for(int i=1; i<ans.length; i++)
			System.out.println(ans[i]);
		
	}
	
	public static void dfs(int i, int j) {
		arr[i][j] = count;
		visited[i][j] = true;
		
		for(int k=0; k<4; k++) {
			int x = i+dx[k];
			int y = j+dy[k];
			
			if(x>=0 && x<N && y>=0 && y<N) {
				if(arr[x][y] == 1 && !visited[x][y])
					dfs(x,y);
			}
		}
	}
}
