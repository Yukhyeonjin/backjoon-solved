package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]),
                b = Integer.parseInt(input[1]);
            int max = a > b  ? a : b,
                min = a <= b ? a : b, mul = 1;
            while (true){
                if((max*mul) % min == 0) {
                    bw.write((max*mul)+"\n");
                    break;
                }
                mul++;
            }
        }

        bw.flush();
        bw.close();
    }
}
