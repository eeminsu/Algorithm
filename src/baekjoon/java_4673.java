package baekjoon;

public class java_4673 {

	public static void main(String[] args) {
		
		boolean chk[] = new boolean[10001];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<10001; i++) {
			int n = d(i);
			
			if(n<10001)
				chk[n] = true;
		}
		
		for(int i=0; i<10001; i++) {
			if(!chk[i]) {
				sb.append(i);
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static int d(int i) {
		int sum = i;
		int num = i;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		
		return sum;
	}
	
}
