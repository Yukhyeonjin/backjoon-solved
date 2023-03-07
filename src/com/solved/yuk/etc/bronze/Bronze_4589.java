package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input;
        bw.write("Gnomes:\n");
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            if((Integer.parseInt(input[0]) >= Integer.parseInt(input[1]) &&
                Integer.parseInt(input[1]) >= Integer.parseInt(input[2])) ||
                Integer.parseInt(input[0]) <= Integer.parseInt(input[1]) &&
                Integer.parseInt(input[1]) <= Integer.parseInt(input[2])) {
                bw.write("Ordered\n");
            } else bw.write("Unordered\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
