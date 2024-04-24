package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15340 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        String inputArr[];
        while (!"0 0".equals(input = br.readLine())){
            inputArr = input.split(" ");
            int x = Integer.parseInt(inputArr[0]);
            int y = Integer.parseInt(inputArr[1]);
            bw.write(Math.min(x * 30 + y * 40, Math.min(x * 35 + y * 30, x * 40 + y * 20))+"");
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
