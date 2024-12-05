package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32778 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" \\(");
        if(input.length == 1) bw.write(input[0]+"\n-");
        else {
            bw.write(input[0]+"\n");
            for (int i = 1; i < input.length-1;i++) {
                bw.write(input[1]+" ");
            }
            bw.write(input[input.length-1].substring(0,input[input.length-1].length()-1));
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
