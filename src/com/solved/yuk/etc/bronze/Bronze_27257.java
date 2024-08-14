package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27257 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int cnt = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '0') cnt++;
        }
        for(int i = input.length() - 1; i != 0; i--){
            if(input.charAt(i) == '0') cnt--;
            else break;
        }

        bw.write(cnt+"");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}
