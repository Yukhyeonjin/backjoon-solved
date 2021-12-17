package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        int sum = 0;
        for(int i = 0; i < input.length; i ++){
            int num = Integer.parseInt(input[i]),
                powNum = (int)Math.pow(num,5);
            sum+=powNum;
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
