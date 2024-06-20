package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18918 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        int A = 0;
        int B = 0;
        for(int i = 0; i < input.length;){
            if("A".equals(input[i])) {
                A += Integer.parseInt(input[i+1]);
            }
            else if("B".equals(input[i])) {
                B += Integer.parseInt(input[i+1]);
            }
            i+=2;
        }
        bw.write(A > B ? "A" : "B");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

