package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27541 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        if(input.charAt(N-1) == 'G') bw.write(input.substring(0,N-1));
        else bw.write(input+"G");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

