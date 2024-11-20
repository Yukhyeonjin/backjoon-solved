package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26940 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int preCho = Integer.parseInt(input[0]);
        int cnt = 0;
        for(int i = 0; i < N; i ++){
            int cho = Integer.parseInt(input[i]);
            if(cho > preCho) cnt++;
            preCho = cho;
        }
        bw.write(cnt+"");
        


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
