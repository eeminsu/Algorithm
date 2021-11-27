package baekjoon;

import java.io.*;

public class java_17087 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int S = Integer.parseInt(str[1]);
		
		int[] position = new int[N];
		
		String[] pos = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			position[i] = Math.abs(S-Integer.parseInt(pos[i]));
		}
		
		int gcd = position[0];
		
		for(int i=1; i<N; i++) {
			gcd = GCD(gcd,position[i]);
		}
		
		System.out.println(gcd);
		
	}
	
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a%b);
	}

}



// 잘못된 코드
/*
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String[] str = br.readLine().split(" ");

int min = 1000000000;
int N = Integer.parseInt(str[0]);
int S = Integer.parseInt(str[1]);

int[] position = new int[N+1];
position[N] = S;

String[] pos = br.readLine().split(" ");

for(int i=0; i<N; i++) {
	position[i] = Integer.parseInt(pos[i]);
}

Arrays.sort(position);

for(int i=0; i<position.length-1; i++) {
	int tmp = position[i+1] - position[i];
	if(min > tmp)
		min = tmp;
}

System.out.println(min);

}
*/