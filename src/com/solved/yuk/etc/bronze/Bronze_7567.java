package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        int answer = 10;
        for(int i = 1; i < input.length; i ++){
            if(input[i].equals(input[i-1])) answer+=5;
            else answer+=10;
        }
        bw.write(answer+"");

        bw.flush();
        bw.close();
    }
}
