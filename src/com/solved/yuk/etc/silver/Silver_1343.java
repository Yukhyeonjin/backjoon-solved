package com.solved.yuk.etc.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver_1343 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] input = line.split("\\.");
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i = 0; i < input.length; i ++){
            int length = input[i].length();
            if(length % 2 != 0) {
                flag = false;
                break;
            }
            for(int j = 0; j < length;){
                if(length - j >= 4 && "XXXX".equals(input[i].substring(j,j+4))){
                    sb.append("AAAA");
                    j+=4;
                }
                else{
                    sb.append("BB");
                    j+=2;
                }
            }
            if(i != input.length - 1)sb.append(".");
        }
        if(flag) {
            StringBuilder result = new StringBuilder(sb.toString());
            int resultLength = result.length();
            for(int i = 0; i < line.length() - resultLength; i ++){
                result.append(".");
            }
            bw.write(result.toString());
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
