package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13623 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int alice = Integer.parseInt(input[0]),
             beto = Integer.parseInt(input[1]),
            clara = Integer.parseInt(input[2]);
        if(alice == beto && beto == clara) bw.write("*");
        else if(alice == beto)  bw.write("C");
        else if(alice == clara) bw.write("B");
        else if(beto == clara)  bw.write("A");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

