package baekjoon;

import java.io.*;

public class java_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int front = 0;
		int rear = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
				case "pop" :
					//pop - 제일 앞 정수를 빼고 그 수를 출력, 없을 경우 -1 출력
					if(front == rear)
						sb.append("-1").append("\n");
					else
						sb.append(arr[front++]).append("\n");
					break;
				case "size" :
					//size: 큐에 들어있는 정수의 개수를 출력한다.
					sb.append(rear-front).append("\n");
					break;
				case "empty" :
					//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
					if(front == rear)
						sb.append("1").append("\n");
					else
						sb.append("0").append("\n");
					break;
				case "front" :
					//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(front == rear)
						sb.append("-1").append("\n");
					else
						sb.append(arr[front]).append("\n");
					break;
				case "back" :
					//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
					if(front == rear)
						sb.append("-1").append("\n");
					else
						sb.append(arr[rear-1]).append("\n");
					break;
				case "push" :
					//push X - 정수 X를 큐에 넣는다.
					arr[rear++] = Integer.parseInt(str[1]);
			}
		}
		System.out.println(sb);
	}

}
