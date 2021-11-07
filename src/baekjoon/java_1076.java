package baekjoon;

import java.io.*;

public class java_1076 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = new String[3];
		for(int i=0; i<3; i++) {
			input[i] = br.readLine();
		}
		
		long answer = ((choiceVal(input[0])*10)+choiceVal(input[1]))*multi(input[2]);
		
		System.out.println(answer);
	}
	
	public static long choiceVal(String str) {
		int val = 0;
		
		switch(str) {
		case "black" :
			val = 0;
			break;
		case "brown" :
			val = 1;
			break;
		case "red" :
			val = 2;
			break;
		case "orange" :
			val = 3;
			break;
		case "yellow" :
			val = 4;
			break;
		case "green" :
			val = 5;
			break;
		case "blue" :
			val = 6;
			break;
		case "violet" :
			val = 7;
			break;
		case "grey" :
			val = 8;
			break;
		case "white" :
			val = 9;
			break;
		}
		return val;
	}
	
	public static long multi(String str) {
		int val = 0;
		
		switch(str) {
		case "black" :
			val = 1;
			break;
		case "brown" :
			val = 10;
			break;
		case "red" :
			val = 100;
			break;
		case "orange" :
			val = 1000;
			break;
		case "yellow" :
			val = 10000;
			break;
		case "green" :
			val = 100000;
			break;
		case "blue" :
			val = 1000000;
			break;
		case "violet" :
			val = 10000000;
			break;
		case "grey" :
			val = 100000000;
			break;
		case "white" :
			val = 1000000000;
			break;
		}
		return val;
	}

}
