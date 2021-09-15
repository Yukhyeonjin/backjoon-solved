package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]), num2 = Integer.parseInt(input[1]);
        bw.write(num1 + num2 + "\n");
        bw.write(num1 - num2 + "\n");
        bw.write(num1 * num2 + "\n");
        bw.write(num1 / num2 + "\n");
        bw.write(num1 % num2 + "\n");

        bw.flush();
        bw.close();
    }
}
