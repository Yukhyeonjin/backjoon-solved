package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        for(int i = 0; i < L; i ++){
            String input[] = br.readLine().split(" ");
            int count = Integer.parseInt(input[0]);
            String str = input[1];
            for(int j = 0; j < count; j ++){
                bw.write(str);
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
