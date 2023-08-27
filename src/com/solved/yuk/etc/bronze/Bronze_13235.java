package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_13235 {
    public static void main(String ... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        boolean result = true;


        //팰린드롬 검사
        for(int idx= 0; idx<str.length()/2; idx++){
            if(str.charAt(idx) == str.charAt(str.length()-idx-1)){
                continue;
            }else{
                result = false;
            }
        }//end of for

        System.out.println(result);
    }//end of main
}//end of class
