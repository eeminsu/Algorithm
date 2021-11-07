package baekjoon;

import java.io.*;

public class java_10101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] angle = new int[3];
		int sum = 0;
		
		for(int i=0; i<angle.length; i++) {
			angle[i] = Integer.parseInt(br.readLine());
			sum += angle[i];
		}
		
		if(angle[0] == 60 && angle[1] == 60 && angle[2] == 60)
			System.out.println("Equilateral");
		else if(sum == 180 && (angle[0] == angle[1] || angle[0] == angle[2] || angle[1] == angle[2]))
			System.out.println("Isosceles");
		else if(sum == 180 && (angle[0] != angle[1] && angle[0] != angle[2] && angle[1] != angle[2]))
			System.out.println("Scalene");
		else if(sum != 180)
			System.out.println("Error");
	}

}
