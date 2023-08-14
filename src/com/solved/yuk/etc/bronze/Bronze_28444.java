package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28444 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        bw.write((Integer.parseInt(input[0]) * Integer.parseInt(input[1])) - (Integer.parseInt(input[2]) * Integer.parseInt(input[3]) * Integer.parseInt(input[4])) + "");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}
