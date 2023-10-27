package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23972 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        Long K = Long.parseLong(input[0]),
             N = Long.parseLong(input[1]);
        // (X - K)*N  <= X
        // (K*N)/(N-1) <= X
        if(N == 1) bw.write("-1");
        else {
            long X = (K * N) / (N - 1);
            if ((K * N) % (N - 1) != 0) {
                X++;
            }
            bw.write(X+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

