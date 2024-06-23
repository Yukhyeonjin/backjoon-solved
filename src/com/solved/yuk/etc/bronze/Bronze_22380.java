package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_22380 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        String input[];
        int N, M, sum;
        while (!"0 0".equals(line = br.readLine())) {
            input = line.split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);

            input = br.readLine().split(" ");
            sum = 0;
            for (int i = 0; i < N; i ++){
                if(Integer.parseInt(input[i]) >= M/N) {
                    sum += M/N;
                }
                else {
                    sum += Integer.parseInt(input[i]);
                }
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

