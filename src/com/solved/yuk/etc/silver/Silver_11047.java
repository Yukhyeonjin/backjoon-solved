package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]), coin[] = new int[N];
        for(int i = 0; i < N; i ++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i = N-1; i >= 0; i --){
            if(K / coin[i] > 0){
                count += K / coin[i];
                K = K % coin[i];
            }
            if (K == 0) break;
        }
        bw.write(count+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
