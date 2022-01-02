package baekjoon;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(Student o) {
		if(this.kor < o.kor)
			return 1;
		else if(this.kor == o.kor) {
			if(this.eng > o.eng)
				return 1;
			else if(this.eng == o.eng) {
				if(this.math < o.math)
					return 1;
				else if(this.math == o.math) {
					if(this.name.compareTo(o.name) > 0)
						return 1;
				}
			}
		}
		return -1;
	}
	
}

public class java_10825 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Student> list = new ArrayList<>();
		
		while(N-- > 0) {
			String[] str = br.readLine().split(" ");
			
			String name = str[0];
			int kor = Integer.parseInt(str[1]);
			int eng = Integer.parseInt(str[2]);
			int math = Integer.parseInt(str[3]);
			
			list.add(new Student(name, kor, eng, math));
		}
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i).name).append("\n");
		}
		
		System.out.println(sb);
	}

}
