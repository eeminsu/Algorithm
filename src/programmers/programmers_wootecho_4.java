package programmers;

import java.util.*;

public class programmers_wootecho_4 {

	public static void main(String[] args) {
		System.out.println(solution("aaabbaaa"));
	}
	
	public static int[] solution(String s) {
		ArrayList<Integer> list = new ArrayList<>();
       
        
        
        for(int i=0; i<s.length()-1; i++) {
        	int cnt = 1;
        	
        	for(int j=i; j<s.length()-1; j++) {
            	
            	if(s.charAt(j) == s.charAt(j+1)) {
            		cnt++;
            		i++;
            	}
            	else
            		break;
            }
        	
        	System.out.println(cnt);
        	list.add(cnt);
        }
                
        if(s.charAt(0) == s.charAt(s.length()-1)) {
        	int a = list.get(0);
        	int b = list.get(list.size()-1);
        	
        	list.remove(list.size()-1);
        	list.add(a+b);
        }
        
        int[] answer = new int[list.size()];
        int size = 0;
        for(int tmp : list) {
        	answer[size++] = tmp;
        }
        
        Arrays.sort(answer);
        
        
        return answer;
    }

}
