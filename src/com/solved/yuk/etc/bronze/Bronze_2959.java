package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int length[] = new int[input.length];
        for(int i = 0; i < input.length; i ++){
            length[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(length);
        bw.write(length[0]*length[2]+"");

        bw.flush();
        bw.close();
    }
}
