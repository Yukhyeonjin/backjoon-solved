package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31746 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N % 2 == 0) bw.write("SciComLove");
        else bw.write("evoLmoCicS");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

