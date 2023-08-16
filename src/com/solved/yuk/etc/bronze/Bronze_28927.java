package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28927 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int t1 = Integer.parseInt(input[0])*3,
            e1 = Integer.parseInt(input[1])*20,
            f1 = Integer.parseInt(input[2])*120,
            Max = t1 + e1 + f1;
        input = br.readLine().split(" ");
        int t2 = Integer.parseInt(input[0])*3,
            e2 = Integer.parseInt(input[1])*20,
            f2 = Integer.parseInt(input[2])*120,
            Mel = t2 + e2 + f2;
        if(Max > Mel) bw.write("Max");
        else if(Max < Mel) bw.write("Mel");
        else bw.write("Draw");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

