package baekjoon;

import java.io.*;

public class java_1789 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());
        long sum = 0;
        long N = 0;

        while(sum <= S){
            sum += ++N;
        }

        System.out.println(sum>S? N-1 : N);
    }
}