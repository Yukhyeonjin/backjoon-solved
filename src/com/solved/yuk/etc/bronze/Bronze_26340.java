package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26340 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            bw.write("Data set: " + a + " " + b + " " + c + "\n");
            for(int j = 1; j <= c; j++) {
                if(a >= b) {
                    a = a / 2;
                }else if(a < b) {
                    b = b / 2;
                }
            }

            if(a > b) {
                bw.write(a + " " + b);
                bw.newLine();
            }else {
                bw.write(b + " " + a);
                bw.newLine();
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}