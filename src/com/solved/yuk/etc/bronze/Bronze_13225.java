package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13225 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), input, count;
        for(int i = 0; i < N; i ++){
            input = Integer.parseInt(br.readLine());
            count = 0;
            for(int j = 1; j <= input; j ++){
                if(input % j == 0) count++;
            }
            bw.write(input + " " + count + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
