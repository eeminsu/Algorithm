package programmers;

import java.util.*;

public class programmers_wootecho_2 {

	public static void main(String[] args) {
		String[] test = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
		System.out.println(solution(test));
	}
	
	public static String solution(String[] log) {
        String answer = "";
        
        String start = "";
        String end = "" ;
        
        int hour = 0;
        int minute = 0;
        int time = 0;
        
        for(int i=0; i<log.length; i += 2) {
        	start = log[i];
        	end = log[i+1];
        	
        	StringTokenizer startSt = new StringTokenizer(start, ":");
        	StringTokenizer endSt = new StringTokenizer(end, ":");
        	
        	int startStHour = Integer.parseInt(startSt.nextToken());
        	int startStMin = Integer.parseInt(startSt.nextToken());
        	int endStHour = Integer.parseInt(endSt.nextToken());
        	int endStMin = Integer.parseInt(endSt.nextToken());
        	
        	int startTime = (startStHour * 60) + startStMin;
        	int endTime = (endStHour*60) + endStMin;
        	
        	
        	if((endTime - startTime)>=5) {
        		int runTime = endTime - startTime;
        		
        		if(runTime>105)
        			runTime = 105;
        		
        		time += runTime;
        	}
        	
        }
        
        hour = time/60;
        minute = time%60;
        
        String hourStr = String.valueOf(hour);
        String minuteStr = String.valueOf(minute);
        
        answer = changeStr(hourStr) + ":" + changeStr(minuteStr);
        
        return answer;
    }
	
	public static String changeStr(String str) {
		if(str.length() < 2) {
			String re = "0" + str;
			return re;
		}
		else
			return str;
	}

}
