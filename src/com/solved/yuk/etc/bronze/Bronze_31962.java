package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31962 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        int startMax = -1;
        for (int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            int S = Integer.parseInt(input[0]);
            int T = Integer.parseInt(input[1]);
            if(S+T <= X) {
                startMax = Math.max(S,startMax);
            }
        }
        bw.write(startMax+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

