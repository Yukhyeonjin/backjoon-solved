package com.solved.yuk.etc.bronze;


import java.io.*;

public class Bronze_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]),
             B = Long.parseLong(input[1]),
             C = Long.parseLong(input[2]);
        if(B >= C){
            bw.write("-1");
        }else {
            bw.write((A/(C-B))+1+"");
        }

        bw.flush();
        bw.close();
    }
}
