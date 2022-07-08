package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            K = Integer.parseInt(input[1]), count = 0, result = 0;

        for(int i = 1; i <= N; i ++){
            if(N % i == 0) count++;
            if(count == K) {
                result = i;
                break;
            }
        }
        bw.write(result+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
