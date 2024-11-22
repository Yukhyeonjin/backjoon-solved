package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5751 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        while ((N = Integer.parseInt(br.readLine())) != 0) {
            String input[] = br.readLine().split(" ");
            int mary = 0, john = 0;
            for (int i = 0; i < N; i ++) {
                if("0".equals(input[i])) mary++;
                else john++;
            }
            bw.write(String.format("Mary won %d times and John won %d times\n", mary, john));
        }
        


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
