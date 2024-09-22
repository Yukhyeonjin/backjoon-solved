package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6889 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String x[] = new String[n];
        for (int i = 0; i < n; i ++){
            x[i] = br.readLine();
        }
        String y[] = new String[m];
        for (int i = 0; i < m; i ++){
            y[i] = br.readLine();
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                bw.write(x[i] + " as " + y[j]);
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}