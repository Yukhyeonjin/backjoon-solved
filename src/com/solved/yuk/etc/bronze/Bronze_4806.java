package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4806 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        try {
            while (br.readLine() != null) {
                count++;
            }
        } catch (Exception e) {

        } finally {
            bw.write(count+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

