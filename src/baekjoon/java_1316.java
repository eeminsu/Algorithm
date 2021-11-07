package baekjoon;

import java.io.*;

public class java_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<N; i++) {
			char[] ch = br.readLine().toCharArray();
			boolean[] chk = new boolean[26];
			boolean state = false;
			
			for(int j=0; j<ch.length-1; j++) {
				if(chk[(int)ch[j]-97] || chk[(int)ch[j+1]-97]) {
					state = true;
					break;
				}
				else if(!chk[(int)ch[j]-97] && ch[j] != ch[j+1]) {
					chk[(int)ch[j]-97] = true;
				}
			}
			
			if(!state)
				count++;
		}
		
		System.out.println(count);
	}

}
