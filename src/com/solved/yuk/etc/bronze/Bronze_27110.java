package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 0;
        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]);
        sum = (N >= A ? A : N) + (N >= B ? B : N) + (N >= C ? C : N);
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
