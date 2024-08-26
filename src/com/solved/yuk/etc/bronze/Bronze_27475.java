package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27475 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            String input[] = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int bottom[] = new int[n];
            int left[] = new int[m];

            input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                bottom[j] =  Integer.parseInt(input[j]);
            }
            input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                left[j] =  Integer.parseInt(input[j]);
            }
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k= 0; k < m; k++) {
                    if(bottom[j] == left[k]) cnt++;
                }
            }
            bw.write(cnt+"\n");
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
