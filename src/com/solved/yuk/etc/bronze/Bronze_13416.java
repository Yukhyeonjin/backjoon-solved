package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            int N = Integer.parseInt(br.readLine()),
                sum = 0;
            for(int j = 0; j < N; j ++){
                String input[] = br.readLine().split(" ");
                int max = -1000001;
                max = Math.max(max, Math.max(Integer.parseInt(input[0]), Math.max(Integer.parseInt(input[1]),Integer.parseInt(input[2]))));
                if( max >= 0) sum+=max;
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
