package programmers;

import java.util.ArrayList;

public class programmers_test {

	public static void main(String[] args) {
		int[] arr = {2,1,3,1,2,1};
		System.out.println(solution(arr));
		
	}
	
	public static int[] solution(int[] arr) {
        int[] cnt = {0,0,0};
        int[] answer = new int[3];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int tmp : arr) {
        	list.add(tmp);

        	if(tmp == 1)
        		cnt[0]++;
        	else if(tmp == 2)
        		cnt[1]++;
        	else if(tmp == 3)
        		cnt[2]++;
        }
        
        int max = 0;
        int index = 0;
        
        for(int i=0; i<cnt.length; i++) {
        	if(max < cnt[i]) {
        		max = cnt[i];
        		index = i;
        	}
        }
        
        
        for(int i=0; i<cnt.length; i++) {
        	while(cnt[index] > cnt[i]) {
        		list.add(i+1);
        		cnt[i]++;
        		answer[i]++;
        	}
        }
        
        
        return answer;
    }

}
