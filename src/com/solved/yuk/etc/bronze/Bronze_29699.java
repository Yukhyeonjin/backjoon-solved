package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29699 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String label = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(label.charAt((N-1)%label.length())));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

