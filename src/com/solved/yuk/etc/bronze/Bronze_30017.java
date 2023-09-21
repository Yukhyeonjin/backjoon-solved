package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30017 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]), B = Integer.parseInt(input[1]);
        if(A > B) bw.write((B+B+1)+"");
        else bw.write((A+A-1)+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

