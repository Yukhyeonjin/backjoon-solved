package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]), person = 0;
            input = br.readLine().split(" ");
            for(int j = 0; j < N; j ++){
                int candy = Integer.parseInt(input[j]);
                if(candy / K > 0) person += candy / K;
            }
            bw.write(person+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
