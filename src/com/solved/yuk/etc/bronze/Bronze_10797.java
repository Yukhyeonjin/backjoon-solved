package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10797 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int count = 0;
        for(int i = 0; i < input.length; i ++){
            if(N == Integer.parseInt(input[i])) count++;
        }
        bw.write(count+"");

        bw.flush();
        bw.close();
    }
}
