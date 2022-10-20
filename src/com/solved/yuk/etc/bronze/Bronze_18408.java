package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int oneCount = 0, twoCount = 0;
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < input.length; i ++){
            if(Integer.parseInt(input[i]) == 1) oneCount++;
            else twoCount++;
        }
        bw.write(oneCount >= twoCount ? "1" : "2");


        bw.flush();
        br.close();
        bw.close();
    }
}
