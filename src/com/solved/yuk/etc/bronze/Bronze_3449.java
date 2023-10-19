package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3449 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), distance;
        String x[], y[];
        for(int i = 0; i < T; i ++){
            x = br.readLine().split("");
            y = br.readLine().split("");
            distance = 0;
            for(int j = 0; j < x.length; j ++){
                if(!x[j].equals(y[j])) distance++;
            }
            bw.write("Hamming distance is " + distance+".\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

