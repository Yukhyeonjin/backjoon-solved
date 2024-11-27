package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11368 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input, inputArr[];
        while (!"0 0 0 0".equals((input = br.readLine()))) {
            inputArr = input.split(" ");
            int C = Integer.parseInt(inputArr[0]);
            int W = Integer.parseInt(inputArr[1]);
            int L = Integer.parseInt(inputArr[2]);
            int P = Integer.parseInt(inputArr[3]);
            if(C == 1) {
                bw.write("1\n");
            }
            else {
                int ans = 1;
    			int rep = W * L * P;
    			while (rep-->0) {ans *= C;}
                bw.write(ans+"\n");
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
