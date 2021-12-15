package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input;
        int sum;
        for(int i = 0; i < N; i ++){
            input = br.readLine().split(" ");
            sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            if(sum >= 2 && sum <= 51 ){
                sum --;
            } else if(sum < 2) sum = 50;
            else if(sum >51) sum = 1;
            bw.write(sum+"\n");
        }

        bw.flush();
        bw.close();
    }
}
