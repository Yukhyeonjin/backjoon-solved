package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), arr[];
        String input[];
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            arr = new int[input.length];
            for(int j = 0; j < input.length; j++){
                arr[j] = Integer.parseInt(input[j]);
            }
            Arrays.sort(arr);
            bw.write(arr[7]+"\n");
        }

        bw.flush();
        bw.close();
    }
}
