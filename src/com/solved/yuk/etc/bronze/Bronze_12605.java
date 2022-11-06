package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            bw.write("Case #"+(i+1)+": ");
            for(int j = input.length - 1; j >= 0; j --){
                bw.write(input[j]+" ");
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
