package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29738 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), N;
        for(int i = 0; i < T; i ++){
            N = Integer.parseInt(br.readLine());
            bw.write("Case #"+(i+1)+": ");
            if(N <= 25) bw.write("World Finals");
            else if(N <= 1000) bw.write("Round 3");
            else if(N <= 4500) bw.write("Round 2");
            else  bw.write("Round 1");
            bw.newLine();
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

