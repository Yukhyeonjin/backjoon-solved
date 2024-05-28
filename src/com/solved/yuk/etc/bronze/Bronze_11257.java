package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11257 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);
            int z = Integer.parseInt(input[3]);
            int sum = x + y + z;
            bw.write(input[0] + " " + sum + " ");
            if(sum >= 55 && (double)x/35 >= 0.3 && (double)y/25 >= 0.3 && (double)z/40 >= 0.3) bw.write("PASS\n");
            else bw.write("FAIL\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
