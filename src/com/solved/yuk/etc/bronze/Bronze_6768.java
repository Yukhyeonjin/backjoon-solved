package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6768 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int J = Integer.parseInt(br.readLine());
        // (J-1)C3 : 조합
        bw.write(((J-1) * (J-2) * (J-3) / 6)+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

