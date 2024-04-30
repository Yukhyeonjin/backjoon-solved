package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9699 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int max = 0;
            for(int j = 0; j < input.length; j++){
                max = Math.max(Integer.parseInt(input[j]), max);
            }
            bw.write("Case #"+ (i+1) + ": " + max);
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
