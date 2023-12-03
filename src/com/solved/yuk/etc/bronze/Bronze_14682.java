package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14682 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine()), sum = 0;
        if(k != 0){
            for(int i = 0; i <= k; i ++){
                sum += Math.pow(10,i) * N;
            }
        }else sum = N;
        bw.write(sum+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
