package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int sumScore = Integer.parseInt(input[0]),
                minusScore = Integer.parseInt(input[1]);
        if((sumScore - minusScore) < 0){
            bw.write("-1");
        }else {
            if ((sumScore-minusScore) % 2 == 0){
                bw.write((sumScore-minusScore)/2 + minusScore + " " + (sumScore-minusScore)/2);
            }else {
                bw.write("-1");
            }
        }

        bw.flush();
        bw.close();
    }
}
