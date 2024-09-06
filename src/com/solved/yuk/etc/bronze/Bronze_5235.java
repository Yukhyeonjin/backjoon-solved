package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5235 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++){
            String[] input = br.readLine().split(" ");
            int oddSum = 0, evenSum = 0;
            for (int j = 1; j < input.length; j ++){
                if(Integer.parseInt(input[j]) % 2 == 0) evenSum += Integer.parseInt(input[j]);
                else oddSum += Integer.parseInt(input[j]);
            }
            if(evenSum > oddSum) bw.write("EVEN\n");
            else if(evenSum < oddSum) bw.write("ODD\n");
            else bw.write("TIE\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
