package programmers;

import java.util.*;

public class programmers_wootecho_3 {

	public static void main(String[] args) {

	}
	
	public static int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        String[][] menuArr = new String[menu.length][5];

        HashMap<String, Integer> ingsMap = new HashMap<String, Integer>();
        HashMap<String, ArrayList<String>> menuMap = new HashMap<String,ArrayList<String>>();
        
        for(int i=0; i<ings.length; i++) {
        	StringTokenizer st = new StringTokenizer(ings[i], " ");
        	ingsMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        
        
        for(int i=0; i<menu.length; i++) {
        	ArrayList<String> list = new ArrayList<>();
        	
        	StringTokenizer st = new StringTokenizer(menu[i], " ");
        	int price = 0;
        	
        	menuArr[i][0] = st.nextToken();
        	menuArr[i][1] = st.nextToken();
        	menuArr[i][2] = st.nextToken();
        	
        	for(int j=0; j<menuArr[i][1].length(); j++) {
        		price += ingsMap.get(menuArr[i][1].charAt(j)+"");
        	}
        	menuArr[i][3] = String.valueOf(Integer.parseInt(menuArr[i][2]) - price);
        	list.add(menuArr[i][1]);
        	list.add(menuArr[i][2]);
        	list.add(menuArr[i][3]);
        	
        	menuMap.put(menuArr[i][0], list);
        }
        
        for(int i=0; i<sell.length; i++) {
        	ArrayList<String> list = new ArrayList<>();
        	
        	StringTokenizer st = new StringTokenizer(sell[i], " ");
        	String name = st.nextToken();
        	int cnt = Integer.parseInt(st.nextToken());
        	
        	list = menuMap.get(name);
        	
        	answer += Integer.parseInt(list.get(2)) * cnt;
        }

        
        
        return answer;
    }

}

