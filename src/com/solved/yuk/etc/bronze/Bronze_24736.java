package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < 2; i ++){
            String input[] = br.readLine().split(" ");
            bw.write ((Integer.parseInt(input[0]) * 6 + Integer.parseInt(input[1]) * 3 + Integer.parseInt(input[2]) * 2 + Integer.parseInt(input[3]) + Integer.parseInt(input[4]) * 2)+" ");
        }



        br.close();
        bw.flush();
        bw.close();
    }
}
