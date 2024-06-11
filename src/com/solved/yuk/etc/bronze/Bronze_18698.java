package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18698 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            String[] input = br.readLine().split("");
            int result = 0;
            for (int j = 0; j < input.length; j++){
                if("D".equals(input[j])) break;
                result++;
            }
            bw.write(result+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
