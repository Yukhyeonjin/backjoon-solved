package com.solved.yuk.etc.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver_1343 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine()
               , input[] = line.split("\\.");
        StringBuffer sb = new StringBuffer();
        boolean flag = true;
        for(int i = 0; i < input.length; i ++){
            int length = input[i].length();
            if(length != 0 && length % 4 != 0 && length % 2 != 0) {
                flag = false;
                break;
            }
            for(int j = 0; j < length;){
                if(length - j >= 4 && "XXXX".equals(input[i].substring(j,j+4))){
                    sb.append("AAAA");
                    j+=4;
                    continue;
                }
                else{
                    sb.append("BB");
                    j+=2;
                }
            }
            if(i != input.length - 1)sb.append(".");
        }
        if(flag) {
            String result = sb.toString();
            int resultLength = result.length();
            if(result.length() != line.length());
            for(int i = 0; i < line.length() - resultLength; i ++){
                result+=".";
            }
            bw.write(result);
        }
        else bw.write("-1");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
