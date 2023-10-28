package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17284 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int total = 5000, use = 0;
        for(int i = 0; i < input.length; i++){
            if("1".equals(input[i])) use += 500;
            else if("2".equals(input[i])) use += 800;
            else if("3".equals(input[i])) use += 1000;
        }
        bw.write(total-use+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
