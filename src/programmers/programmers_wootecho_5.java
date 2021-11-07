package programmers;

import java.util.*;

public class programmers_wootecho_5 {

	public static void main(String[] args) {
		String[][] test = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};
		System.out.println(solution(3.5,test));
	}
	
	public static String solution(double time, String[][] plans) {
        String answer = "";
        
        for(int i=0; i<plans.length; i++) {
        	int startTime = 0;
        	int landTime = 0;
        	
        	StringBuilder startSb = new StringBuilder();
        	StringBuilder endSb = new StringBuilder();
        	
        	for(int j=0; j<plans[i][1].length(); j++) {
        		if(plans[i][1].charAt(j) < 'A')
        			startSb.append(plans[i][1].charAt(j));
        	}
        	
        	if(plans[i][1].contains("PM")) {
        		startTime = (Integer.parseInt(startSb.toString()) + 12) * 60;
        	}
        	else {
        		startTime = Integer.parseInt(startSb.toString()) * 60;
        	}
        	
        	for(int j=0; j<plans[i][2].length(); j++) {
        		if(plans[i][2].charAt(j) < 'A')
        			endSb.append(plans[i][2].charAt(j));
        		
        	}
        	
        	if(plans[i][2].contains("PM")) {
        		landTime = (Integer.parseInt(endSb.toString()) + 12) * 60;
        	}
        	else {
        		landTime = Integer.parseInt(endSb.toString()) * 60;
        	}
        	
        	int minTime = (int)((time*10)/10) * 60;
        	if((int)((time*10)/10) > 0) {
        		minTime += 30;
        	}
        	
        	
        	if(startTime < 1080) {
        		minTime -= Math.abs(1080-startTime);
        	}
        	
        	if(landTime > 780) {
        		minTime -= Math.abs(780-landTime);
        	}
  
        	if(minTime > 0 ) {
        		answer = plans[i][0];
        	}
        		
        }
        
        return answer;
    }
	

}
