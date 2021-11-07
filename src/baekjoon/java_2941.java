package baekjoon;

import java.io.*;

public class java_2941 {

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == 'c'){
                if(i < (str.length() - 1)){
                    if(str.charAt(i+1) == '='){
                        i++;
                    }
                    else if(str.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }

            else if(c == 'd'){
                if(i < (str.length() - 1)){
                    if(str.charAt(i+1) == 'z'){
                        if(i < (str.length() - 2)){
                            if(str.charAt(i+2) == '='){
                                i += 2;
                            }
                        }
                    }

                    else if(str.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }

            else if(c == 'l'){
                if(i < (str.length() - 1)){
                    if(str.charAt(i+1) == 'j'){
                        i++;
                    }
                }
            }

            else if(c == 'n'){
                if(i < (str.length() - 1)){
                    if(str.charAt(i+1) == 'j'){
                        i++;
                    }
                }
            }

            else if(c == 's'){
                if(i < (str.length() - 1)){
                    if(str.charAt(i+1) == '='){
                        i++;
                    }
                }
            }

            else if(c == 'z'){
                if(i < (str.length() - 1)){
                    if(str.charAt(i+1) == '='){
                        i++;
                    }
                }
            }

            count++;
        }

        System.out.println(count);
    }

}
