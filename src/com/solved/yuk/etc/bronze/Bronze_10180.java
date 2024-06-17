package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10180 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int D = Integer.parseInt(input[1]);
            int result = 0;
            for(int j = 0; j < N; j++){
                input = br.readLine().split(" ");
                double v = Double.parseDouble(input[0]);
                double f = Double.parseDouble(input[1]);
                double c = Double.parseDouble(input[2]);
                double dist = v * (f / c);
                if(dist >= D) result++;
            }
            bw.write(result+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

