package baekjoon;

import java.io.*;

public class java_1652 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int width = 0;
		int height = 0;
		
		char[][] str = new char[101][101];
		
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			
			for(int j=0; j<N; j++) {
				str[i][j] = input.charAt(j);
			}
			
			str[i][N] = 'X';
			str[N][i] = 'X';
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				if(str[i][j] == '.' && str[i][j+1] == '.' && str[i][j+2] == 'X' ){
					width++;
				}
				if(str[j][i] == '.' && str[j+1][i] == '.' && str[j+2][i] == 'X'){
					height++;
				}
			}
		}
		System.out.println(width + " " + height);
	}

}
