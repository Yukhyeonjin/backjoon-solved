package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4597 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"#".equals(input = br.readLine())){
            int oneCount = 0, zeroCount = 0;
            for (int i = 0; i < input.length()-1; i ++){
                char c = input.charAt(i);
                if(c == '0') {
                    zeroCount++;
                }
                else if(c == '1') {
                    oneCount++;
                }
            }
            char c = input.charAt(input.length()-1);
            if(c == 'e') { // 짝수 패리티
                if(oneCount == 0) c = '0';
                else if(oneCount % 2 == 0) c = '0';
                else if(oneCount % 2 == 1) c = '1';
            }
            else if(c == 'o') { // 홀수 패리티
                if(oneCount == 0) c = '1';
                else if(oneCount % 2 == 0) c = '1';
                else if(oneCount % 2 == 1) c = '0';
            }
            bw.write(input.substring(0,input.length()-1)+String.valueOf(c));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
