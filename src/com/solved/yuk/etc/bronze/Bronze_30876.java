package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30876 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input; int minX = 1001, minY = 1001;
        for (int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            if(minY > y) {
                minY = y;
                minX = x;
            }
        }
        bw.write(minX + " " + minY);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
