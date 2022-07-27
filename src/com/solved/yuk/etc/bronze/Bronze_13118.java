package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int p1 = Integer.parseInt(input[0]),
            p2 = Integer.parseInt(input[1]),
            p3 = Integer.parseInt(input[2]),
            p4 = Integer.parseInt(input[3]);

        input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]),
            y = Integer.parseInt(input[1]),
            z = Integer.parseInt(input[2]);
        if(x == p1) bw.write("1");
        else if(x == p2) bw.write("2");
        else if(x == p3) bw.write("3");
        else if(x == p4) bw.write("4");
        else bw.write("0");


        bw.flush();
        br.close();
        bw.close();
    }
}
