package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++) {
            String[] input = br.readLine().split(" ");
            int firstNum = Integer.parseInt(input[0]), secondNum = Integer.parseInt(input[1]);
            bw.write(firstNum + secondNum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
