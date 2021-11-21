package baekjoon;

import java.io.*;

public class java_10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N*2];
		int front = N;
		int rear = N;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
			case "push_front" : 
				arr[front--] = Integer.parseInt(str[1]);
				break;
			case "push_back" :
				arr[++rear] = Integer.parseInt(str[1]);
				break;
			case "pop_front" :
				if(front == rear)
					sb.append("-1").append("\n");
				else
					sb.append(arr[++front]).append("\n");
				break;
			case "pop_back" :
				if(front == rear)
					sb.append("-1").append("\n");
				else
					sb.append(arr[rear--]).append("\n");
				break;
			case "size" :
				sb.append(rear - front).append("\n");
				break;
			case "empty" :
				if(front == rear)
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
				break;
			case "front" :
				if(front == rear)
					sb.append("-1").append("\n");
				else
					sb.append(arr[front+1]).append("\n");
				break;
			case "back" :
				if(front == rear)
					sb.append("-1").append("\n");
				else
					sb.append(arr[rear]).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}

}
