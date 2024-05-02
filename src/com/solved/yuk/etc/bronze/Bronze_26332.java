package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26332 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), sum, c, p;
        String[] input;
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            c = Integer.parseInt(input[0]);
            p = Integer.parseInt(input[1]);
            sum = p + (c-1)*(p-2);
            bw.write(input[0] + " " + input[1] + "\n" + sum);
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
